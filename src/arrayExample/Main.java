package arrayExample;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println("Idex at 3 : " + numbers[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            e.getMessage() ;
        }
        System.out.println("Executed");
    }
}
