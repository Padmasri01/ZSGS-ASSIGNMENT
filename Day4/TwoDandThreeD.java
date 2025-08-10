/*2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class
called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a
method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a print statement to the TwoD default constructor with a message "TwoD default constructor"
Add a print statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/


class TwoD {
    protected int x;
    protected int y;


    public TwoD() {
        System.out.println("TwoD default constructor");
        this.x = 0;
        this.y = 0;
    }


    public TwoD(int x, int y) {
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


class ThreeD extends TwoD {
    private int z;


    public ThreeD() {
        super(); // calls TwoD default constructor
        this.z = 0;
    }

    public ThreeD(int x, int y, int z) {
        super(x, y); // calls TwoD constructor with 2 args
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public double distanceTo(ThreeD other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        int dz = this.z - other.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}


public class TwoDandThreeD {
    public static void main(String[] args) {

        ThreeD point1 = new ThreeD();
        point1.setX(1);
        point1.setY(2);
        point1.setZ(3);


        ThreeD point2 = new ThreeD(4, 6, 8);


        double distance = point1.distanceTo(point2);
        System.out.println("Distance between the two ThreeD points: " + distance);
    }
}

