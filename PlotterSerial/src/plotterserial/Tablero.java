/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package plotterserial;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Tablero {

    public Tablero(String nombre) {
        this.nombre=nombre;
    }
    Boton[][] tablero;
    public String nombre;
    public Tablero(javax.swing.JPanel panel) {
        this.crearTablero(panel);
        pintarBloques();
        this.pintarTablero(panel);

    }
    int filas = 8;
    int columnas = 17;

    public void crearTablero(javax.swing.JPanel panel) {
        tablero = new Boton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Boton((i * panel.getWidth()) / filas, (j * panel.getHeight()) / columnas, (panel.getWidth()) / filas, (panel.getHeight()) / columnas);
                tablero[i][j].setToolTipText(i + "," + j);
                tablero[i][j].setBackground(Color.WHITE);
            }
        }
    }

    public void pintarTablero(javax.swing.JPanel panel) {
        panel.removeAll();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                panel.add(tablero[i][j]);
            }
        }
        panel.repaint();
        panel.updateUI();
    }
    int Px;
    int Py;

    public void pintarBloques() {

    }

    public void pintarCirculo() {
        tablero[3][1].setBackground(Color.BLACK);
        tablero[4][1].setBackground(Color.BLACK);
        tablero[2][2].setBackground(Color.BLACK);
        tablero[2][3].setBackground(Color.BLACK);
        tablero[1][4].setBackground(Color.BLACK);
        tablero[1][5].setBackground(Color.BLACK);
        tablero[0][6].setBackground(Color.BLACK);
        tablero[0][7].setBackground(Color.BLACK);
        tablero[1][8].setBackground(Color.BLACK);
        tablero[1][9].setBackground(Color.BLACK);
        tablero[2][10].setBackground(Color.BLACK);
        tablero[2][11].setBackground(Color.BLACK);
        tablero[4][12].setBackground(Color.BLACK);
        tablero[3][12].setBackground(Color.BLACK);
        tablero[5][10].setBackground(Color.BLACK);
        tablero[5][11].setBackground(Color.BLACK);
        tablero[6][8].setBackground(Color.BLACK);
        tablero[6][9].setBackground(Color.BLACK);
        tablero[7][7].setBackground(Color.BLACK);
        tablero[7][6].setBackground(Color.BLACK);
        tablero[6][4].setBackground(Color.BLACK);
        tablero[6][5].setBackground(Color.BLACK);
        tablero[5][2].setBackground(Color.BLACK);
        tablero[5][3].setBackground(Color.BLACK);
    }

    public void pintarTriangulo() {
        tablero[3][1].setBackground(Color.BLACK);
        tablero[3][2].setBackground(Color.BLACK);
        tablero[4][1].setBackground(Color.BLACK);
        tablero[4][2].setBackground(Color.BLACK);
        tablero[2][4].setBackground(Color.BLACK);
        tablero[2][3].setBackground(Color.BLACK);
        tablero[1][6].setBackground(Color.BLACK);
        tablero[1][5].setBackground(Color.BLACK);
        tablero[6][5].setBackground(Color.BLACK);
        tablero[0][7].setBackground(Color.BLACK);
        tablero[0][8].setBackground(Color.BLACK);
        tablero[1][8].setBackground(Color.BLACK);
        tablero[2][8].setBackground(Color.BLACK);
        tablero[3][8].setBackground(Color.BLACK);
        tablero[4][8].setBackground(Color.BLACK);
        tablero[5][8].setBackground(Color.BLACK);
        tablero[6][8].setBackground(Color.BLACK);
        tablero[7][8].setBackground(Color.BLACK);
        tablero[7][7].setBackground(Color.BLACK);
        tablero[6][6].setBackground(Color.BLACK);
        tablero[6][5].setBackground(Color.BLACK);
        tablero[5][3].setBackground(Color.BLACK);
        tablero[5][4].setBackground(Color.BLACK);
    }

    public void pintarEstrella() {
        tablero[3][1].setBackground(Color.BLACK);
        tablero[4][1].setBackground(Color.BLACK);

        tablero[2][2].setBackground(Color.BLACK);
        tablero[2][3].setBackground(Color.BLACK);

        tablero[1][4].setBackground(Color.BLACK);
        tablero[1][5].setBackground(Color.BLACK);
        tablero[1][6].setBackground(Color.BLACK);

        tablero[0][4].setBackground(Color.BLACK);
        tablero[0][7].setBackground(Color.BLACK);

        tablero[0][8].setBackground(Color.BLACK);
        tablero[1][8].setBackground(Color.BLACK);

        tablero[2][8].setBackground(Color.BLACK);
        tablero[5][8].setBackground(Color.BLACK);

        tablero[3][7].setBackground(Color.BLACK);
        tablero[4][7].setBackground(Color.BLACK);

        tablero[6][8].setBackground(Color.BLACK);
        tablero[7][8].setBackground(Color.BLACK);

        tablero[6][8].setBackground(Color.BLACK);
        tablero[7][8].setBackground(Color.BLACK);

        tablero[7][7].setBackground(Color.BLACK);
        tablero[6][5].setBackground(Color.BLACK);
        tablero[6][6].setBackground(Color.BLACK);

        tablero[6][4].setBackground(Color.BLACK);
        tablero[7][4].setBackground(Color.BLACK);

        tablero[5][2].setBackground(Color.BLACK);
        tablero[5][3].setBackground(Color.BLACK);
    }
}

