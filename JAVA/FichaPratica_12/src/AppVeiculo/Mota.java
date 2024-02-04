package AppVeiculo;

import AppVeiculo.Enums.TipoCombustivel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends  Veiculo {

    public Mota(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo);
    }



    public void imprimirMota () throws FileNotFoundException {

        File mota = new File("Ficheiros/mota.txt");

        Scanner imprimirMota = new Scanner(mota);

        String Linha;

      while (imprimirMota.hasNextLine()){
          Linha=imprimirMota.nextLine();
          System.out.println(Linha);
      }




    }
}
