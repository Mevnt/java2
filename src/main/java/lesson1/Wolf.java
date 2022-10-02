package lesson1;

public class Wolf extends Animal implements CanSwim{
    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Волк воет");
    }
    public double swim(Pool pool){
        System.out.println("Я волк и я плыву!");
        return pool.getLength()/getSwimmingSpeed();
    }

}
