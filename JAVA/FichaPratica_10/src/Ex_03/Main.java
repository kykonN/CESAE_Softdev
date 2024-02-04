package Ex_03;

public class Main {

    public static void main(String[] args) {

        Animal Enguia = new Animal("Billie", "marciana", "Anais de jupiter", 40, new String[]{
                "banana", "bolachas", "cabidela", "arroz", "atum"});


        Enguia.comer(90,"bolachas");
        System.out.println("\n");
        Enguia.comer(9000,"BacalhauBébé");

    }
}
