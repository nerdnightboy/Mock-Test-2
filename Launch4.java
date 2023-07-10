/*
 * 4. Create an interface called Drawable with a method draw() that has no implementation. Implement this interface in classes Circle and Rectangle. Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.
 */

interface Drawable{
    public void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Let's draw the circle later here!");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Let's draw the rectangle later here!");
    }
}

public class Launch4 {
    public static void main(String[] args) {
        Drawable c = new Circle();
        c.draw();

        Drawable r = new Rectangle();
        r.draw();
    }
}
