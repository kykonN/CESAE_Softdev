package Ex_02;

public class Vaca extends Tacos {

    @Override
    public void prepare() {
        System.out.println("A preparar taco Carne Vaca");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco Carne Vaca");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco Carne Vaca");
    }
}
