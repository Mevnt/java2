package lesson1;

public class Turtle extends Animal{
    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Черепаха фыркает");
    }

    public double swim(Pool pool){
        System.out.println("Я черепах и я не плаваю!");
        return pool.getLength()/getSwimmingSpeed();
    }

}
