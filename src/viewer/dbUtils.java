package viewer;

import org.sqlite.SQLiteDataSource;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;

public class dbUtils {

    public static SQLiteDataSource dbInit(String filename, JComboBox<String> combo) {
        if (!new File(filename).exists()) {
            JOptionPane.showMessageDialog(new Frame(), "File doesn't exist!");
            return null;
        }
        String url = "jdbc:sqlite:./%s".formatted(filename);
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);

        try (Connection con = dataSource.getConnection()) {

            try (PreparedStatement ps = con.prepareStatement("SELECT name FROM sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%';")) {
                try (ResultSet rs = ps.executeQuery()) {
                    combo.removeAllItems();
                    while (rs.next()) {
                        combo.addItem(rs.getString("name"));
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }

    public static TableModel fetchTable(SQLiteDataSource db, String text) {
        ArrayList<String> columns = new ArrayList<>();
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection con = db.getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(text)) {
                try (ResultSet rs = ps.executeQuery()) {
                    ResultSetMetaData rsMetaData = rs.getMetaData();
                    for (int i = 0; i < rsMetaData.getColumnCount(); i++) {
                        columns.add(rsMetaData.getColumnName(i + 1));
                    }
                    while (rs.next()) {
                        ArrayList<Object> row = new ArrayList<>();
                        for (int i = 0; i < rsMetaData.getColumnCount(); i++) {
                            row.add(rs.getObject(i + 1));
                        }
                        data.add(row.toArray());
                    }

                } catch (SQLException e) {
                    throw e;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(new Frame(), e.getMessage());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new DefaultTableModel(data.toArray(new Object[0][]), columns.toArray());
    }
}
