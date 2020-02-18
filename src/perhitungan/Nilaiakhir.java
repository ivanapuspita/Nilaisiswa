/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;

/**
 *
 * @author Hp
 */
public class Nilaiakhir {
    
    public double n_akhir(double ratatugas, double uts, double uas)
    {
        return(0.3*uts + uas*0.3 + 0.4* ratatugas);
    }
}
