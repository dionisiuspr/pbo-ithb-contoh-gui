package pertemuan9;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author UX430UN
 */
public class FrameTable extends JFrame {

    JTable tblMyTable;
    JScrollPane jScrollPane;

    public FrameTable() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GREEN);
        setTitle("My Frame");
        getContentPane().setLayout(null);
        setSize(400, 500);

        String[] arrTitle = {
            "Nim", "Nama", "IPK"
        };

        String[][] isiPerRow = {
            {"1109001", "Bokir", "3.0"},
            {"1109002", "Kincup", "3.3"},
            {"1109002", "Kincup", "3.3"},
            {"1109002", "Kincup", "3.3"},
            {"1109002", "Kincup", "3.3"}
        };

        tblMyTable = new JTable(isiPerRow, arrTitle);

        jScrollPane = new JScrollPane(tblMyTable);
        this.add(jScrollPane);

        jScrollPane.setLocation(0, 0);
        jScrollPane.setSize(new Dimension(200, 100));
    }

    public static void main(String[] args) {
        new FrameTable().setVisible(true);
    }
}