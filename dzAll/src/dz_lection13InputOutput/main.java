package dz_lection13InputOutput;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {

        String[] result = null;
        Scanner sc = new Scanner(System.in);
        //String path = sc.nextLine();    //"src//dz_lection13InputOutput//resources//Documents.txt"
        try (FileInputStream line = new FileInputStream("src//dz_lection13InputOutput//resources//Documents.txt")) {
            String text = "";
            int i = -1;
            while ((i = line.read()) != -1) {
                text = text + (char) i;
            }
            result = text.split("\r\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream validOutput = new FileOutputStream("src//dz_lection13InputOutput//resources//Valid.txt");
             FileOutputStream notValidOutput = new FileOutputStream("src//dz_lection13InputOutput//resources//NotValid.txt")) {

            for (String s : result) {
                boolean isValidFile = ((s.contains("contract") && s.indexOf("c") == 0) || (s.contains("docnum") && s.indexOf("d") == 0))
                        && s.length() == 15;
                System.out.print(s);

                byte[] buffer = s.getBytes();

                if (isValidFile) {
                    System.out.print(" - Valid\n");

                    validOutput.write(buffer, 0, buffer.length);
                    validOutput.write("\r\n".getBytes());
                } else {
                    System.out.print(" - Not Valid\n");

                    notValidOutput.write(buffer, 0, buffer.length);
                    if (s.length() != 15) {
                        notValidOutput.write(" - Неверное количество символов\r\n".getBytes());
                    } else {
                        notValidOutput.write(" - Неверное имя документа\r\n".getBytes());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
