import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 4 != 0) {
            System.out.println("Not a leap year.");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("leap.");
        }
        else if (year % 400 == 0){
            System.out.println("leap");
        }
        else
            System.out.println("no");

    }

}
