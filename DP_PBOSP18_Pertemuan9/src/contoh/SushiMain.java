/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author UX430UN
 */
public class SushiMain extends JFrame {

    public SushiMain() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setTitle("My Frame");
        getContentPane().setLayout(null);
        setSize(500, 500);

        Sushi s = new Sushi();
        s.setIcon(new ImageIcon(resizeImage("img/sushi.png")));
        s.setBounds(0, 0, 50, 50);
        this.add(s);

        Thread t = new Thread(s);
        t.start();
        
        Sushi s2 = new Sushi();
        s2.setIcon(new ImageIcon(resizeImage("img/sushi.png")));
        s2.setBounds(0, 0, 50, 50);
        this.add(s2);

        Thread t2 = new Thread(s2);
        t2.start();
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
        
        new SushiMain().setVisible(true);

    }
}
