package hierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        obj1.showMessage();
        obj1.display();

        obj2.showMessage();
        obj2.display();

    }
}
