package gui;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import javax.imageio.ImageIO;
import javax.swing.*;
import newpackage.Kirito;

public class FrameExample extends JFrame {

    private Kirito lblKirito;

    public FrameExample() {
        initComponets();
    }

    private void initComponets() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(400, 500);
        setLocationRelativeTo(null);

        getContentPane().setBackground(Color.GREEN);
        setTitle("My Frame");

        getContentPane().setLayout(null);

        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(400, 200);
        pnlPanel1.setBackground(Color.MAGENTA);
        add(pnlPanel1);

        lblMyLabel1 = new JLabel("Name ");
        pnlPanel1.add(lblMyLabel1);

        txtText1 = new JTextField(20);
        pnlPanel1.add(txtText1);

        lblIcon = new JLabel();
        lblIcon.setIcon(new ImageIcon(resizeImage("img/bird.png")));
        pnlPanel1.add(lblIcon);

        rbtnFemale = new JRadioButton("Female");
        pnlPanel1.add(rbtnFemale);

        rbtnMale = new JRadioButton("Male");
        pnlPanel1.add(rbtnMale);

        rbtnGroup1 = new ButtonGroup();
        rbtnGroup1.add(rbtnMale);
        rbtnGroup1.add(rbtnFemale);

        btnSubmit = new JButton("Submit");
        btnSubmit.setPreferredSize(new Dimension(300, 20));
        pnlPanel1.add(btnSubmit);

        js1 = new JSeparator(JSeparator.HORIZONTAL);
        js1.setBounds(0, 205, 400, 500);
        add(js1);

        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(Color.CYAN);
        pnlPanel2.setBounds(0, 210, 400, 100);
        add(pnlPanel2);

        cbOpsi1 = new JCheckBox("Opsi 1");
        cbOpsi2 = new JCheckBox("Opsi 2");
        cbOpsi3 = new JCheckBox("Opsi 3");
        cbOpsi4 = new JCheckBox("Opsi 4");

        pnlPanel2.add(cbOpsi1);
        pnlPanel2.add(cbOpsi2);
        pnlPanel2.add(cbOpsi3);
        pnlPanel2.add(cbOpsi4);

        Object[] arrPilih = {"Teknik Informatika", "Teknik Kimia",
            "Teknik Elektro", "Teknik Sipil"};
        cbbPilihan = new JComboBox(arrPilih);
        pnlPanel2.add(cbbPilihan);

        pnlPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlPanel3.setBackground(Color.YELLOW);
        pnlPanel3.setBounds(0, 310, 400, 200);
        add(pnlPanel3);

        lblMyLabel2 = new JLabel("<html>Masukkan Saran : <br> (Opsional)<html>");
        pnlPanel3.add(lblMyLabel2);

        txtaSaran = new JTextArea(5, 20);
        pnlPanel3.add(txtaSaran);

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
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            e.printStackTrace(System.err);
        }
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
