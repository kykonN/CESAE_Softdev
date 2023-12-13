package Ex_01;

public abstract class FiguraGeometrica {

    private String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }


    public void mostrarCor (){
        System.out.println("A forma geometrica é "+ this.cor);
    }


    // Abstrat metodo

    public abstract double area ();


    public abstract  double perimetro ();




}
