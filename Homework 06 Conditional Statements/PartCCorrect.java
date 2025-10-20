public class PartCCorrect {
    public static void main(String[] args) {
        double a = 1.2;
        double b = 3.0;
        double c = a * b;
        if (Math.abs(c - 3.6) < 1e-9) {
            System.out.println("c is 3.6");
        } else {
            System.out.println("c is not 3.6");
        }
    }
}
