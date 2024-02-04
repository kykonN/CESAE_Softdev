package Ex_02;

public class  Frango extends Tacos {

    @Override
    public void prepare() {
        System.out.println("A preparar taco frango");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco frango");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco frango");
    }
}
