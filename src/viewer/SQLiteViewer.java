/*
 * Created by JFormDesigner on Fri Mar 01 23:29:40 ACDT 2024
 */

package viewer;

import java.awt.*;
import javax.swing.*;

/**
 * @author james
 */
public class SQLiteViewer extends JFrame {
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - James Taylour
        topPanel = new JPanel();
        TextFieldLabel = new JLabel();
        FileNameTextField = new JTextField();
        OpenFileButton = new JButton();
        comboLabel = new JLabel();
        TablesComboBox = new JComboBox();
        querylabel = new JLabel();
        ExecuteQueryButton = new JButton();
        QueryTextArea = new JTextArea();

        //======== this ========
        setTitle("SQLite Viewer"); //NON-NLS
        setMinimumSize(new Dimension(800, 500));
        setVisible(true);
        setName("this"); //NON-NLS
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(3, 3));

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
            ExecuteQueryButton.setName("ExecuteQueryButton"); //NON-NLS
            topPanel.add(ExecuteQueryButton, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- QueryTextArea ----
            QueryTextArea.setMinimumSize(new Dimension(5, 66));
            QueryTextArea.setPreferredSize(new Dimension(5, 66));
            QueryTextArea.setName("QueryTextArea"); //NON-NLS
            topPanel.add(QueryTextArea, new GridBagConstraints(1, 2, 1, 1, 0.0, 2.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        }
        contentPane.add(topPanel, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - James Taylour
    private JPanel topPanel;
    private JLabel TextFieldLabel;
    private JTextField FileNameTextField;
    private JButton OpenFileButton;
    private JLabel comboLabel;
    private JComboBox TablesComboBox;
    private JLabel querylabel;
    private JButton ExecuteQueryButton;
    private JTextArea QueryTextArea;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
