/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazadaptable;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Juan Haydar
 */
public class OlvideMiContraseña extends javax.swing.JFrame {
int xMause, yMause;
    InterfazAdaptable interfaz= new InterfazAdaptable();
    /**
     * Creates new form OlvideMiContraseña
     */
    public OlvideMiContraseña() {
        initComponents();
        panel.setVisible(false);
        enviar.requestFocusInWindow();
        Error1.setVisible(false);
        this.setShape(new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 40));
         try {
            UIManager.put( "Button.arc", 100 );
            UIManager.put( "TextComponent.arc",100);
            UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        Atras = new javax.swing.JLabel();
        Error1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enviando Codigo...");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 120));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 40)); // NOI18N
        jLabel3.setText("Olvide mi contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        jLabel2.setText("Tu correo electronico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, 30));

        correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(204, 204, 204));
        correo.setText("Ingresar correo electronico");
        correo.setBorder(null);
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoMousePressed(evt);
            }
        });
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 310, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario (1).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 30, 30));

        Barra.setBackground(new java.awt.Color(204, 204, 204));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        cerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.setOpaque(true);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("<html><body style='width: 300px'>Ingresa el correo electronico con el que registraste tu cuenta, para enviar un codigo de verificacion</body></html>");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        enviar.setBackground(new java.awt.Color(0, 0, 0));
        enviar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 0));
        enviar.setText("Enviar codigo");
        enviar.setToolTipText("Enviar codigo");
        enviar.setBorder(null);
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enviarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enviarMouseReleased(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 210, 40));

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AtrasNegro.png"))); // NOI18N
        Atras.setToolTipText("Ir hacia la pagina de inicio");
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AtrasMousePressed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 30));

        Error1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Error1.setForeground(new java.awt.Color(204, 0, 204));
        Error1.setText("*No se ha escrito");
        getContentPane().add(Error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 430, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseClicked

    }//GEN-LAST:event_correoMouseClicked

    private void correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMousePressed
        String txt="Ingresar correo electronico";
        interfaz.Texto(correo, txt);
    }//GEN-LAST:event_correoMousePressed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setBackground(new Color(200, 57, 43));
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_cerrarMouseExited

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xMause, y-yMause);
    }//GEN-LAST:event_BarraMouseDragged

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMause =evt.getX();
        yMause= evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseEntered
        enviar.setForeground(Color.gray);
    }//GEN-LAST:event_enviarMouseEntered

    private void enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseExited
        enviar.setForeground(Color.yellow);
    }//GEN-LAST:event_enviarMouseExited

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarActionPerformed

    private void enviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMousePressed
        Error1.setVisible(false);
        if(interfaz.bandera(correo, "Ingresar correo electronico")&&!correo.getText().equals("")&&correo.getText().contains("@")){
            //Compara el correo con la informacion en la base de datos(Perfiles.txt)
            if(Data.Comparador2(correo.getText())){
            //Agrega aqui tu funcion para enviar codigo al correo indicado
            
            Data.setCorreo(correo.getText());
            Thread hilo= new Thread(){
                @Override
                        public void run(){
                panel.setVisible(true);
                for(int i=1;i<101;i++){
                    try {
                    Thread.sleep( 7);
                    bar.setValue(i);
                    } catch (InterruptedException e) {
                    }
                }
            JOptionPane.showMessageDialog(null, "Se envio un codigo al correo "+Data.getCorreo());
                //mostrar siguiente panel
            OlvideMiContraseña2 inicio=new OlvideMiContraseña2();
        inicio.setVisible(true);
        ((JFrame) SwingUtilities.getWindowAncestor(enviar)).dispose();
                        }
                        };
                hilo.start();
        }else {
        JOptionPane.showMessageDialog(null,"Con este correo, no se ha iniciado una cuenta");
        }
        }else{
         Error1.setVisible(true);}
        
        
        
    }//GEN-LAST:event_enviarMousePressed

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        ImageIcon icon= new ImageIcon("src\\img\\AtrasGris.png");
        Atras.setIcon(icon);
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        ImageIcon icon= new ImageIcon("src\\img\\AtrasNegro.png");
        Atras.setIcon(icon);
    }//GEN-LAST:event_AtrasMouseExited

    private void AtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMousePressed
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
        ((JFrame) SwingUtilities.getWindowAncestor(Atras)).dispose();
    }//GEN-LAST:event_AtrasMousePressed

    private void enviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarMouseReleased

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atras;
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel Error1;
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JTextField correo;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
