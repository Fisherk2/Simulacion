/*
 * NOMBRE: Fisher
 * FECHA: 30/08/22
 * PROYECTO: SIMULACION
 */
package Montecarlo;

import javax.swing.JOptionPane;

/**
 * Clase principal que prueba el metodo de Montecarlo
 *
 * @author Fisherk2
 */
public class MainPi {

    private double x, y, x2, yCirculo, relacion, aproximacion, intento;
    private int dentroCirculo;

    public static void main(String[] pi) {
        String[] botones = new String[]{"Intentos"};
        int seleccion = -1;
        do {
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "METODO MONTECARLO", -1, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);

            switch (seleccion) {
                case 0:
                    new MainPi().calcularIntentos();
                    break;
                case 1:
                    new MainPi().aproxPi();
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null, "NOS VEMOS");
                    break;
            }
        } while (seleccion == 0);

    }

    private void calcularIntentos() {
        dentroCirculo = 0;
        intento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de intentos para encontrar PI"));

        for (int i = 0; i < intento; i++) {
            x = Math.random();
            y = Math.random();
            yCirculo = Math.sqrt(1 - (x * x));
            if (yCirculo > y) {
                dentroCirculo++;
            }
        }
        relacion = dentroCirculo / intento;
        aproximacion = relacion * 4;
        JOptionPane.showMessageDialog(null, "VALOR APROXIMADO CON " + intento + " INTENTOS: " + aproximacion);
    }

    private void aproxPi() {
        aproximacion = 0;
        intento = 1;
        dentroCirculo = 0;
        while (aproximacion != 3.1416) {
            x = Math.random();
            y = Math.random();
            x2 = x * x;
            yCirculo = Math.sqrt(1 - x2);
            if (yCirculo > y) {
                dentroCirculo++;
            }

            relacion = dentroCirculo / intento;
            aproximacion = relacion * 4;
            System.out.println(aproximacion);
            intento++;
        }
    }

}
