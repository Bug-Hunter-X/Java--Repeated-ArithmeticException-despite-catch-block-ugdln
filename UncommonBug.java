public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            try {
                System.out.println(10 / i);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
            i++;
        }
    }
}