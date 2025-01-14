public class StringExample {
    public static void main(String[] args) {
        int [] marks = {98 , 77 , 80 , 65 , 55} ;

        for (int i = marks.length - 1 ; i >= 0 ; i--) {
           System.out.println(marks[i]);
            for (int element : marks) {
                System.out.println(element);
            }
        }

    }
}
