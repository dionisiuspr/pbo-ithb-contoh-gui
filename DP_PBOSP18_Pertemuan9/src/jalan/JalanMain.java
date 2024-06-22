/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalan;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class JalanMain extends JFrame {

    public JalanMain() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setTitle("My Frame");
        getContentPane().setLayout(null);
        setSize(1000, 500);

        Sushi s = new Sushi(true);
        s.setIcon(new ImageIcon(resizeImage("img/sushi.png")));
        s.setBounds(0, 0, 50, 50);
        this.add(s);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("masuk!!");
                int x = s.getX();
                int y = s.getY();
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP: {
                        y -= 10;
                        s.status = false;
                        break;
                    }
                    case KeyEvent.VK_DOWN: {
                        y += 10;
                        s.status = false;
                        break;
                    }
                    case KeyEvent.VK_LEFT: {
                        x += 10;
                        s.status = true;
                        break;
                    } 
                    default:
                        break;
                }
                s.setLocation(x, y);
            }
        });

        Thread t = new Thread(s);
        t.start();
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

        new JalanMain().setVisible(true);

    }
}
