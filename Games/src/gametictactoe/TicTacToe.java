/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametictactoe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author thiennd
 */
public class TicTacToe extends JFrame implements MouseListener {

    public final int PLAYER_1 = 1;
    public final int PLAYER_2 = 2;

    int map[][] = new int[3][3];
    int currentPLayer = PLAYER_1;
    boolean finish = false;

    public TicTacToe() {
        setSize(500, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new TicTacToe().setVisible(true);
    }

    
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (finish) {
            return;
        }
        int x = e.getX();
        int y = e.getY();
        System.out.println("Click at: " + x + ":" + y);
        if (100 < x && x < 190) {
            x = 0;
        } else if (200 < x && x < 290) {
            x = 1;
        } else if (300 < x && x < 390) {
            x = 2;
        } else {
            return;
        }
        if (100 < y && y < 190) {
            y = 0;
        } else if (200 < y && y < 290) {
            y = 1;
        } else if (300 < y && y < 390) {
            y = 2;
        } else {
            return;
        }

        if (map[x][y] == 0) {
            play(currentPLayer, x, y);
            Graphics g = this.getGraphics();
            if (currentPLayer == PLAYER_1) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.blue);
            }
            g.fillRect(x * 100 + 110, y * 100 + 110, 70, 70);
            System.out.println("PLAYER: " + currentPLayer);
            int re = checkMap(3 - currentPLayer, x, y);
            if (re != -1) {
                System.out.println("Winner: " + re);
                String winner = re == 1 ? "BLUE" : "RED";
                g.drawString("PLAYER " + winner + " WIN", 250, 450);
                finish = true;
            }

            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(map[i][j] + ":");
                }
                System.out.println("");
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.fillRect(i * 100 + 100, j * 100 + 100, 90, 90);
            }
        }
    }

    int checkMap(int player, int x, int y) {
        if (map[x][0] == map[x][1] && map[x][1] == map[x][2] && map[x][2] == player) {
            return player;
        }
        if (map[0][y] == map[1][y] && map[1][y] == map[2][y] && map[2][y] == player) {
            return player;
        }
        if (map[0][0] == map[1][1] && map[1][1] == map[2][2] && map[2][2] == player) {
            return player;
        }
        return -1;
    }

    int play(int player, int x, int y) {

        if (player == PLAYER_1) {
            if (map[x][y] == 0) {
                map[x][y] = PLAYER_1;
                currentPLayer = PLAYER_2;
                return 1;
            }
        } else if (player == PLAYER_2) {
            if (map[x][y] == 0) {
                map[x][y] = PLAYER_2;
                currentPLayer = PLAYER_1;
                return 1;
            }
        }

        return -1;
    }
}
