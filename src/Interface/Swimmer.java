package Interface;

public class Swimmer implements Swim, Breath {


    @Override
    public void breath() {
        System.out.println(" The swimmer is breathing very slow ");
    }

    @Override
    public void swim() {
        System.out.println(" The swimmer is swimming very fast ");
    }
}
