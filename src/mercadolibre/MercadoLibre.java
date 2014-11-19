/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mercadolibre;

/**
 *
 * @author mario
 */
public class MercadoLibre {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n, i;
        n = 1000000;

        for(i=8; i < n; i=i+1000){    
            PrimoRun p = new PrimoRun(i);
            p.run();
        }


    }
    
}
