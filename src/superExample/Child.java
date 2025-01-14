package superExample;

public class Child extends Parent {
    void display () {
        System.out.println("Child Method");
    }
    void show () {
        super.display();
        display();
    }
}
