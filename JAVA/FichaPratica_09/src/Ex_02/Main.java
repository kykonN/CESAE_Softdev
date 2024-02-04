package Ex_02;

public class Main {
// Construtor dos objetos !!
    public static void main(String[] args) {
        Cao jorge = new Cao("bobi","buldog");
        Cao Palmira = new Cao("Palmira","Pincha");
        Cao fofi = new Cao("Fofi","Pastor");

//a
        System.out.println("latido "+jorge.getLatido());

        System.out.println("latido "+Palmira.getLatido());

jorge.setLatido("Uuuuuuu");

        System.out.println("latido "+jorge.getLatido());

        System.out.println("latido "+Palmira.getLatido());
    }



}
