/*
 * Created by JFormDesigner on Fri Mar 01 23:29:40 ACDT 2024
 */

package viewer;

import java.awt.event.*;
import javax.swing.table.*;

import org.sqlite.SQLiteDataSource;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author james
 */
public class SQLiteViewer extends JFrame {
    SQLiteDataSource db;

    public SQLiteViewer() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void OpenFile(ActionEvent e) {
        db = dbUtils.dbInit(FileNameTextField.getText(), TablesComboBox);
        if (db == null) {
            TablesComboBox.setEnabled(false);
            QueryTextArea.setEnabled(false);
            ExecuteQueryButton.setEnabled(false);
        } else {
            TablesComboBox.setEnabled(true);
            QueryTextArea.setEnabled(true);
            ExecuteQueryButton.setEnabled(true);
        }
    }

    private void Tables(ActionEvent e) {
        QueryTextArea.setText("SELECT * FROM %s;".formatted(TablesComboBox.getSelectedItem()));
    }

    private void ExecuteQuery(ActionEvent e) {
        Table.setModel(dbUtils.fetchTable(db, QueryTextArea.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - James Taylour
        MainPanel = new JPanel();
        topPanel = new JPanel();
        TextFieldLabel = new JLabel();
        FileNameTextField = new JTextField();
        OpenFileButton = new JButton();
        comboLabel = new JLabel();
        TablesComboBox = new JComboBox();
        querylabel = new JLabel();
        ExecuteQueryButton = new JButton();
        QueryTextArea = new JTextArea();
        scrollPane1 = new JScrollPane();
        Table = new JTable();

        //======== this ========
        setTitle("SQLite Viewer"); //NON-NLS
        setMinimumSize(new Dimension(800, 500));
        setVisible(true);
        setName("this"); //NON-NLS
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(3, 3));

        //======== MainPanel ========
        {
            MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            MainPanel.setName("MainPanel"); //NON-NLS
            MainPanel.setLayout(new BorderLayout());

            //======== topPanel ========
            {
                topPanel.setName("topPanel"); //NON-NLS
                topPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)topPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)topPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
                ((GridBagLayout)topPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)topPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                //---- TextFieldLabel ----
                TextFieldLabel.setText("Database:"); //NON-NLS
                TextFieldLabel.setLabelFor(FileNameTextField);
                TextFieldLabel.setName("TextFieldLabel"); //NON-NLS
                topPanel.add(TextFieldLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- FileNameTextField ----
                FileNameTextField.setName("FileNameTextField"); //NON-NLS
                topPanel.add(FileNameTextField, new GridBagConstraints(1, 0, 1, 1, 2.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- OpenFileButton ----
                OpenFileButton.setText("Open"); //NON-NLS
                OpenFileButton.setName("OpenFileButton"); //NON-NLS
                OpenFileButton.addActionListener(e -> OpenFile(e));
                topPanel.add(OpenFileButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- comboLabel ----
                comboLabel.setText("Table:"); //NON-NLS
                comboLabel.setLabelFor(TablesComboBox);
                comboLabel.setName("comboLabel"); //NON-NLS
                topPanel.add(comboLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- TablesComboBox ----
                TablesComboBox.setName("TablesComboBox"); //NON-NLS
                TablesComboBox.addActionListener(e -> Tables(e));
                topPanel.add(TablesComboBox, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- querylabel ----
                querylabel.setText("Query:"); //NON-NLS
                querylabel.setName("querylabel"); //NON-NLS
                topPanel.add(querylabel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- ExecuteQueryButton ----
                ExecuteQueryButton.setText("Execute"); //NON-NLS
                ExecuteQueryButton.setEnabled(false);
                ExecuteQueryButton.setName("ExecuteQueryButton"); //NON-NLS
                ExecuteQueryButton.addActionListener(e -> ExecuteQuery(e));
                topPanel.add(ExecuteQueryButton, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- QueryTextArea ----
                QueryTextArea.setMinimumSize(new Dimension(5, 66));
                QueryTextArea.setPreferredSize(new Dimension(5, 66));
                QueryTextArea.setEnabled(false);
                QueryTextArea.setName("QueryTextArea"); //NON-NLS
                topPanel.add(QueryTextArea, new GridBagConstraints(1, 2, 1, 1, 0.0, 2.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            }
            MainPanel.add(topPanel, BorderLayout.NORTH);

            //======== scrollPane1 ========
            {
                scrollPane1.setBorder(new TitledBorder("Results")); //NON-NLS
                scrollPane1.setName("scrollPane1"); //NON-NLS

                //---- Table ----
                Table.setAutoCreateRowSorter(true);
                Table.setBorder(null);
                Table.setName("Table"); //NON-NLS
                scrollPane1.setViewportView(Table);
            }
            MainPanel.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(MainPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - James Taylour
    private JPanel MainPanel;
    private JPanel topPanel;
    private JLabel TextFieldLabel;
    private JTextField FileNameTextField;
    private JButton OpenFileButton;
    private JLabel comboLabel;
    private JComboBox TablesComboBox;
    private JLabel querylabel;
    private JButton ExecuteQueryButton;
    private JTextArea QueryTextArea;
    private JScrollPane scrollPane1;
    private JTable Table;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
