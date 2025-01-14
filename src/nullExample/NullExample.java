package nullExample;

public class NullExample {
        public static void main(String[] args) {
            String str = null;
            try {
                System.out.println("Length of the String: "+ str.length());
            }
            catch (NullPointerException e) {
                System.out.println("Exception Handled");
                e.getMessage() ;

            }
            System.out.println("After exucution");
        }
    }
