import java.util.Scanner;

public class PemilihanHariDenganif12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        String dayType;
        int dayNumber;

        //input
        System.out.print("Input the number : ");
        dayNumber = input.nextInt();

        //if...elsedas
        if (dayNumber == 1 || dayNumber == 2 || dayNumber == 3 || dayNumber == 4 || dayNumber == 5) {
            dayType = "weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "weekend";
        } else {
            dayType = "Invalid Number";
        }

        //output
        System.out.println(dayNumber + " is a " + dayType);

        input.close();
    }
}