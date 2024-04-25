package org.launchcode;

class Base{

    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is Java");
    }

//    int x;
//    public Base() {
//        System.out.println("I am constructor");;
//    }
//    public Base(int x) {
//        System.out.println("I am an overloaded constructor with value of x as: " + x);;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("I am in base setting x now");
//        this.x = x;
//    }
//
//    public void printMe() {
//        System.out.println("I am a constructor");;
//    }
}


class Derived extends Base{

    public void hello(){
        System.out.println("Hello");
    }

    @Override
    public void name(){
        System.out.println("My name is Java class2");
    }
    //    public int y;
//
//    public Derived() {
//        super(1);
//        System.out.println("I am derived class constructor");;
//    }
//    public Derived(int x, int y) {
//        super(x);
//        System.out.println("I am an overloaded constructor with value of y as: " + y);
//
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
}


public class Practice {

    public static void main(String[] args) {
        //creating obj of base class
        Base b = new Base();
        Derived d = new Derived();
//        b.name();
        Base obj = new Derived();
//        obj.greet();
        obj.name();
//        d.hello();
//        b.setX(4);
//        System.out.println(b.getX());
//        System.out.println("************************");

        //obj of derived class
//        Derived d = new Derived();
//        Derived d = new Derived(15,25);
//        d.setX(4);
//        d.setY(45);
//        System.out.println(d.getX());
//        System.out.println("************************");

//        System.out.println(d.getY());
//        System.out.println("************************");

    }

}
