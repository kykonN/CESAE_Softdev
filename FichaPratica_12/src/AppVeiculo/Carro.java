package AppVeiculo;

import AppVeiculo.Enums.TipoCombustivel;

public class Carro extends Veiculo {

    private int quantidadePassageiros;

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, int quantidadePassageiros) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo);
        this.quantidadePassageiros = quantidadePassageiros;


    }

    public double calcularCusto(double Viagem) {

        if (this.getTipoCombustivel() == TipoCombustivel.DIESEL) {
            return this.distancia(Viagem) * 1.95;
        }

        if (this.getTipoCombustivel() == TipoCombustivel.GASOLINA) {
            return this.distancia(Viagem) * 2.10;
        }

        if (this.getTipoCombustivel()==TipoCombustivel.GPL){
            return this.distancia(Viagem)*1.15;
        }
        if (this.getTipoCombustivel()==TipoCombustivel.ELETRICO){
            return this.distancia(Viagem)*0.12;
        }

        return this.distancia(Viagem);


    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Passageiros : "+ this.quantidadePassageiros);
    }
}
