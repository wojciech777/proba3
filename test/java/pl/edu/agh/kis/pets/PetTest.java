package pl.edu.agh.kis.pets;

import static org.junit.Assert.*;

/**
 * Created by wojtek on 23.05.17.
 */
public class PetTest {
    @org.junit.Test
    public void getName() throws Exception {
        Pet zwierze  = new Cat("kotek",2,false);

        assertEquals(zwierze.getName(),"kotek");
    }


}