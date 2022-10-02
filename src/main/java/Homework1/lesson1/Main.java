package Homework1.lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);
        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "рыжий", 1);

        Cat cat3 = new Cat("Морис", "рыжий", 1);

        System.out.println(cat2.equals(cat3));
        System.out.println(cat2 == cat3);

        Wolf wolf = new Wolf("Вулф", "Серый", 7);
        Animal cat4 = new Cat("Морис", "Белый", 10);
        Turtle turtle = new Turtle("Лео", "зеленый", 100);

        if (cat4 instanceof Wolf){
            Wolf cat5 = (Wolf) cat4;
            System.out.println(cat5);
        } else {
            System.out.println("Это не волк!");
        }

        cat1.voice();
        wolf.voice();
        turtle.voice();

        cat1.setAge(-10);

        System.out.println(cat1);

        cat2.setSwimmingSpeed(2.0);

        Pool pool = new Pool(200);

        double timeToOvercomeCat2 = cat2.swim(pool);
        System.out.println(timeToOvercomeCat2);

        Pool[] pools = {new Pool( 15), new Pool(20), new Pool(50)};

        wolf.setSwimmingSpeed(5);
        turtle.setSwimmingSpeed(0);


        for (Pool poolI : pools){
            System.out.println("Проплыл за " + wolf.swim(poolI));
            System.out.println("Не умеет плавать " + turtle.swim(poolI));
        }

    }
}
