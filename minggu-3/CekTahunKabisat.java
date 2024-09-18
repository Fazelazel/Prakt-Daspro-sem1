import java.util.Scanner;

public class CekTahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__Program java cek tahun kabisat__");
        System.out.println("==================================");
        System.out.println();

        int year;

        System.out.print("Input tahun : ");
        year = input.nextInt();

        if (year %400 == 0) {
            System.out.println(year + " Merupakan tahun kabisat : ");
        } else if (year %100 == 0) {
            System.out.println(year + " Bukan tahun kabisat");
        } else if (year %4 == 0) {
            System.out.println(year + " Merupakan tahun kabisat");
        } else {
            System.out.println(year + " Bukan tahun kabisat");
        }
    input.close();
    }
    
}
