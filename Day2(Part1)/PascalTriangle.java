import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int i = 0;
        do {
            int j = 0;
            int number = 1;

            
            int spaces = n - i;
            int s = 0;
            do {
                System.out.print(" ");
                s++;
            } while (s < spaces);

            
            do {
                if (j == 0) {
                    number = 1;
                } else {
                    number = number * (i - j + 1) / j;
                }
                System.out.print(number + " ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < n);

        sc.close();
    }
}
