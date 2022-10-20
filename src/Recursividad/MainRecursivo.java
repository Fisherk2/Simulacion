/*
 * NOMBRE: Fisher
 * FECHA: 19/09/22
 * PROYECTO: SIMULACION
 */
package Recursividad;

import javax.swing.JOptionPane;

/**
 * Clase que prueba metodos recursivos personalizados
 *
 * @author Fisherk2
 */
public class MainRecursivo {

    private int entrada, x, y;

    public static void main(String[] el) {
        int seleccion;
        String[] botones = new String[]{"Numero PAR", "Funcion Elevada"};
        do {
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "RECURSIVIDAD", -1, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);

            switch (seleccion) {
                case 0:
                    new MainRecursivo().numeroPar();
                    break;
                case 1:
                    new MainRecursivo().funcionEl();
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null, "NOS VEMOS");
                    break;
            }
        } while (seleccion != -1);

    }

    private void numeroPar() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero que desea saber si es par o no"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero que desea saber si es par o no"));

        JOptionPane.showMessageDialog(null, "Los numeros " + x + " y " + y + " son par: " + par(x, y));

    }

    private void funcionEl() {
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor ENTERO de la funcion (Sea mayor a 0 de preferencia)"));
        for (int i = 0; i < entrada + 1; i++) {
            System.out.println("F(" + i + ")= " + elevar(i)
                    + "\n_______________________\n"); //VERIFICACION POR CONSOLA, solo numeros enteros positivos
        }
        JOptionPane.showMessageDialog(null, "El resultado de la funcion recursiva de " + entrada + "= " + elevar(entrada));
    }

    /**
     * Metodo recursivo donde la funcion es (x^x)/(x^[x-1]+x^[x-2])
     *
     * @param x
     * @return Valor de la funcion del parametro x.
     */
    private double elevar(int x) {
        double salida;
        if (x > 0) {
            salida = Math.pow(x, x) / Math.pow(x, elevar(x - 1) + elevar(x - 2));
            return salida;

        } else {
            return 0;
        }

    }

    /**
     * Metodo que saca numeros pares de dos entradas
     *
     * @param x
     * @param y
     * @return TRUE: Si es par; FALSE: Impar
     */
    private boolean par(int x, int y) {
        if ((x % 2) == 0 && (y % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
