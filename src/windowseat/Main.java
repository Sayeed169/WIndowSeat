/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowseat;
import javax.swing.UIManager;

/**
 *
 * @author Sayeed
 */
public class Main {
    
    public static int id = -1;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        
        WindowSeat w = new WindowSeat();
        w.setVisible(true);
        w.setResizable(false);
    }
    
}
