package Ex_01;

public class Main {

    public static void main(String[] args) {
        Carro BMW = new Carro("BMW","Serie1",2005,500,600,TipoCombustivel.DIESEL,4);

        Carro Lambo = new Carro("lAMBO","Classic",2010,900,5000,TipoCombustivel.GASOLINA,15);


        BMW.distancia(500);

//e-
       Carro vencedor= BMW.corrida(Lambo);

       vencedor.exibirDetalhes();


    }



}
