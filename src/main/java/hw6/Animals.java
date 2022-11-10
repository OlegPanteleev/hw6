package hw6;

public class Animals {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Animals(String name){
        this.name = name;
    }

    public void swimming(){
        System.out.println("Животное плывёт.");
    }
    public void run(){
        System.out.println("Животное бежит.");
    }
}
