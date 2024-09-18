import java.util.Scanner;

public class GajiKaryawan {
    
    /*
     * input : jmlJamKerja,  upahPerJam, totalGaji, bonus, pajak
     * output : gajiKaryawan sebelum bonus, 
     *          gajiKaryawan + BONUS, 
     *          totalGajiKaryawan - pajak,
     * Algoritma : 
     * 1. masukkan jumlah jam kerja
     * 2. masukkan upah per jam
     * 3. hitung total gaji sebelum bonus (jumlah jam kerja * upah per jam)
     * 4. hitung total gaji setelah bonus (Total gaji sebelum bonus + (Total gaji sebelum bonus * 10/100) )
     * 5. hitung total gaji setelah pajak (total gaji setelah bonus - (Total gaji sesudah bonus * 5/100) )
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // deklarasi variabel
        int jmlJamKerja, upahPerJam;
        float totalGajiSebelumBonus, totalGajiBonus, totalGajiKeseluruhan;

        // input
        System.out.print("Masukkan Jumlah jam kerja : ");
        jmlJamKerja = input.nextInt();
        System.out.print("Masukkan Upah per jam : ");
        upahPerJam = input.nextInt();

        //operasi
        totalGajiSebelumBonus = jmlJamKerja * upahPerJam;

        totalGajiBonus = totalGajiSebelumBonus + (totalGajiSebelumBonus * 10/100f);

        totalGajiKeseluruhan = totalGajiBonus - (totalGajiBonus * 5/100f);

        // output
        System.out.println("========= GAJI KARYAWAN =========");
        System.out.println("Total gaji sebelum bonus : Rp " + totalGajiSebelumBonus);
        System.out.println("Total gaji setelah bonus : Rp " + totalGajiBonus);
        System.out.println("Total gaji setelah potong pajak : Rp " + totalGajiKeseluruhan);

    input.close();
    }
    
}
