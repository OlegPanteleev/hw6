package hw6;

public class ClassHW6 {

    public static void main(String[] args) {

        Animals[] animalsArray = new Animals[6];
        animalsArray[0] = new CatHW6("Персик", 5, 100);
        animalsArray[1] = new DogHW6("Шарик", 7, 200);
        animalsArray[2] = new CatHW6("Барсик", 5, 250);
        animalsArray[3] = new DogHW6("Бобик", 15, 300);
        animalsArray[4] = new CatHW6("Снежок", 3, 150);
        animalsArray[5] = new DogHW6("Бублик", 9, 550);

        animalsInfo(animalsArray);
    }

    static void animalsInfo(Animals[] animalsArray) {
        for (Animals animals : animalsArray) {
            animals.swimming();
            animals.run();
            if (animals instanceof CatHW6) {
                System.out.printf("Кот %s не может плавать.\n", ((CatHW6) animals).name);
            }
            if ((animals instanceof CatHW6) && ((CatHW6) animals).runLenght > 200) {
                System.out.printf("Кот %s не может столько пробежать. \n", ((CatHW6) animals).name);
            } else if (animals instanceof CatHW6) {
                System.out.printf("Кот %s пробежал: %d m.\n", ((CatHW6) animals).name, ((CatHW6) animals).runLenght);
            }
            if ((animals instanceof DogHW6) && ((DogHW6) animals).swimLenght > 10) {
                System.out.printf("Собака %s не может столько проплыть. \n", ((DogHW6) animals).name);
            } else if (animals instanceof DogHW6) {
                System.out.printf("Собака %s проплыла: %d m.\n", ((DogHW6) animals).name, ((DogHW6) animals).runLenght);
            }
            if ((animals instanceof DogHW6) && ((DogHW6) animals).runLenght > 500) {
                System.out.printf("Собака %s не может столько пробежать. \n", ((DogHW6) animals).name);
            } else if (animals instanceof DogHW6) {
                System.out.printf("Собака %s пробежела: %d m.\n", ((DogHW6) animals).name, ((DogHW6) animals).runLenght);
            }

        }

    }

    static void animalCounter(Animal[] animalsArray) {

    }

}
