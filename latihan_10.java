/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra211022;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class latihan_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, i,pangkat;

            System.out.println("Menghitung A pangkat B");
            System.out.print("A\t= ");
            a = in.nextInt();
            System.out.print("B\t= ");
            b = in.nextInt();
            pangkat = 1;
            
            for (i=1; i <=b; i++) {
                pangkat = pangkat * a;
            }
            System.out.println("Hasil pangkat for\t: ");
            System.out.println(a + " Pangkat " + b + " = " + pangkat);
    }
}
