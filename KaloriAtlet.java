import java.util.Scanner;

public class KaloriAtlet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Keterangan koefisien
         * berlari = 0.05,  berenang = 0.04, bersepeda = 0.03
         */
        
        //deklarasi variabel keterangan
        double beratBadan, targetKalori;
        
         //deklarasi variabel - Berlari
        double durasiLari, kecepatanLari, ketinggianLari;

        //deklarasi variabel - Berenang
        double durasiRenang, kecepatanRenang, ketinggianRenang;

        //deklarasi variabel - Bersepeda
        double durasiSepeda, kecepatanSepeda, ketinggianSepeda;

        //input berat badan atlet
        System.out.print("Masukkan berat badan : ");
        beratBadan = input.nextDouble();

        //input keterangan berlari
        System.out.print("Masukkan durasi berlari : ");
        durasiLari = input.nextDouble();
        System.out.print("Masukkan kecepatan rata - rata : ");
        kecepatanLari = input.nextDouble();
        System.out.print("Masukkan ketinggian lari : ");
        ketinggianLari = input.nextDouble();

        //input keterangan berenang
        System.out.print("Masukkan durasi berenang : ");
        durasiRenang = input.nextDouble();
        System.out.print("Masukkan kecepatan rata - rata : ");
        kecepatanRenang = input.nextDouble();
        System.out.print("Masukkan ketinggian renang : ");
        ketinggianRenang = input.nextDouble();

        //input keterangan bersepeda
        System.out.print("Masukkan durasi bersepeda : ");
        durasiSepeda = input.nextDouble();
        System.out.print("Masukkan kecepatan rata - rata : ");
        kecepatanSepeda = input.nextDouble();
        System.out.print("Masukkan ketinggian bersepeda : ");
        ketinggianSepeda = input.nextDouble();

        //input target kalori yang terbakar
        System.out.print("Masukkan target kalori : ");
        targetKalori = input.nextDouble();


        //operasi hitung kalori
        double kaloriLari = (durasiLari*0.05*beratBadan) + (kecepatanLari*0.5) + (ketinggianLari*0.01);
        double kaloriRenang = (durasiRenang*0.04*beratBadan) + (kecepatanRenang*0.5) + (ketinggianRenang*0.01);
        double kaloriSepeda = (durasiSepeda*0.03*beratBadan) + (kecepatanSepeda*0.5) + (ketinggianSepeda*0.01);

        //operasi hitung total kalori
        double totalKalori = (kaloriLari + kaloriRenang + kaloriSepeda);

        //operasi rata - rata kalori per menit
        double totalDurasi = (durasiLari + durasiRenang + durasiSepeda);
        double rataRataKalori = (totalKalori/totalDurasi);  
        
        //operasi persentase ketercapaian
        double persentase = (totalKalori/targetKalori)*100f;

        //output 
        System.out.println("=======TOTAL KALORI TIAP OLAHRAGA=======");
        System.out.println("Kalori yang terbakar dari berlari : " + (int) kaloriLari + " cal");
        System.out.println("Kalori yang terbakar dari berenang : " + (int) kaloriRenang  + " cal");
        System.out.println("Kalori yang terbakar dari bersepeda : " + (int) kaloriSepeda + " cal");
        System.out.println("========================================");
        System.out.println("Total kalori yang terbakar keseluruhan : " + (int) totalKalori + " cal");
        System.out.println("========================================");
        System.out.println("Rata - rata kalori yang terbakar per menit : " + (int) rataRataKalori + " cal");
        System.out.println("========================================");
        System.out.println("Persentase ketercapaian target kalori : " + String.format("%.2f", persentase) + " %");
        
        input.close();
    }
    
}
