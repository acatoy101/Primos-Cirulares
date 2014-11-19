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
public class PrimoRun {
int empieza;

    PrimoRun(int empieza){
        this.empieza = empieza;
    }
    public void run(){
        
        int n, primo, i, j;
        int[] token;
        n = 1000 + empieza;

        token = new int[n];

        for (i = empieza; i < n; ++i) token[i] = 0;

        for (i = 3 + empieza; i < n; i += 2) {
            if (token[i] == 0 ) {
                j = i;
                do {
                    if (j < n) {
                        token[j] = 1;
                    }
                
                    primo = new primo().isPrimo(j);
                    j = new rotar().rota(j);
                
                } while (primo == 1 && j != i);
                
                if (primo == 1){ 
                    System.out.println(i);
                }
            }
        }

    }
}
