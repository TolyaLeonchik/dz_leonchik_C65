package lection13InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        String[] result = null;
        try (FileInputStream notes = new FileInputStream("src//lection13InputOutput//resources//names.txt")) {
            String text = "";
            int i = -1;
            while ((i = notes.read()) != -1) {
                //System.out.print((char) i);
                text = text + (char)i;
            }
            //result = text.split(",");
            System.out.println(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(Arrays.toString(result));
    }
}
