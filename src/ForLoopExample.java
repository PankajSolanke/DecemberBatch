import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        }

    public static class Main {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a website");
            String website = sc.next() ;

            if (website.endsWith(".com")) {
                System.out.println("This is a commertial website");
            } else if (website.endsWith(".org")) {
                System.out.println("This is an organizational website");
            } else {
                System.out.println("This is an indian website");
            }
        }
    }
}

