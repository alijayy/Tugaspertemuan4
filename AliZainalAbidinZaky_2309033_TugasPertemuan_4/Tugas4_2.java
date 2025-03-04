package AliZainalAbidinZaky_2309033_TugasPertemuan_4;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */

/*Buatlah algoritma dalam bahasa Java, menampilkan banyaknya bilangan ganjil dari
batasAwal dan batasAkhir yang diinput dari alat masukan.*/
public class Tugas4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasAkhir,batasAwal, jumlah = 0;
        
        
        System.out.print("Masukkan bilangan awal : ");
        batasAwal = input.nextInt();
        System.out.print("Masukkan bilangan akhir : ");
        batasAkhir = input.nextInt();
        System.out.print("Bilangan ganjil dari "+ batasAwal +" sd "+ batasAkhir + " adalah : ");
        
        for(int i = batasAwal; i <= batasAkhir; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
                jumlah++;
            }
        }
        System.out.print("\nJumlah bilangan ganjilnya adalah : "+jumlah);
    }
    
}
