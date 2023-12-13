package AppVeiculo;

import AppVeiculo.Enums.TipoCombustivel;
public class Veiculo {

    //1- Definir atributos a definir para o objeto;
    //2- Metodo construtor para perimetro e area do retangulo;
    //3- lista de comportamento ou metodo;
    /* ----------------------------------------------------------------------------------------------------------------*/

    private String marca;

    private String modelo;

    private int ano;

    private int potencia;

    private int cilindrada;

    private TipoCombustivel tipoCombustivel;

    private double consumo;

    public Veiculo(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
    }

    public void exibirDetalhes(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.potencia);
        System.out.println(this.cilindrada);
        System.out.println(this.tipoCombustivel);
        System.out.println(this.consumo);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    /**
     * Metodo Ligar
     *
     */
    public void ligar() {

// 1- Descobrir a idade do carro (adiciona variavel para ver idade - ano atual)
        int idade = 2023 - this.ano;

        if (idade > 30) {

            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... custa a pegar ... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");

            } else {
                System.out.println("Custa a pegar...O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        } else {
            if (potencia >= 250) {
                System.out.println("O carro está ligado!");
                System.out.println("VRUUUUUMMMMMMM");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("Vruummmmmmmmmmmm");
            }
        }


    }

    /**
     * Metodo Corrida
     *
     * @param adversario
     * @return
     */
    public Veiculo corrida(Veiculo adversario) {
        if (this.potencia > adversario.potencia) {
         // Ganha o meu carro por potencia
            return this; // Devolve o meu carro (objeto que invocou o método)
        } else {

            if (this.potencia < adversario.potencia) {
                // Ganha o adversario por potencia
                return adversario;
            } else {
                // Empate de potencia
                if (this.cilindrada > adversario.cilindrada) {
                    // Ganha o meu carro por cilindrada
                    return this;
                } else {

                    if (this.cilindrada < adversario.cilindrada) {
                        // Ganha o adversario por cilindrada
                        return adversario;
                    } else {
                        // Empate de cilindrada

                        if (this.ano > adversario.ano) {
                            return this;
                        } else {

                            if (this.ano < adversario.ano) {
                                // Ganha o adversario por idade
                                return adversario;
                            }

                        }
                    }

                }
            }

        }

        return null;
    }

    /**
     * Metodo consumo
     * @param km
     * @return
     */
    public double distancia(double km) {


        // consumo = 100km
        // x = distancia



        km = (km*this.consumo)/100;
        System.out.println(km);

        return  km;








    }
}


