package Princiapl;

import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        File carpeta = new File("C:\\Users\\Alejandro Gamaza\\Desktop\\Games");
        String[] carpetas = carpeta.list();
        for(int i = 0; i<carpetas.length; i++){
            System.out.println(carpetas[i]);
        }
        System.out.println("--------------------------\n" + 
                "El juego elegido es........");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(carpetas[r.nextInt(carpetas.length)] + "\n");
    }
    
}
