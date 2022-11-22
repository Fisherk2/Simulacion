/*
 * NOMBRE: Fisher
 * FECHA: 21/11/22
 * PROYECTO: SIMULACION
 */
package Agentes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Clase que muestra la ventana con todos los agentes interactuando entre si.
 *
 * @author Fisherk2
 */
public class Screen extends javax.swing.JFrame implements ActionListener {

    private final FondoImagen PANEL = new FondoImagen();
    private final ArrayList<JButton> BOTONES = new ArrayList<>();

    public Screen() {
        this.setContentPane(PANEL); //Colocamos la imagen al fondo de la ventana.
        initComponents();
        
        //Agentes que no podemos manipular sus estados directamente.
        bLED.setEnabled(false);
        bAspersor.setEnabled(false);
        bCell.setEnabled(false);
        bCamara.setEnabled(false);

        BOTONES.add(bAlarma);
        BOTONES.add(bAspersor);
        BOTONES.add(bCamara);
        BOTONES.add(bCell);
        BOTONES.add(bLDR);
        BOTONES.add(bLED);
        BOTONES.add(bPushB);
        BOTONES.add(bShumo);
        BOTONES.add(bSmov);
        BOTONES.add(bSprox);

        initEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLDR = new javax.swing.JButton();
        bLED = new javax.swing.JButton();
        bPushB = new javax.swing.JButton();
        bShumo = new javax.swing.JButton();
        bSmov = new javax.swing.JButton();
        bCell = new javax.swing.JButton();
        bAlarma = new javax.swing.JButton();
        bCamara = new javax.swing.JButton();
        bAspersor = new javax.swing.JButton();
        bSprox = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitor");
        setResizable(false);

        bLDR.setBackground(java.awt.Color.cyan);
        bLDR.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bLDR.setForeground(new java.awt.Color(0, 0, 0));
        bLDR.setText("LDR");

        bLED.setBackground(java.awt.Color.cyan);
        bLED.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bLED.setForeground(new java.awt.Color(0, 0, 0));
        bLED.setText("LED");

        bPushB.setBackground(java.awt.Color.cyan);
        bPushB.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bPushB.setForeground(new java.awt.Color(0, 0, 0));
        bPushB.setText("PushB");

        bShumo.setBackground(java.awt.Color.cyan);
        bShumo.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bShumo.setForeground(new java.awt.Color(0, 0, 0));
        bShumo.setText("S.Humo");

        bSmov.setBackground(java.awt.Color.cyan);
        bSmov.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bSmov.setForeground(new java.awt.Color(0, 0, 0));
        bSmov.setText("S.Mov");

        bCell.setBackground(java.awt.Color.cyan);
        bCell.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bCell.setForeground(new java.awt.Color(0, 0, 0));
        bCell.setText("Celular");

        bAlarma.setBackground(java.awt.Color.cyan);
        bAlarma.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bAlarma.setForeground(new java.awt.Color(0, 0, 0));
        bAlarma.setText("Alarma");

        bCamara.setBackground(java.awt.Color.cyan);
        bCamara.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bCamara.setForeground(new java.awt.Color(0, 0, 0));
        bCamara.setText("Camara");

        bAspersor.setBackground(java.awt.Color.cyan);
        bAspersor.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bAspersor.setForeground(new java.awt.Color(0, 0, 0));
        bAspersor.setText("Aspersor");

        bSprox.setBackground(java.awt.Color.cyan);
        bSprox.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bSprox.setForeground(new java.awt.Color(0, 0, 0));
        bSprox.setText("S.Prox");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bShumo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bSmov)
                            .addComponent(bLED))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAspersor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(bLDR)
                        .addGap(48, 48, 48)
                        .addComponent(bCamara)
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCell)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAlarma)
                                .addGap(335, 335, 335))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bPushB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSprox)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(bAspersor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bShumo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(bPushB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLDR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(bLED, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(bSprox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(bCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addComponent(bSmov, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(bAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                .addComponent(bCell, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlarma;
    private javax.swing.JButton bAspersor;
    private javax.swing.JButton bCamara;
    private javax.swing.JButton bCell;
    private javax.swing.JButton bLDR;
    private javax.swing.JButton bLED;
    private javax.swing.JButton bPushB;
    private javax.swing.JButton bShumo;
    private javax.swing.JButton bSmov;
    private javax.swing.JButton bSprox;
    // End of variables declaration//GEN-END:variables

    private void initEventos() {
        bAlarma.addActionListener(this);
        bAspersor.addActionListener(this);
        bCamara.addActionListener(this);
        bCell.addActionListener(this);
        bLDR.addActionListener(this);
        bLED.addActionListener(this);
        bPushB.addActionListener(this);
        bShumo.addActionListener(this);
        bSmov.addActionListener(this);
        bSprox.addActionListener(this);
    }

    /**
     * Metodo que cambia de color los botones dependiendo del estado de sus
     * agentes.
     *
     * @param b Boton que se selecciona.
     * @param estado Estado ACTUAL del agente.
     */
    private void swapColor(JButton b, boolean estado) {
        if (estado) {
            b.setBackground(Color.red);
            b.setForeground(Color.white);
        } else {
            b.setBackground(Color.cyan);
            b.setForeground(Color.black);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JButton boton : BOTONES) {
            if (e.getSource() == boton) {

                //CAMBIAR ESTADO DEL BOTON SELECCIONADO//
                //OBTENEMOS ESTADO DEPENDIENDO DEL BOTON SELECCIONADO//
                swapColor(boton, true); //ASIGNAMOS EL ESTADO EN EL METODO//

            }
        }
    }

    /**
     * Clase interna de Screen que nos sirve para poner un fondo al panel.
     */
    private class FondoImagen extends JPanel {

        private Image fondo;

        @Override
        public void paint(Graphics g) {
            fondo = new ImageIcon(getClass().getResource("/Agentes/isometrico.jpg")).getImage();

            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

}
