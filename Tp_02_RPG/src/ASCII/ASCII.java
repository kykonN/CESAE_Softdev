package ASCII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASCII {


    /**
     * Metodo que lê e imprime um ficheiro
     * @param filePath
     * @throws FileNotFoundException
     */
    public static void imprmirFile(String filePath) throws FileNotFoundException {


        Scanner novoscaner = new Scanner((new File(filePath)));



        while (novoscaner.hasNextLine()) {
            System.out.println(novoscaner.nextLine());

        }


    }
}