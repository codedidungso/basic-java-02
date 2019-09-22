/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesokuban;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author thiennd
 */
public class GameSokuban extends JFrame implements KeyListener {

    /**
     * @param args the command line arguments
     */
    int moveCount = 0;
    int x_box = 2, y_box = 1;
    int x_man, y_man;
    int targetX = 3;
    int targetY = 3;

    int map[][] = {
        {0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 1, 0, 0, 1},
        {0, 0, 0, 2, 0},
        {0, 0, 0, 1, 0}
    };

    /*
    0 - free space 
    1 - block 
    2 - target
    3 - man
    4 - the box
     */
    public static void main(String[] args) {
        new GameSokuban().setVisible(true);
    }

    public GameSokuban() {
        setSize(500, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);
    }

    void manUp() {
        if (y_man == 0) {
            return;
        } else if (map[y_man - 1][x_man] == 1) {
            return;
        } else if (x_man == x_box && y_man - 1 == y_box) {
            if (!boxUp()) {
                return;
            }
        } else if (y_man == 0) {
            return;
        }
        y_man--;
        moveCount++;
    }

    void manDown() {
        if (y_man == map.length - 1) {
            return;
        } else if (map[y_man + 1][x_man] == 1) {
            return;
        } else if (x_man == x_box && y_man + 1 == y_box) {
            if (!boxDown()) {
                y_man++;
                return;
            }
        } else if (y_man == map.length - 1) {
            return;
        }
        y_man++;
        moveCount++;
    }

    void manLeft() {
        if (x_man == 0) {
            return;
        } else if (map[y_man][x_man - 1] == 1) {
            return;
        } else if (x_man - 1 == x_box && y_man == y_box) {
            if (!boxLeft()) {
                return;
            }
        } else if (x_man == 0) {
            return;
        }
        x_man--;
        moveCount++;
    }

    void manRight() {
        if (x_man == map.length - 1) {
            return;
        } else if (map[y_man][x_man + 1] == 1) {
            return;
        } else if (x_man + 1 == x_box && y_man == y_box) {
            if (!boxRight()) {
                return;
            }
        } else if (x_man == map.length - 1) {
            return;
        }
        x_man++;
        moveCount++;
    }

    boolean boxUp() {
        if (y_box == 0) {
            return false;
        } else if (map[y_box - 1][x_box] == 1) {
            return false;
        } else if (y_box > 0) {
            y_box--;
            return true;
        } else {
            return false;
        }
    }

    boolean boxDown() {
        if (y_box == map.length) {
            return false;
        } else if (map[y_box + 1][x_box] == 1) {
            return false;
        } else if (y_box > 0) {
            y_box++;
            return true;
        } else {
            return false;
        }
    }

    boolean boxLeft() {
        if (y_box == 0) {
            return false;
        }
        if (map[y_box][x_box - 1] == 1) {
            return false;
        }
        if (x_box > 0) {
            x_box--;
            return true;
        }
        return false;
    }

    boolean boxRight() {
        if (y_box == map.length) {
            return false;
        }
        if (map[y_box][x_box + 1] == 1) {
            return false;
        }
        if (x_box > 0) {
            x_box++;
            return true;
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                manUp();
                break;
            case KeyEvent.VK_DOWN:
                manDown();
                break;
            case KeyEvent.VK_LEFT:
                manLeft();
                break;
            case KeyEvent.VK_RIGHT:
                manRight();
                break;
        }
        System.out.println("Key pressed: " + e.getKeyChar() + "xman: " + x_man + "yman: " + y_man);
        if (x_box == targetX && y_box == targetY) {
            System.out.println("Chien thang");
            repaint();
            this.setEnabled(false);// stop the frame 

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void paint(Graphics graphic) {
        graphic.setColor(Color.gray);
        graphic.fillRect(0, 0, 600, 600);

        // draw map
        int padding = 50; // padding top and left 
        int blockSize = 70;

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map.length; x++) {
                // define color of each block 
                switch (map[y][x]) {
                    case 0:
                        graphic.setColor(Color.GREEN);  // free space (can move) 
                        break;
                    case 1:
                        graphic.setColor(Color.BLACK);  // block (can't move) 
                        break;
                    case 2:
                        graphic.setColor(Color.RED);    // target 
                        break;
                    default:
                        graphic.setColor(Color.yellow);
                        break;
                }

                graphic.fillRect(padding + x * blockSize, padding + y * blockSize, blockSize - 10, blockSize - 10);

            }
        }
        // draw Move Count 
        graphic.setColor(Color.RED);
        graphic.drawString("Move: " + moveCount, 400, 200);
        
        // draw the Sokuban man 
        graphic.setColor(Color.ORANGE);
        graphic.fillOval(padding + 5 + x_man * blockSize, padding + 5 + y_man * blockSize, blockSize - 20, blockSize - 20);
        
        // draw the box 
        graphic.setColor(Color.blue);
        graphic.fill3DRect(padding + 5 + x_box * blockSize, padding + 5 + y_box * blockSize, blockSize - 20, blockSize - 20, true);
        
        // if win draw string "You win" 
        if (x_box == targetX && y_box == targetY) {
            graphic.drawString("Ban chien thang", 200, 500);
        }

    }

}
