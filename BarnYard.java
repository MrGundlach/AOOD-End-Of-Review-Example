import java.util.ArrayList;

public class BarnYard {
    public static void main(String[] args) {

        // create a 2d Array for stalls in barnyard
        Animal[][] barnYard = new Animal[2][3];
        
        // put animals in barn
        barnYard[0][0] = new Cow("Bessie");
        barnYard[1][1] = new Pig("Piglet", 3);
        barnYard[1][2] = new Cow("Patches"); 

        // list out
        for (int row = 0; row < barnYard.length; row++) {
            for (int col = 0; col < barnYard[row].length; col++) {
                if (barnYard[row][col] != null) 
                    System.out.print(barnYard[row][col].speak());
                else
                    System.out.println("{empty}");
                System.out.print(" | ");
            }
            System.out.println();
        }

        // ArrayList of Animals
        ArrayList<Object> listOfAnimals = new ArrayList<Object>();
        listOfAnimals.add("These are my many animals...");
        listOfAnimals.add(new Cow("Bessie"));
        listOfAnimals.add(new Pig("Piglet"));
        listOfAnimals.add(1, new Cow("Patches"));
        listOfAnimals.add("animal");

        for (Object a : listOfAnimals) {
            //if (a instanceof Animal)
            try {
                System.out.println(((Animal) a).speak());
            }
            //else 
            catch (Exception ex) {
                //ex.printStackTrace();
                System.out.println(a);
            }
        }

    }
}
