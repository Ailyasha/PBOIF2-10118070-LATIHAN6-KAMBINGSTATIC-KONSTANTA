/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan6.kambingstatic.konstanta;

/**
 *
 * @author
 * NAMA     : Aufa Ilyasha
 * Kelas    : IF2
 * NIM      : 10118070
 */
public class PBOIF210118070LATIHAN6KAMBINGSTATICKONSTANTA {
     // Variabel jumlahKambing dideklarisasikan sebagai statik
    public static int jumlahKambing;


public class KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta
      public static final String NAMA_KAMBING = "MIDUN";
}
      public static void main(String[] arg) {
          PBOIF210118070LATIHAN6KAMBINGSTATICKONSTANTA.jumlahKambing = 485000;
        String NAMA_KAMBING = "Midun";
          System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                             + PBOIF210118070LATIHAN6KAMBINGSTATICKONSTANTA.jumlahKambing);
      }
}
    
   