package Java;

import java.util.ArrayList;
import java.util.Random;



public class BoxToys{
    ArrayList<Toys> toysList = new ArrayList<>();
    public void addToy(Toys toy){
        toysList.add(toy);
    }
    
    
    public int QuantytyDolls(){
        int count = 0;
        for (int i = 0; i < toysList.size(); i++){
            if(toysList.get(i) instanceof Doll) count++;
        } 
        System.out.println(count/toysList.size()*100 + "%");
        return count;
    }
    public int QuantytyBears(){
        int count = 0;
        for (int i = 0; i < toysList.size(); i++){
            if(toysList.get(i) instanceof Teddybear) count++;
        } 
        System.out.println(count/toysList.size()*100 + "%");
        return count;
    }
    public int QuantytyRobots(){
        int count = 0;
        for (int i = 0; i < toysList.size(); i++){
            if(toysList.get(i) instanceof Robot) count++;
        } 
        System.out.println(count/toysList.size()*100 + "%");
        return count;
    }
    public int QuantytyGuns(){
            int count = 0;
            for (int i = 0; i < toysList.size(); i++){
                if(toysList.get(i) instanceof Gun) count++;
            } 
            System.out.println(count/toysList.size()*100 + "%");
            return count;
        }


    public Toys rafflePrizes(){
        Random rnd = new Random();
        int num = rnd.nextInt(0,toysList.size());
        Toys toy = toysList.get(num);
        return toy;
    }

    public void printToy(){
        for (Toys t : toysList){
            System.out.println();
            t.printToy();
        }
    }

    public void deleteToy(int id) {
        for(int i =0; i < toysList.size(); i++){
            if (toysList.get(i).getId() == id) toysList.remove(toysList.get(i));
        }
    }

    public BoxToys(){

    }

    
}
