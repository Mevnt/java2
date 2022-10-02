package Homework1.lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() && Objects.equals(getName(), cat.getName())
                && Objects.equals(getColor(), cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getAge());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void voice(){
        System.out.println("Кот говорит МЯУ!");
    }

    public double swim(Pool pool){
        System.out.println("Я кот и я плыву!");
        return pool.getLength()/getSwimmingSpeed();
    }

}

