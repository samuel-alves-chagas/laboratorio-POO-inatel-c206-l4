package br.inatel.c207l5;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Database db = new Database();
        User user1 = new User("Samuel", "111.111.111-11");
        db.insertUser(user1);
    }
}
