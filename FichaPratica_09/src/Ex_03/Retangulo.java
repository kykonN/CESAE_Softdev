package Ex_03;

public class Retangulo {

    //Definir atributos para o objeto;
    private double largura;

    private double altura;


    /**
     * Metodo construtor para perimetro e area do retangulo
     * @param largura
     * @param altura
     */
    public Retangulo (double largura, double altura){

    this.largura=largura;
    this.altura=altura;
}

// lista de comportamento ou metodo
public  double calcularArea(){
    return this.largura * this.altura;

    }
    public  double calcularPerimetro(){
        return (this.largura *2) + ( this.altura *  2);

    }



}
