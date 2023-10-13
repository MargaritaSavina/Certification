package Java;



public  class Toys {
    protected int id;
    static int counter = 100;
    protected String name;
    {
        id =++ counter;
    }

    public void printToy(){
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
