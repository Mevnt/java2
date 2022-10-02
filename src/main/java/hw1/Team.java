package hw1;

import java.util.Random;

public class Team {

    private String nameTeam = "unknown";
    Animal[] zoo = {new Cat("Мурзик"), new Hen("Лизи"), new Hippo("Мото-Мото")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();
    // Формируем команду
    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(3);
            teamAnimal[i] = zoo[ran];
        }
    }
    public void printInformationAboutTheTeam() {
        System.out.println("Команда: " + nameTeam);
        for(Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Бег: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Плавание: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Прыжок: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " Успешно прошел дитанцию.\n");
            } else {
                System.out.println(a + " Не прошел дистанцию.\n");
            }
        }
        System.out.println();
    }
}