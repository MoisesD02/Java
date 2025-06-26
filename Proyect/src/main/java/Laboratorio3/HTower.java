
package Laboratorio3;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HTower extends javax.swing.JFrame {

    private final ArrayList<JPanel> discos;
    
    
    public HTower() {
        this.discos = new ArrayList<>();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        init = new javax.swing.JButton();
        torre1 = new javax.swing.JPanel();
        torre2 = new javax.swing.JPanel();
        torre3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Ing = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        longitud = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(0, 51, 51));
        principal.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa la cantidad de discos");
        jLabel1.setToolTipText("");
        principal.add(jLabel1);
        jLabel1.setBounds(107, 26, 220, 24);

        init.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        init.setText("Iniciar");
        init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initActionPerformed(evt);
            }
        });
        principal.add(init);
        init.setBounds(350, 440, 90, 31);

        torre1.setBackground(new java.awt.Color(102, 102, 102));
        principal.add(torre1);
        torre1.setBounds(210, 190, 10, 200);

        torre2.setBackground(new java.awt.Color(102, 102, 102));
        torre2.setLayout(null);
        principal.add(torre2);
        torre2.setBounds(360, 190, 10, 200);

        torre3.setBackground(new java.awt.Color(102, 102, 102));
        torre3.setLayout(null);
        principal.add(torre3);
        torre3.setBounds(520, 190, 10, 200);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        principal.add(jPanel4);
        jPanel4.setBounds(130, 390, 490, 22);

        Ing.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Ing.setText("Ingresar");
        Ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngActionPerformed(evt);
            }
        });
        principal.add(Ing);
        Ing.setBounds(540, 20, 100, 31);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Maximo 5)");
        principal.add(jLabel2);
        jLabel2.setBounds(337, 32, 61, 16);

        longitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        principal.add(longitud);
        longitud.setBounds(425, 29, 80, 22);

        jButton9.setBackground(new java.awt.Color(255, 0, 51));
        jButton9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton9.setText("Regresar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        principal.add(jButton9);
        jButton9.setBounds(10, 470, 80, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngActionPerformed
        
        
        try {
                int tam = Integer.parseInt(longitud.getText());
                if (tam > 0 && tam <= 5) {
                    longitud.setEditable(false);
                    Ing.setEnabled(false);

                    crearDiscos(tam, torre1);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresa un número mayor a 0 y menor que 5");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido");
            }
        
    }//GEN-LAST:event_IngActionPerformed

    private void initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initActionPerformed
        
        int numDiscos = Integer.parseInt(longitud.getText());
        
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
        @Override
        protected Void doInBackground() throws Exception {
            moverDiscos(numDiscos,  torre1, torre2, torre3);
            return null;
        }

        @Override
        protected void done() {
            init.setEnabled(true);
        }
    };
    worker.execute();
        
        
    }//GEN-LAST:event_initActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        GuiaRec or = new GuiaRec();
        or.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void crearDiscos(int numDiscos, JPanel torreInicial) {
        
    int baseX = torreInicial.getX() + torreInicial.getWidth() / 2;
    int baseY = torreInicial.getY() + torreInicial.getHeight();
    int discoAltura = 20; 

    for (int i = 0; i < numDiscos; i++) {
        int discoAncho = 50 + (numDiscos - i - 1) * 20;
        JPanel disco = new JPanel();
        disco.setBackground(new Color((int) (Math.random() * 0xFFFFFF)));
        disco.setBounds(baseX - discoAncho / 2, baseY - (i + 1) * discoAltura, discoAncho, discoAltura);
        
        discos.add(disco);
        principal.add(disco);
    }

    principal.revalidate();
    principal.repaint();
}
    
    private void moverDiscos(int numDiscos, JPanel torreInicial, JPanel torreAuxiliar, JPanel torreFinal) {
        
    if (numDiscos == 1) {
        try {
            moverDisco(torreInicial, torreFinal);
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(HTower.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        try {
            moverDiscos(numDiscos - 1, torreInicial, torreFinal, torreAuxiliar);
            
            moverDisco(torreInicial, torreFinal);
            
            Thread.sleep(500);
            
            moverDiscos(numDiscos - 1, torreAuxiliar, torreInicial, torreFinal);
        } catch (InterruptedException ex) {
            Logger.getLogger(HTower.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    private void moverDisco(JPanel torreOrigen, JPanel torreDestino) {
       
    JPanel discoAMover = obtenerUltimoDisco(torreOrigen);

    if (discoAMover != null) {
        JPanel discoEnDestino = obtenerUltimoDisco(torreDestino);
        if (discoEnDestino != null && discoAMover.getWidth() > discoEnDestino.getWidth()) {
            JOptionPane.showMessageDialog(null, "No se puede colocar un disco más grande sobre uno más pequeño.");
            return;
        }

        actualizarPosicionDeDisco(discoAMover, torreDestino);
    }
    }
    
    private JPanel obtenerUltimoDisco(JPanel torre) {
    JPanel ultimoDisco = null;
    for (JPanel disco : discos) {
        if (esDiscoEnTorre(disco, torre)) {
            if (ultimoDisco == null || disco.getY() < ultimoDisco.getY()) {
                ultimoDisco = disco;
            }
        }
    }
    return ultimoDisco;
}
    
    private boolean esDiscoEnTorre(JPanel disco, JPanel torre) {
    return disco.getBounds().intersects(torre.getBounds());
}
    private int contarDiscosEnTorre(JPanel torreDestino) {
    int count = 0; 
    for (JPanel disco : discos) { 
        if (esDiscoEnTorre(disco, torreDestino)) {
            count++;
        }
    }
    return count; 
}
    private void actualizarPosicionDeDisco(JPanel disco, JPanel torreDestino) {
    int torreX = torreDestino.getX();
    int torreY = torreDestino.getY();
    int torreAltura = torreDestino.getHeight();

    int numDiscosEnTorre = contarDiscosEnTorre(torreDestino);

    int nuevoY = torreY + torreAltura - (disco.getHeight() * (numDiscosEnTorre + 1));
    disco.setLocation(torreX + (torreDestino.getWidth() - disco.getWidth()) / 2, nuevoY);

    principal.revalidate();
    principal.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ing;
    private javax.swing.JButton init;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField longitud;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel torre1;
    private javax.swing.JPanel torre2;
    private javax.swing.JPanel torre3;
    // End of variables declaration//GEN-END:variables
}
