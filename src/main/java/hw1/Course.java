package hw1;

import java.util.Random;

public class Course {
    /**
     * 3. Добавить класс Course (полоса препятствий), в котором будут находиться:
     * массив препятствий, метод который будет просить команду пройти всю полосу;
     */
    Let[] let = new Let[3];
    Random random = new Random();
    // Создаем полосу препятствий
    public Course() {
        Track track = new Track(random.nextInt(100));
        Wall wall = new Wall(random.nextFloat() * 2);
        Water water = new Water(random.nextInt(100));
        let[0] = (Let) track;
        let[1] = (Let) wall;
        let[2] = (Let) water;
    }
    public void printInformationAboutTheObstacle() {
        System.out.println("Длина забега: " + ((Track) let[0]).getLength());
        System.out.println("Высота стены: " + ((Wall) let[1]).getHeight());
        System.out.println("Длина заплыва: " + ((Water) let[2]).getLength());
        System.out.println();
    }
    public void passObstacles(Team team){
        for(Animal animal : team.teamAnimal){
            for(Let l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}