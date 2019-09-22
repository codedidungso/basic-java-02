/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 *
 * @author thiennd
 */
public class Testing extends JFrame implements MouseListener {

    public Testing() {
        setSize(500, 500);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new Testing().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("click:" + e.getX() + ":" + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("press:" + e.getX() + ":" + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("release:" + e.getX() + ":" + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("enter:" + e.getX() + ":" + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exit:" + e.getX() + ":" + e.getY());
    }

}
