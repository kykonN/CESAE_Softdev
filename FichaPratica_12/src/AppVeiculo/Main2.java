package AppVeiculo;

import AppVeiculo.Enums.TipoCombustivel;


import java.util.Scanner;

import static AppVeiculo.Enums.TipoCombustivel.*;

public class Main2 {


    public static void criarVeiculo (){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o tipo de carro que quer criar");
        System.out.println(" 1 - Carro \n 2- Mota \n 3-Camião \n");



        int op;

        op = input.nextInt();
        switch (op){

            case 1:
                System.out.println(" 1 -CARRO");
                break;
                case 2:
                System.out.println("2 - MOTA");
                break;
            case 3:
                System.out.println("3 - CAMIÃO");
                break;

                
        }



        String marca;
        String modelo;
        int anoFabrico;
        int potencia;
        int cilindrada;
        TipoCombustivel tipoCombustivel = null;
        double consumo;

        System.out.println(" ** Novo Veiculo **");
        System.out.println("\n");
        System.out.println("\n");

        // Marca

        System.out.print("Marca :");

        marca = input.next();

        // modelo

        System.out.print("Modelo :");
        modelo= input.next();

        //anoFabrico

        System.out.print("Ano :");

        anoFabrico = input.nextInt();

        System.out.print("Potencia :");

        potencia = input.nextInt();

        System.out.print("Cilindrada :");

        cilindrada = input.nextInt();

        System.out.println("Escolha o tipo de combustivel");
        System.out.println("1 - GASOLINA");
        System.out.println("2 - DIESEL");
        System.out.println("3 - GPL");
        System.out.println("4 - ELETRICO");

        int opuser;

        opuser = input.nextInt();

        switch (opuser){
            case 1 :
               tipoCombustivel = GASOLINA;
               break;

            case 2:
                tipoCombustivel = DIESEL;
                break;

            case 3:
                tipoCombustivel =GPL;
                break;

            case 4:
                tipoCombustivel = ELETRICO;

        }

        System.out.println("Consumo: ");

        consumo= input.nextDouble();

        System.out.println("Quantidade de passageiros: ");
        int passageiros = input.nextInt();

        System.out.println("Capacidade de carga (Camião) :");
        double capacidadeCarga=input.nextDouble();


        switch (op){
            case 1:
                Carro carro1 = new Carro(marca,modelo,anoFabrico,potencia,cilindrada,tipoCombustivel,consumo,passageiros);
                break;

            case 2:
                Mota mota1 = new Mota(marca,modelo,anoFabrico,potencia,cilindrada,tipoCombustivel,consumo);

                break;

            case 3:
                Camiao camiao1 = new Camiao(marca,modelo,anoFabrico,potencia,cilindrada,tipoCombustivel,consumo,capacidadeCarga);
                break;


        }







    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int op;

        do{

            System.out.println("[ 1 ] *********** <- Crie o seu veiculo -> ***********");
            System.out.println( "[ 2 ] *********** <- Calcular Consumo -> *********** ");
            System.out.println( "[ 3 ] *********** <- Fazer uma corrida Carro1 -> *********** ");
            System.out.println( "[ 4 ] *********** <- Fazer uma corrida Mota1 -> *********** ");
            System.out.println( "[ 5 ] *********** <- Fazer uma corrida Camião1 -> *********** ");
            System.out.println( "[ 6 ] *********** <- Se camião, permite calcular custos viagem de transporte de carga -> *********** ");
            System.out.println( "[ 6 ] *********** <- Se mota imprime imagem -> *********** ");

            System.out.println("Insira a opção pretendida  ");

            op=input.nextInt();

            switch (op){

                case 1:
                    criarVeiculo();
                    break;



            }
        }while (op != 0);
    }
}
