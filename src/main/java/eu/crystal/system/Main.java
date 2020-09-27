package eu.crystal.system;

import java.io.*;
import java.util.logging.Logger;

/**
 * Serialization of primitive types
 */
public class Main {

    // Create a Logger
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        logger.info("Start program");
        serialization();
        logger.info("End program" + deSerialization());
    }

    /**
     * Serialization
     */
    public static void serialization() throws IOException {
        FileOutputStream fos = new FileOutputStream("test.dat");
        DataOutputStream out = new DataOutputStream(fos);

        out.writeInt(12345);
        out.writeDouble(12.345);
        out.writeBoolean(true);
        out.writeUTF("Sir de caractere");
        out.flush();
        fos.close();
    }

    /**
     * DeSerialization
     */
    public static String deSerialization() throws IOException {
        FileInputStream fis = new FileInputStream("test.dat");
        DataInputStream in = new DataInputStream(fis);
        int i = in.readInt();
        double d = in.readDouble();
        boolean b = in.readBoolean();
        String s = in.readUTF();
        fis.close();

        return "\nValues: \n" + i + "\n" + d + "\n" + b + "\n" + s;
    }

}

