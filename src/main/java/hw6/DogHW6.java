package hw6;

public class DogHW6 extends Animals{

    protected int swimLenght;
    protected int runLenght;

    public int getSwimLenght() {
        return swimLenght;
    }

    public void setSwimLenght(int swimLenght) {
        this.swimLenght = swimLenght;
    }

    public DogHW6(String name, int swimLenght, int runLenght) {
        super(name);
        this.swimLenght = swimLenght;
        this.runLenght = runLenght;
    }

    @Override
    public void swimming() {
        System.out.println("Собака плывет.");
    }

    @Override
    public void run() {
        System.out.println("Собака бежит.");
    }
}
