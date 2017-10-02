/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11.pkg10116494.tugas_3;

/**
 *
 * @author IDC
 * Nama : Imam Dwi Cahyo
 * NIM  : 10116494
 * Deskripsi : Nilai Mahasiswa
 */
class Mahasiswa {
    void getBiodata(String nim,String nama){
        for (int i=1;i<5;i++){
            System.out.println("Nama ke-"+i+"   : "+nama);
        }
        for (int j=8;j>0;j--){
            System.out.println("NIM ke-"+j+"     : "+nim+"."+j);
        }    
    }
    
    double nilaiAkhir;
    double getNilaiAkhir(double quiz,double uts, double uas){
        System.out.println("\nQuiz    : "+quiz);
        System.out.println("UTS     : "+uts);
        System.out.println("UAS     : "+uas+"\n");
        nilaiAkhir = quiz*0.2+uts*0.3+uas*0.5;
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        return nilaiAkhir;
    }
    
    void getIndexKeterangan(double nilaiAkhir){
        char index = 0;
        if (nilaiAkhir>=80 && nilaiAkhir<=100){
            index = 'A';
            System.out.println("\nIndex = " + index);
            System.out.println("Sangat Baik");
        }else if (nilaiAkhir>=68 && nilaiAkhir<80){
            index = 'B';
            System.out.println("\nIndex = " + index);
            System.out.println("Keterangan = Baik");
        }else if (nilaiAkhir>=56 && nilaiAkhir<68){
            index = 'C';
            System.out.println("\nIndex = " + index);
            System.out.println("Keterangan = Cukup");
        }else if (nilaiAkhir>=45 && nilaiAkhir<56){
            index = 'D';
            System.out.println("\nIndex = " + index);
            System.out.println("Keterangan = Kurang");
        }else if (nilaiAkhir>=0 && nilaiAkhir<45){
            index = 'E';
            System.out.println("\nIndex = " + index);
            System.out.println("Keterangan = Sangat Kurang");
        }else{
            System.out.println("\nUNRECOGNIZE");
        }
                  
    }
}
public class PBO1110116494Tugas_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nilaiAkhir;
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.getBiodata("10116494","Imam Dwi Cahyo");
        mhs1.getNilaiAkhir(70, 85, 90);
        mhs1.getIndexKeterangan(mhs1.nilaiAkhir);
    }
    
}
