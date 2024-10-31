import java.util.Scanner;

public class PemilihanBilangan12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        int angka = input.nextInt();

        // if...else
        // if (angka % 2 == 0) {
        // System.out.println("Angka " + angka + " termasuk bilangan genap");
        // } else {
        // System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        String keterangan = (angka % 2 == 0) ? "Angka termasuk bilangan genap" : "Angka termasuk bilangan ganjil";
        System.out.println(keterangan);

        input.close();
    }
}