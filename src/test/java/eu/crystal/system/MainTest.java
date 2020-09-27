package eu.crystal.system;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MainTest {
    @Test
    public void testSerialization() {
        String expected = "\nValues: \n" + 12345 + "\n" + 12.345 + "\n" + true + "\n" + "Sir de caractere";

        try {
            //Main.serialization();
            Assert.assertEquals(expected, Main.deSerialization());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
