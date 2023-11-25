import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if((x%3 == 0) && (x%5 != 0)){
            System.out.println("Fizz");
        }
        else if((x%5 == 0) && (x%3 != 0)){
            System.out.println("Bazz");
        }
        else if((x%3 == 0) && (x%5 == 0)){
            System.out.println("FizzBazz");
        }

    }
}