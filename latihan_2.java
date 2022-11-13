/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra211022;

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;
public class latihan_2 {
    public static void main(String[]args){
        int niali1;
        int niali2;
        int nilai3;
        int rata;

        String input1;
        String input2;
        String input3;
        String hasil = "";
        String senyum;
        // String hasil_nilai1,hasil_nilai2,hasil_nilai3;

        input1=JOptionPane.showInputDialog("Nilai1:" );
        input2=JOptionPane.showInputDialog("Nilai2:" );
        input3=JOptionPane.showInputDialog("Nilai3:" );

        niali1=Integer.parseInt(input1);
        niali2=Integer.parseInt(input2);
        nilai3=Integer.parseInt(input3);

        rata=(niali1+niali2+nilai3)/3;

        if(rata>60){
        senyum=" :) ";
        }else
        senyum=" :( ";

        hasil =(hasil)+(" Program Menghitung Rata-rata")+"\n";
        hasil ="\n";
        hasil ="Nilai 1: "+Integer.toString(niali1)+"\n";
        hasil ="Nilai 2: "+Integer.toString(niali2)+"\n";
        hasil ="Nilai 3: "+Integer.toString(nilai3)+"\n";

        hasil ="\n";
        hasil ="Hasil Rata-rata= "+Integer.toString(rata)+"\n"+"\n";
        JOptionPane.showMessageDialog(null,hasil+"Ekspresi"+" "+senyum);
    }
}

