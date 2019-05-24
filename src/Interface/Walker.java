package Interface;

public class Walker implements Walk, Breath {


    @Override
    public void breath() {
        System.out.println(" The walker is breathing very hard ");
    }

    @Override
    public void walk() {
        System.out.println(" The walker is walking too much ");
    }
}
