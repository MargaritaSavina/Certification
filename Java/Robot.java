package Java;

public class Robot extends Toys{
    String name = "Робот";

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
