/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ContohJTextField extends JFrame {

    JLabel nama = new JLabel("NAMA  :  ");
    JTextField namaValue = new JTextField(10);
    JButton submit = new JButton("Submit");

    public ContohJTextField() {
        super("Text Field");
        setSize(300, 100);

        JPanel p1 = new JPanel();
        p1.add(nama);
        p1.add(namaValue);

        getContentPane().add("North", p1);
        getContentPane().add("South", submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nama = namaValue.getText();
                JOptionPane.showMessageDialog(null,
                        "Selamat Datang " + nama);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContohJTextField();

    }

}
