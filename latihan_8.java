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
public class latihan_8 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, i,pangkat = 1;
        i = 0;
            System.out.println("Menghitung A pangkat B");
            System.out.print("A\t= ");
            a = in.nextInt();
            System.out.print("B\t= ");
            b = in.nextInt();

            while (i < b) {
                pangkat = pangkat * a;
                i++;
            }
            System.out.println("Hasil\t: ");
            System.out.println(a + " Pangkat " + b + " = " + pangkat);
    }
}
