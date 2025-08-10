public class Pattern3 {
    public static void main(String[] args) {
        int num = 1;
        int i = 1;

        while (i <= 3) {
            int space = 3 - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(num + "  ");
                num++;
                j++;
            }

            System.out.println();
            i++;
        }


        i = 2;
        while (i >= 1) {
            int space = 3 - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(num + "  ");
                num++;
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
