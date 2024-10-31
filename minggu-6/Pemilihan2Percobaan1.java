import java.util.Scanner;

public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi Variabel
        int tahun;

        //input
        System.out.print("Masukkan tahun : ");
        tahun = input.nextInt();

        //Condition type 1
        // if (tahun %400 == 0) {
        //     System.out.println(tahun + " Merupakan tahun kabisat : ");
        // } else if (tahun %100 == 0) {
        //     System.out.println(tahun + " Bukan tahun kabisat");
        // } else if (tahun %4 == 0) {
        //     System.out.println(tahun + " Merupakan tahun kabisat");
        // } else {
        //     System.out.println(tahun + " Bukan tahun kabisat");
        // }

        //condition type 2
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun kabisat");
            }
            else if ((tahun % 400) == 0) {
                System.out.println("tahun kabisat");
            }
            else if ((tahun % 100) == 0) {
                System.out.println("bukan tahun kabisat");
            }
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}
