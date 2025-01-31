package gr.aueb.cf.ch14;

public class Rectangle extends Shape{

    public Rectangle() {    //Είτε τα γράψουμε είτε όχι, δίνεται από την java αυτόματα.
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
