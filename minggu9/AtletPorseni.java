package minggu9;

import java.util.Scanner;

public class AtletPorseni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlPoliteknik = 0;
        String daftarBadminton = "", daftarTenisMeja = "", daftarBasket = "", daftarVoli = "";

        // input jumlah politeknik yang terdaftar
        System.out.print("Masukkan jumlah Politeknik yang terdaftar : ");
        jmlPoliteknik = input.nextInt();
        input.nextLine();

        // perulangan luar
        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.println("Politeknik ke -" + i);

            //perulangan dalam
            System.out.println("Masukkan daftar nama atlet Badminton");
            for (int b1 = 1; b1 <= 5; b1++) {
                System.out.print("Atlet badminton ke-" + b1 + " : ");
                String badminton = input.nextLine();
                daftarBadminton += "Politeknik ke-" + i + " Atlet Badminton ke-" + b1 + " adalah : " + badminton + "\n";
            }
            System.out.println("Masukkan daftar nama atlet Tenis Meja");
            for (int t = 1; t <= 5; t++) {
                System.out.print("Atlet Tenis Meja ke-" + t + " : ");
                String tenisMeja = input.nextLine();
                daftarTenisMeja += "Politeknik ke-" + i + " Atlet Tenis Meja ke-" + t + " adalah : " + tenisMeja + "\n";
            }
            System.out.println("Masukkan daftar nama atlet Basket");
            for (int b2 = 1; b2 <= 5; b2++) {
                System.out.print("Atlet basket ke-" + b2 + " : ");
                String badminton = input.nextLine();
                daftarBasket += "Politeknik ke-" + i + " Atlet basket ke-" + b2 + " adalah : " + badminton + "\n";
            }
            System.out.println("Masukkan daftar nama atlet Voli");
            for (int  v= 1; v <= 5; v++) {
                System.out.print("Atlet Voli ke-" + v + " : ");
                String voli = input.nextLine();
                daftarVoli += "Politeknik ke-" + i + " Atlet voli ke-" + v + " adalah : " + voli + "\n";
            }

            System.out.println();
        }
        System.out.println("Daftar nama atlet badminton\n" + daftarBadminton + "\n");
        System.out.println("Daftar nama atlet tenis meja\n" + daftarTenisMeja + "\n");
        System.out.println("Daftar nama atlet basket\n" + daftarBasket + "\n");
        System.out.println("Daftar nama atlet voli\n" + daftarVoli + "\n");
    }
}
