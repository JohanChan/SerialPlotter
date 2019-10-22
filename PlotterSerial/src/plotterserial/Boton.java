/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package plotterserial;


public class Boton extends javax.swing.JButton{

    public Boton(int x, int y, int ancho, int altura){
        this.setBounds(x, y, ancho, altura);
        setEnabled(false);
    }
}