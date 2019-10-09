
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk meghitung
 * saldo di bulan ke-n
 *  
 */

package pbo1.pkg10118033.latihan19;

public class PBO110118033Latihan19 {
    public static void main(String[] args) {
        double saldo = 2500000;
        double bunga;
        int lama = 6;
        for(int i=1;i<=lama;i++){
            bunga = saldo*0.15;
            saldo = saldo+bunga;
            System.out.print("Saldo di bulan ke-"+i);
            System.out.printf(" Rp.%,1.0f \n",saldo);
        }
        System.out.println("(Developed By : Ikrar AB)");
    }
}