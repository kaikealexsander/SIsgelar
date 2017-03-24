/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar.controller;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
//import sisar.model.Produto;
//import sisar.view.bcVendas;

/**
 *
 * @author kaikealexsander
 */
public class Utilitarios {

    public static void setAcessibilidade(JRootPane rootPane, final JFrame frame) {
        JRootPane meurootpane = rootPane.getRootPane();
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
            public void actionPerformed(ActionEvent e) {
                //rootPane.setVisible(false);
               //frame.dispose();
                frame.setVisible(false);
            }
        });
    
        
    }
    
    /*public void LimpaTela(JInternalFrame Frame) {     
            //limpa os campos     
            for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
                //varre todos os componentes     
                Component c = Frame.getContentPane().getComponent(i);     
                if (c instanceof JTextField) {                           
                    JTextField field = (JTextField) c;   
                    field.setText("");                      
                    }   
                }   
            }*/
    // uso >> "new Utilitarios().LimpaTela(this);"
    
    public void limparTodosCampos(Container container) {
        
        Component components[] = container.getComponents();
        for (Component component : components) {  
        if (component instanceof JFormattedTextField) {  
            JFormattedTextField field = (JFormattedTextField) component;  
            field.setValue("");
        }
        else if (component instanceof JTextField) {  
            JTextField field = (JTextField) component;  
            field.setText("");  
        } else if (component instanceof Container) {  
            limparTodosCampos((Container) component);  
    }  
    }
   }
    
//     public void setAcessibilidade() {
//        JRootPane meurootpane = j.getRootPane();
//        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
//        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
//            public void actionPerformed(ActionEvent e) {
//                j.setVisible(false);
//            }
//        });
//    

     }

