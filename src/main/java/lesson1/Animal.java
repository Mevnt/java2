package lesson1;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private double swimmingSpeed;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        if (age >= 0) this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0) this.age = age;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(Pool pool){

        return pool.getLength() / swimmingSpeed;
    }
    public abstract void voice();


}
