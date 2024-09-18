import java.util.Scanner;

public class HitungKeramik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        double sisiLantai, sisiKeramik, luasLantai, luasKeramik;
        double jumlahKeramik;

        //input
        System.out.print("Sisi lantai : ");
        sisiLantai = input.nextDouble();
        System.out.print("Sisi Keramik : ");
        sisiKeramik = input.nextDouble();

        //operasi
        luasLantai = sisiLantai*sisiLantai;
        luasKeramik = sisiKeramik*sisiKeramik;
        jumlahKeramik = luasLantai/luasKeramik;

        //output
        System.out.println("Jumlah keramik yang dibutuhkan : " + jumlahKeramik);


    }
    
}
