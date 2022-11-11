package hw6;

public abstract class Animals {

    protected String name;
    protected static int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animals(String name) {
        this.name = name;
    }

    public void swimming(){
        System.out.println("Животное плывёт.");
    }
    public void run(){
        System.out.println("Животное бежит.");
    }
}
