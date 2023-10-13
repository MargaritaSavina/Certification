package Java;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Создайте коробку с игрушками(для окончания ввода введите 'q'): \n 1. Кукла \n 2. Плюшевый медведь\n" + 
        " 3. Робот \n 4. Игрушечный пистолет" );
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        BoxToys box = new BoxToys();
        while(!in.equals("q")){
            if (in.equals("1")) box.addToy(new Doll());
            else if(in.equals("2")) box.addToy(new Teddybear());
            else if(in.equals("3")) box.addToy(new Robot());
            else if(in.equals("4")) box.addToy(new Gun());

            else {System.out.println("Нет такой игрушки");}
            in = sc.nextLine();
        }

        box.printToy();
        System.out.println("\n Призовая игрушка:");
        Toys prize = box.rafflePrizes();
        prize.printToy();
    
        try (FileWriter writer = new FileWriter("C:/Users/user/Desktop/Certification/Java/Prizes.txt")){
                writer.write("Имя:" + prize.getName() + "  Id:" + prize.getId());
        } catch(Exception e) {
            e.printStackTrace();
        } 
        box.deleteToy(prize.getId());
        System.out.println();
        box.printToy();
        
        


    
    }


}
