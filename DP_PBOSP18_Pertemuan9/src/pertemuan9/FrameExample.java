/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author UX430UN
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class FrameExample extends JFrame {


    public FrameExample() {
        initComponets();

    }

    private void initComponets() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        setSize(400, 500);
        setLocationRelativeTo(null);

        getContentPane().setBackground(Color.GREEN);
//        getContentPane().setBackground(new Color(255,255,255));
        setTitle("My Frame");

        getContentPane().setLayout(null);

        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(400, 200);
        pnlPanel1.setBackground(Color.MAGENTA);
        add(pnlPanel1);

        lblMyLabel1 = new JLabel("Name ");
        pnlPanel1.add(lblMyLabel1);

    }

    private Image resizeImage(String url) {
        Image dimg = null;
        try {
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(100, 80, Image.SCALE_SMOOTH);

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return dimg;
    }

    public static void main(String[] args) {

        new FrameExample().setVisible(true);
    }

    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JPanel pnlPanel3;
    private JTextField txtText1;
    private JLabel lblMyLabel1;
    private JLabel lblMyLabel2;
    private JLabel lblIcon;
    private JButton btnSubmit;
    private JRadioButton rbtnMale;
    private JRadioButton rbtnFemale;
    private ButtonGroup rbtnGroup1;
    private JSeparator js1;
    private JCheckBox cbOpsi1;
    private JCheckBox cbOpsi2;
    private JCheckBox cbOpsi3;
    private JCheckBox cbOpsi4;
    private JComboBox cbbPilihan;
    private JTextArea txtaSaran;

}
