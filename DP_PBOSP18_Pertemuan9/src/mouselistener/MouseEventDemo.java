/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselistener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author UX430UN
 */
public class MouseEventDemo extends JPanel implements MouseListener {

    BlankArea blankArea;
    JTextArea textArea;
    static final String NEWLINE = System.getProperty("line.separator");

    public MouseEventDemo() {
        super(new GridLayout(0, 1));
        blankArea = new BlankArea(Color.YELLOW);
        add(blankArea);
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(200, 75));
        add(scrollPane);

        //Register for mouse events on blankArea and the panel.
        blankArea.addMouseListener(this);
        addMouseListener(this);
        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    void eventOutput(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " detected on "
                + e.getComponent().getClass().getName()
                + "." + NEWLINE);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public void mousePressed(MouseEvent e) {
        eventOutput("Mouse pressed (# of clicks: "
                + e.getClickCount() + ")", e);
    }

    public void mouseReleased(MouseEvent e) {
        eventOutput("Mouse released (# of clicks: "
                + e.getClickCount() + ")", e);
    }

    public void mouseEntered(MouseEvent e) {
        eventOutput("Mouse entered", e);
    }

    public void mouseExited(MouseEvent e) {
        eventOutput("Mouse exited", e);
    }

    public void mouseClicked(MouseEvent e) {
        eventOutput("Mouse clicked (# of clicks: "
                + e.getClickCount() + ")", e);
    }
}
