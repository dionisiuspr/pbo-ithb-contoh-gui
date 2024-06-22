/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseclick;

import contoh.Sushi;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author UX430UN
 */
public class MyFrame extends JFrame {

    public MyFrame() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setTitle("My Frame");
        getContentPane().setLayout(null);
        setSize(500, 500);

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 0, 500, 500);
        add(jPanel);

        JLabel s = new JLabel();
        s.setIcon(new ImageIcon(resizeImage("img/sushi.png")));
        s.setBounds(0, 0, 50, 50);
        jPanel.add(s);

        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("clicked " + x);
                System.out.println("clicked " + y);
                s.setLocation(x, y);

                repaint();

            }

        });

    }

    private Image resizeImage(String url) {
        Image dimg = null;
        try {
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return dimg;
    }

    public static void main(String[] args) {
        new MyFrame().setVisible(true);
    }

}
