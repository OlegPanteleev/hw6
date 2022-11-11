package hw6;

public class CatHW6 extends Animals{

    protected int swimLenght;
    protected int runLenght;

    public int getSwimLenght() {
        return swimLenght;
    }

    public void setSwimLenght(int swimLenght) {
        this.swimLenght = swimLenght;
    }

    public int getRunLenght() {
        return runLenght;
    }

    public void setRunLenght(int runLenght) {
        this.runLenght = runLenght;
    }

    public CatHW6(String name, int swimLenght, int runLenght) {
        super(name);
        this.swimLenght = swimLenght;
        this.runLenght = runLenght;
    }

    @Override
    public void swimming() {
        System.out.println("Кот плывет.");
        //super.swimming();
    }

    @Override
    public void run() {
        System.out.println("Кот бежит.");
    }
}
