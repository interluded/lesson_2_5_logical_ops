import java.util.Scanner;

public class median {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first double ");
        int integer_1 = scan.nextInt();
        System.out.print("Enter the second double ");
        int integer_2 = scan.nextInt();
        System.out.print("Enter the third double ");
        int integer_3 = scan.nextInt();

        if (integer_1 <= integer_2 && integer_1 >= integer_3 || integer_1 >= integer_2 && integer_1 <= integer_3)
            System.out.println("The median value is" + integer_1);
        else if (integer_2 <= integer_1 && integer_2 >= integer_3 || integer_2 >= integer_1 && integer_2 <= integer_3)
            System.out.println("The median value is " + integer_2);
        else
        System.out.println("The median value is " + integer_3);



    }
}
