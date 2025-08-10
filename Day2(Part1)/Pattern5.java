import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int i = 0;
        int n = str.length();
        int len = 4; 

        do {
            int j = 0;
            do {
                if (i + j < n) {
                    System.out.print(str.charAt(i + j));
                }
                j++;
            } while (j < len);

            System.out.println();
            i += len;
        } while (i < n);

        sc.close();
    }
}
