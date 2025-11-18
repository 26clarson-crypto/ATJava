public class PartC {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter three strings: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        scanner.close();

        String first, second, third;

        if (str1.compareTo(str2) <= 0 && str1.compareTo(str3) <= 0) {
            first = str1;
            if (str2.compareTo(str3) <= 0) {
                second = str2;
                third = str3;
            } else {
                second = str3;
                third = str2;
            }
        } else if (str2.compareTo(str1) <= 0 && str2.compareTo(str3) <= 0) {
            first = str2;
            if (str1.compareTo(str3) <= 0) {
                second = str1;
                third = str3;
            } else {
                second = str3;
                third = str1;
            }
        } else {
            first = str3;
            if (str1.compareTo(str2) <= 0) {
                second = str1;
                third = str2;
            } else {
                second = str2;
                third = str1;
            }
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
