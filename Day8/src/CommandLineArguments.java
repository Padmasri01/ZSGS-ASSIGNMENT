/*4. Get some strings through the command-line prompt and use an array to store and display them.*/
public class CommandLineArguments {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No strings entered. Please pass strings via command line.");
            return;
        }

        System.out.println("Strings entered via command line:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("String " + (i + 1) + ": " + args[i]);
        }
    }
}

