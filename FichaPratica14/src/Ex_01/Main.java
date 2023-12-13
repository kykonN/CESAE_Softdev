package Ex_01;

public class Main {


    public static void main(String[] args) {

        Retangulo retangulo_01 = new Retangulo("Amarelo",200,30);


        Triangulo triangulo_01 = new Triangulo("Azul",5,10);

        Circulo circulo = new Circulo("Rosa",5);




        System.out.println(retangulo_01.area());
        retangulo_01.mostrarCor();




    }
}
