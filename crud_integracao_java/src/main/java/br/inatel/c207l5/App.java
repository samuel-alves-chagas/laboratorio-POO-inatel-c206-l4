package br.inatel.c207l5;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Database db = new Database();
        // User user1 = new User("Samuel", "111.111.111-11");
        // User user2 = new User("Ana", "111.111.111-11");
        // User user3 = new User("Julinho", "111.111.111-11");
        // db.insertUser(user2);
        // db.insertUser(user3);
        // db.insertUser(user3);
        db.ListUser();
        db.updateUser(1, "Denilson");
        db.ListUser();

    }
}
