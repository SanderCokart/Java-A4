package assignment4.Model;

import java.util.Random;

public class Model{
    private String nameArray[] = {"Donald","Jack", "Jade", "Michael", "Luna"};

    public Model(){

    }

    public String getNameArray() {
        return nameArray[generateRandomNumber()];
    }


    private int generateRandomNumber(){
        Random rand = new Random();
        int output = rand.nextInt(5);

        return output;
    }

}
