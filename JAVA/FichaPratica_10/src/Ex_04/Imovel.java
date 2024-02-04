package Ex_04;


//a. Crie um método para calcular o valor do imóvel com base nas seguintes regras:
//i. Apartamento: cada m2 vale 1000€.
//ii. Casa: cada m2 vale 3000€
//iii. Mansão: cada m2 vale 5000€
//iv. Para Restauro: preço total tem 50% de desconto
//v. Usada: preço total tem 10% de desconto
//vi. Nova: preço reflete sem desconto
//vii. Nova com alto acabamento: preço total valoriza 25%
//viii. Cada quarto incrementa 7500€ ao custo
//ix. Cada casa de banho incrementa 10500€ ao custo
//x. A piscina custa 1000/m2



public class Imovel {

    private String rua;

    private String nrporta;

    private String cidade;

    private double area ;

    private int nrquartos ;

    private int nrcasasdebanho ;

    private acabamento acabamento;

    private tipo_casa tipo_casa;

    private double areaPiscina;


    public Imovel(String rua, String nrporta, String cidade, double area, int nrquartos, int nrcasasdebanho, Ex_04.acabamento acabamento, Ex_04.tipo_casa tipo_casa, double areaPiscina) {
        this.rua = rua;
        this.nrporta = nrporta;
        this.cidade = cidade;
        this.area = area;
        this.nrquartos = nrquartos;
        this.nrcasasdebanho = nrcasasdebanho;
        this.acabamento = acabamento;
        this.tipo_casa = tipo_casa;
        this.areaPiscina = areaPiscina;

    }

    public double valorimovelTotal(){

        double valorimovel=0;
        double area=0;
        double valorimoveltotal;

        if (this.tipo_casa.equals(Ex_04.tipo_casa.APARTAMENTO)){
             area= this.area*1000;
        }
        if (this.tipo_casa.equals(Ex_04.tipo_casa.CASA)){
           area= this.area*3000;
        }
        if (this.tipo_casa.equals(Ex_04.tipo_casa.MANSAO)) {
            area = this.area*5000;
        }
        if (this.acabamento.equals(Ex_04.acabamento.RESTAURO)){
            valorimovel= (valorimovel*0.5)-valorimovel;
        }
        if (this.acabamento.equals(Ex_04.acabamento.USADA)){
            valorimovel=(valorimovel*.1)-valorimovel;
        }
        if (this.acabamento.equals(Ex_04.acabamento.NOVA)){

        }
        if (this.acabamento.equals(Ex_04.acabamento.ALTO_ACABAMENTO)){
            valorimovel=(valorimovel*0.25)+valorimovel;
        }
        double quartos= this.nrquartos*7500;

        double wc = this.nrcasasdebanho*10500;

        double piscina = this.areaPiscina*1000;

       valorimoveltotal= quartos + wc + piscina + valorimovel + area;

        System.out.println("O valor do imovel : "+ valorimoveltotal + " €");

        return valorimoveltotal;



    }


    public void exibirDetalhes (){

        System.out.println(this.area);
        System.out.println(this.cidade);
        System.out.println(this.rua);
        System.out.println(this.nrporta);
        System.out.println(this.acabamento);
        System.out.println(this.nrcasasdebanho);
        System.out.println(this.tipo_casa);
        System.out.println(valorimovelTotal());

    }



}
