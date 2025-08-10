import java.util.Scanner;
class Pattern1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == i || j == rows - i - 1)
                    System.out.print("1 ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
	}
}

