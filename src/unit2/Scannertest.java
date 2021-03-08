package unit2;
import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        System.out.println("\nHow tall are you?");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight + " meters tall" );

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;

        System.out.format("%f.2  m if you are a male", averageMaleHeightDifference);
        System.out.format("\n%f.2  m if you are a female", averageFemaleHeightDifference);


    }
}
