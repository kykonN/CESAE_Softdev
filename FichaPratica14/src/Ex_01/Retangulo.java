package Ex_01;

public class Retangulo extends FiguraGeometrica {

    private double cumprimento;

    private double largura;

    public Retangulo(String cor, double cumprimento, double largura) {
        super(cor);
        this.cumprimento = cumprimento;
        this.largura = largura;
    }


    @Override
    public double area() {
        return cumprimento*largura;
    }

    @Override
    public double perimetro() {
        return (cumprimento+cumprimento)+(largura+largura);
    }
}
