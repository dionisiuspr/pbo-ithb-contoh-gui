/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselistener;

import java.awt.HeadlessException;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author UX430UN
 */
public class MyFrame extends JFrame {

    public MyFrame() {
        initComponents();
    }

    public void initComponents() {
        this.setTitle("MouseEventDemo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new MouseEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        this.setContentPane(newContentPane);

        //Display the window.
        this.pack();
    }

    public static void main(String[] args) {
        new MyFrame().setVisible(true);
    }

}
