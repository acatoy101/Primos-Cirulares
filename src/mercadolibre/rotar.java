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
public class rotar {
int n;
    public rotar ( ){
    }


    public int rota (int n){
        int n_10 = n/10;
        int circulo = n%10;
        n = n_10;
        while (n != 0) {
            circulo *= 10;
            n /= 10;
            }
        circulo += n_10;
        return circulo;
    }
}