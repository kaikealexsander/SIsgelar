/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import sisgelar.view.JFPrincpal;

/**
 *
 * @author kaikealexsander
 */
public class SisGelar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            try {
                for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
    System.out.println( info.getName() );
}
        for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
            if ( "Nimbus".equals( info.getName() ) ) {
                UIManager.setLookAndFeel( info.getClassName() );
                break;
            }
        }
            } catch ( UnsupportedLookAndFeelException exc ) {
                exc.printStackTrace();
            } catch ( ClassNotFoundException exc ) {
                exc.printStackTrace();
            } catch ( InstantiationException exc ) {
                exc.printStackTrace();
            } catch ( IllegalAccessException exc ) {
                exc.printStackTrace();
    }
    // restante do método main aqui...

        JFPrincpal principal = new JFPrincpal();
        principal.setVisible(true);
    }
    
}
