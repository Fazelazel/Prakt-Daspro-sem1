import java.util.Scanner;

public class Siakad12 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //deklarasi variabel
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        //input
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = sc.nextDouble();

        //operasi
        nilaiAkhir = ((nilaiKuis*(20/100f)) + (nilaiTugas*(15/100f)) + (nilaiUTS*(30/100f)) + (nilaiUAS*(35/100f)));

        String nilaiHuruf = "", kualifikasi = "";
        
        //if..else statement
        if (nilaiAkhir >80 && nilaiAkhir <101) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        }
        else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        //output
        System.out.print("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")");
        System.out.print(" kelas " + kelas + " nomor absen " + absen);
        System.out.println("\nNilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf : " + nilaiHuruf);
        System.out.println("Kualifikasi : " + kualifikasi);

    sc.close();
    }
    
}
