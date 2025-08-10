/*6. Develop a Java program to illustrate pass-by-value*/

class Test {
    int data = 50;

    void changePrimitive(int num) {
        num = num + 100;
    }

    void changeObject(Test obj) {
        obj.data = obj.data + 100;
    }
}

public class PassByValueEg {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println("Before changePrimitive: " + t.data);
        t.changePrimitive(t.data);
        System.out.println("After changePrimitive: " + t.data);

        System.out.println("\nBefore changeObject: " + t.data);
        t.changeObject(t);
        System.out.println("After changeObject: " + t.data);
    }
}

