public class RecAndClosed {
    /*  Recursive form:  f(n) = 2n + f(n - 1)
        Closed form: f(n) = n^2 + n

        Proof: Let p(n) be the given equation
        Since f(0) = 0 = (0) + (0)^2, p(0) is true
        Now assume p(k) is true and prove p(k + 1) is true
        Show
        The left side of p(k + 1) is
        f(k + 1) = 2[(k + 1)] + f([(k + 1) - 1])        (Definition of f)
                 = 2(k + 1) + f(k)
                 = 2(k + 1) + (k^2 + k)                 (Induction assumption)
                 = 2k + 2 + k^2 + k
                 = k^2 + 3k + 2
                 = k^2 + 2k + 1 + k + 1
                 = (k + 1)^2 + (k + 1)                  (2n + f(n - 1) = n + n^2)
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Proof that the closed form of f(n) = 2n + f(n - 1) is f(n) = n + n^2
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("f(" + i + ") = " + rec(i));
                System.out.println("f(" + i + ") = " + closed(i));
            } else {
                System.out.println("f(" + i + ") = 2(" + i + ") + f(" + i + " - 1) = " + rec(i));
                // Closed form for f(n) = 2n + f(n - 1)
                // f(n) = n + n^2
                System.out.println("f(" + i + ") = (" + i + ") + (" + i + ")^2 = " + closed(i));
            }

        }
    }

    /**
     * @param i n
     * @return n^2 + n
     */
    private static int closed(int i) {
        // f(n) = n^2 + n
        return ((i * i) + i);
    }


    /**
     * @param i n
     * @return 2n + f(n - 1)
     */
    private static int rec(int i) {
        // f(n) = 2n + f(n - 1)
        if (i == 0) {
            return 0;
        } else {
            return 2 * i + rec(i - 1);
        }
    }
}
