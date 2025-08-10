

public class PatternR {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0 || (i == 0 && j < cols - 1) || (i == 2 && j < cols - 1) || (j == cols - 1 && i == 1) || (i - j == 1 && i >= 3)
                ) {
                    System.out.print("R ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



