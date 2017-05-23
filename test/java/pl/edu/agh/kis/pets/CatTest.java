package pl.edu.agh.kis.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wojtek on 23.05.17.
 */
public class CatTest {
    @Test
    public void isDangerous() throws Exception {
        Cat cat = new Cat("mialczyk",2,false);

        assertEquals(cat.isDangerous(),false);
    }

}