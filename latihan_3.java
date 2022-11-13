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
public class latihan_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        // int angka1 = 1;
        // int angka2 = 2;
        // int angka3 = 3;
        // int angka4 = 4;
        // int angka5 = 5;
        // int angka6 = 6;
        // int angka7 = 7;
        // int angka8 = 8;
        // int angka9 = 9;
        // int angka10 = 10;

        for(i=1;i<=10;i++){
            System.out.println("Masukan Angka : ");
            i = input.nextInt();
            if(i==1){
                System.out.println("Satu");
            }else if(i==2){
                System.out.println("Dua");
            }else if(i==3){
                System.out.println("Tiga");
            }else if(i==4){
                System.out.println("Empat");
            }else if(i==5){
                System.out.println("Lima");
            }else if(i==6){
                System.out.println("Enam");
            }else if(i==7){
                System.out.println("Tujuh");
            }else if(i==8){
                System.out.println("Delapan");
            }else if(i==9){
                System.out.println("Sembilan");
            }else if(i==10){
                System.out.println("Sepuluh");
            }else{
                System.out.println("Invalid Number");
            }
        }
       


    }
}
