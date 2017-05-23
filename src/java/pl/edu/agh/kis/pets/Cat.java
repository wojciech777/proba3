package pl.edu.agh.kis.pets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by wojtek on 23.05.17.
 */
public class Cat extends Pet {
    private boolean dangerous;
    final static String FILENAME = "src/resources/tekst.txt";

    public Cat(String name, int weight, boolean dangerous) {
        super(name, weight);
        this.dangerous = dangerous;
    }

    public static void displayResource(){
        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

//            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }



    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }


    public static void main(String[] args){
       displayResource();
    }

}
