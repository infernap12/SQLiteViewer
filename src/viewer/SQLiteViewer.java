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
            ((GridBagLayout)topPanel.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)topPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)topPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- TextFieldLabel ----
            TextFieldLabel.setText("Database:"); //NON-NLS
            TextFieldLabel.setName("TextFieldLabel"); //NON-NLS
            topPanel.add(TextFieldLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- FileNameTextField ----
            FileNameTextField.setName("FileNameTextField"); //NON-NLS
            topPanel.add(FileNameTextField, new GridBagConstraints(1, 0, 1, 1, 2.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- OpenFileButton ----
            OpenFileButton.setText("Open"); //NON-NLS
            OpenFileButton.setName("OpenFileButton"); //NON-NLS
            topPanel.add(OpenFileButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.EAST, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 0, 0));
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
