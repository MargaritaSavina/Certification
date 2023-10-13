package Java;

public class Doll extends Toys{
    String name = "Кукла";

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void printToy(){
        System.out.printf("Имя: %s  Id: %s",this.name,id);
    }
    
}
