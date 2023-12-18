import java.util.ArrayList;

public class PracticeOOP {

    public static void main(String[] args) {

        System.out.println("I love Java");
        System.out.println("-------");

        int myNumber1 = 5;
        int myNumber2 = 7;
        int myNumber3 = 2;

        int sumIs = (myNumber1+myNumber2) + myNumber3;

        System.out.println("My sun is " + sumIs);
        System.out.println("-------");

        ArrayList<String> myCars = new ArrayList<>();

        //Add Cars
        myCars.add("Ford");
        myCars.add("Tesla");
        myCars.add("Yugo");

        //Print All
        for (String cars : myCars){
            System.out.println(cars);
        }
        System.out.println("-------");

        //Update
        myCars.set(1, "BMW");

        //Print car
        System.out.println(myCars.get(1));
        System.out.println("-------");

        //Print All
        for (String cars : myCars){
            System.out.println(cars);
        }

        //Remove Car
        myCars.remove(2);

    }
}
