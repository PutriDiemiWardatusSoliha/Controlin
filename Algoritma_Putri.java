/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grade.algoritma_putri;

import java.util.Scanner;

public class Algoritma_Putri {

    public static void main(String[] args) {
        
      int nilai;
      String grade = null;
      Scanner Scan = new Scanner(System.in);
      
      //mengambil input
      System.out.print("inputkan nilai: ");
      nilai = Scan.nextInt();
      
      //hitung grade
      if (nilai>= 86) {
       grade = "A";
    }  else if (nilai>= 76) {
         grade = "B+";
    }  else if (nilai>= 66) {
          grade = "B";
    }  else if (nilai>= 56) {
         grade = "C+";
    }  else if (nilai>= 46) {
         grade = "C";
    }  else if (nilai>= 36) {
         grade = "D";
    }
    //Cetak hasil
      System.out.println("Grade:" + grade);
    
    }
}
