public class Pattern {

    public static void main(String[] args) {

        final int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars and inner spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars and inner spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
