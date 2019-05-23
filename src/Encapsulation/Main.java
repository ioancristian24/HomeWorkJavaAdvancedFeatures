package Encapsulation;

public class Main {

    public static void main(String[] args) {

    User user = new User("cris1984","Cristian","Popescu");

    user.generateDisplayName("cris1984");

    User user1 = new User("ion78", "Ion", "Georgescu");

    user1.generateDisplayName("ion78");

    User user2 = new User("marian94","Marian","Miron");

    user2.generateDisplayName("marian94");

    }
}
