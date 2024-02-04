package Tools;



import Domain.Item.ArmaPrincipal;
import Domain.Item.ConsumivelCombate;
import Domain.Item.ItemHeroi;
import Domain.Item.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cvsreader {

    private String filePath;

    public Cvsreader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<ItemHeroi> readCSVToRepository() throws FileNotFoundException{

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        //saltar cabeçalho
        String linha = scanner.nextLine();

        ArrayList<ItemHeroi> arrayLoja = new ArrayList<>();

        while (scanner.hasNextLine()){

            linha = scanner.nextLine();
            String [] linhaDividada = linha.split(";");

            String tipo = linhaDividada[0];
            String nome = linhaDividada[1];
            int preco = Integer.parseInt(linhaDividada[2]);

            String herois = linhaDividada[3];
            herois=herois.replace("[","");
            herois=herois.replace("]","");
            String[] heroispermitidos = herois.split(",");


            int ataque = Integer.parseInt(linhaDividada[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividada[5]);
            int ataqueInstantaneo = Integer.parseInt(linhaDividada[6]);
            int vida = Integer.parseInt(linhaDividada[7]);
            int forca = Integer.parseInt(linhaDividada[8]);


            ItemHeroi itemHeroiAtual=null;

            switch (tipo){
                case "ArmaPrincipal":
                    itemHeroiAtual= new ArmaPrincipal(nome,preco,heroispermitidos,ataque,ataqueEspecial,ataqueInstantaneo);
                    break;

                case "ConsumivelCombate":
                    itemHeroiAtual= new ConsumivelCombate(nome,preco,heroispermitidos,ataqueInstantaneo,vida,forca);
                    break;

                case "Pocao":
                    itemHeroiAtual= new Pocao(nome,preco,heroispermitidos,vida,forca);
                    break;
            }


            arrayLoja.add(itemHeroiAtual);
        }

        return arrayLoja;
    }
}