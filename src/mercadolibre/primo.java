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
public class primo {

    public primo(){}


    int isPrimo(int n){
        int sqrt_n = (int) Math.sqrt((double)n);
        int max = (sqrt_n+1)/6;
        int i;
        if (n==2 || n==3) return 1;

        if ((n%2) == 0 || (n%3) == 0) return 0;

        for (i = 1; i <= max; ++i) {
            if ((n%(6*i-1)) == 0 || n%(6*i+1) == 0 ) return 0;
        }
        return 1;
    }
}
