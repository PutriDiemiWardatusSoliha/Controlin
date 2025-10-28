/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadiri;

public class DataDiri {
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
        DataDiri Dian = new DataDiri();
        
        Dian.NIM = "G41240436";
        Dian.Nama = "Dian Hemas Pitaloka";
        Dian.Prodi = "Manajemen Informasi Kesehatan";
        Dian.Jurusan = "Kesehatan";
        Dian.StatusHubungan = "Taken";
        
        Dian.cetakdata();
    }
    
}
