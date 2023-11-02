/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazadaptable;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author Juan Haydar
 */
public class InterfazAdaptable {

    public void Texto(JTextField textField, String initialText) {
        textField.setText(initialText); // Establece el texto inicial

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando el campo gana el foco, borra el texto actual si es igual al texto inicial
                if (textField.getText().equals(initialText)) {
                    textField.setText("");
                    textField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando el campo pierde el foco, si está vacío, restaura el texto inicial
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.gray);
                    textField.setText(initialText);
                }
            }
        });
    }
    
    private boolean flag2=false;
    public boolean bandera(JTextField textField,String initialText){
        flag2 = !textField.getText().equals(initialText);
        return flag2;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio in= new Inicio();
        in.setVisible(true);
    }
    
}
