package hello.core.solidSample.d;

public class User {
    private Database database;

    public User(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}
