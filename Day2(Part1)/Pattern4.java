import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character to print: ");
        char ch = sc.next().charAt(0);
        
        System.out.print("Enter the  number of rows: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close();
    }
}
