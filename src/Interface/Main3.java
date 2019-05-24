package Interface;

public class Main3 {

    public static void main(String[] args) {

        Swimmer swimmer = new Swimmer();

        Walker walker = new Walker();

        swimmer.breath();
        swimmer.swim();

        walker.breath();
        walker.walk();
    }
}
