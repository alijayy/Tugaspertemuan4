package AliZainalAbidinZaky_2309033_TugasPertemuan_4;
import java.util.Scanner;
/**
 *
 * @author Ali Zaky
 */

/*Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai dengan
n, dimana n diinput dari alat masukan, n>=1*/
public class Tugas4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batasan (n) : ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print(i+ " ");
        }
    }
}
