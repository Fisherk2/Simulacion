/*
 * NOMBRE: Fisher
 * FECHA: 10/10/22
 * PROYECTO: SIMULACION
 */
package NumerosAleatorios;

import javax.swing.JOptionPane;

/**
 * Clase que prueba los diferentes tipos de generadores de numeros aleatorios.
 *
 * @author Fisherk2
 */
public class MainRandom {

    int n, a, c,m,xn;

    public static void main(String[] args) {
        new MainRandom().congruencialMix(); //MIXTA LINEAL

    }

    private void congruencialMix() {
        //Parametros de la funcion
        n = Integer.parseInt(JOptionPane.showInputDialog("INGRESE N"));
        a = 81; 
        c = 89;
        m=100;
        xn = 94; //x0
        
        for (int i = 0; i < n; i++) {
            System.out.println(i + ".- " + xn);
            xn = ((a * xn) + c) % m;
        }

    }

}
