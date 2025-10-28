/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadiridina;

/**
 *
 * @author Dina Kamelia
 */
public class DataDiriDina {

    String NIM;
    String Nama;
    String Prodi;
    String Jurusan;
    String StatusHubungan;
    
    void cetakdata() {
        System.out.println("===============DataDiri==============");
        System.out.println("NIM             :  " + NIM);
        System.out.println("Nama            :  " + Nama);
        System.out.println("Prodi           :  " + Prodi);
        System.out.println("Jurusan         :  " + Jurusan);
        System.out.println("Status Hubungan :  " + StatusHubungan);
    }
public static void main(String[] args) {
        DataDiriDina Dina = new DataDiriDina();
        
        Dina.NIM = "G41240236";
        Dina.Nama = "Dina Kamelia";
        Dina.Prodi = "Manajemen Informasi Kesehatan";
        Dina.Jurusan = "Kesehatan";
        Dina.StatusHubungan = "Taken";
        
        Dina.cetakdata();
}
}

