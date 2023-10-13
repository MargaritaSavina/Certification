package Java;

public class Teddybear extends Toys{
    String name = "Плюшевый медведь";
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
