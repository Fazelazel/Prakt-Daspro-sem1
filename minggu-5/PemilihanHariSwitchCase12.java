import java.util.Scanner;

public class PemilihanHariSwitchCase12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        String dayType;
        int number;

        //input
        System.out.print("Input the number : ");
        number = input.nextInt();

        //switch case
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
            default:
                dayType = "invalid number";
        }
        
        //output
        System.out.println(number + " is a " + dayType);

        input.close();
    }
}