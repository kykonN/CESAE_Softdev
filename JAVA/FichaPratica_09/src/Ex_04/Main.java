package Ex_04;

public class Main {

    //1-Instanciar a classe

    public static void main(String[] args) {

        Circulo circulo_01 = new Circulo(2);
        Circulo circulo_02 = new Circulo(9);

//     calcular  e apresentar area e perimetro;

        System.out.println("Area " + circulo_01.calcularArea());

        System.out.println("Perimetro " + circulo_01.calcularperimetro());


        System.out.println("Area " + circulo_02.calcularArea());

        System.out.println("Perimetro " + circulo_02.calcularperimetro());
    }

}
