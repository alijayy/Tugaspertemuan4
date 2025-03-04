package AliZainalAbidinZaky_2309033_TugasPertemuan_4;
import java.util.Scanner;
/**
 *
 * @author Ali Zaky
 */

/*Buatlah algoritma dalam bahasa Java, menghitung n!, dimana n>=0, 0!=1, dengan
tampilan sebagai berikut, jika diinput n=5, maka keluarannya harus 5!=5*4*3*2*1=120: */
public class Tugas4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Faktorial!");
        System.out.print("Masukkan bilangan n : ");
        int n = input.nextInt();
        
        int faktorial = 1;
        
        System.out.print(n + "! = ");
        for(int i=n; i>= 1; i--){
            faktorial *= i;
            System.out.print(i);
            
            if(i > 1){
                System.out.print("*");
            }
        }
        System.out.println(" = "+ faktorial);
    }
    
}
