import java.util.Scanner;

public class Objective5Lab4 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum;

        System.out.println("Please enter a number: ");
        userNum = input.nextInt();

        if(userNum > 0 && userNum % 2 == 0 || userNum < 0 && userNum % 2 == 0) {
                System.out.println("The number is even ");
        } else if(userNum % 2 == 1 || userNum % 2 == -1) {
                System.out.println("The number is odd ");
        } else {
                System.out.println("The number is neutral ");
        }
        input.close();
}
}
