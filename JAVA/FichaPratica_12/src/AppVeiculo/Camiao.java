package AppVeiculo;

import AppVeiculo.Enums.TipoCombustivel;

public class Camiao extends Veiculo {
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, double capacidadeCarga) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double Viagem(double carga, double km) {
        double kmConsumo = 0;

        if (carga <= capacidadeCarga) {
            double consumoAdicional = (carga / 100) * 0.1;

            kmConsumo = carga / 1000;

            kmConsumo = this.distancia(km) + kmConsumo + consumoAdicional;

            double custoViagem = kmConsumo * 1.95; // Custo por litro
            System.out.println("Custo da viagem: " + custoViagem + "€");
        } else {
            System.out.println("Não pode aceitar a viagem por ter excesso de carga");
        }

        return kmConsumo;
    }
}
