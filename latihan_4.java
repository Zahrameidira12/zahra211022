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
public class latihan_4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int i;

       for(i = 1 ; i<=10 ; i++){
        
            System.out.print("Masukan Angaka : ");
            i = input.nextInt();
           switch(i){
                case 1 :
                         System.out.println("Satu");      
               
            break;
               
                case 2:
                        System.out.println("Dua");     
               
            break;

                case 3:
                        System.out.println("Tiga");  
            break;
                case 4:
                        System.out.println("Empat");  
            break;
                case 5:
                        System.out.println("Lima");  
            break;
                case 6:
                        System.out.println("Enam");  
            break;
                case 7:
                        System.out.println("Tujuh");  
            break;
                case 8:
                        System.out.println("Delapan");  
            break;
                case 9:
                        System.out.println("Sembilan");  
            break;
                case 10:
                        System.out.println("Sepuluh");  
            break;

            default :
                    System.out.println("Invalid Number");

            
          
            }            
        }           


       }

}
