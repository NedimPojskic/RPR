import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Unesi n: ");
        int n = keyboard.nextInt();

        for(int i = 1; i <= n; i++) {

            if(i % SumaCifara(i) == 0)
                System.out.println(i);

        }

    }

    public static int SumaCifara(int x) {
        int sum = 0;

        while (x != 0)
        {
            sum = sum + x % 10;
            x = x/10;
        }

        return sum;
    }
}