public class Objective8Lab2 {
public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i < 21; i++) {
                count = count + 1;
                sum = count + sum;
        }
        System.out.println(sum);
}
}
