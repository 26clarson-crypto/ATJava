
public class help {
    
    public static void min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The minimum integer is: " + min);
    }
}