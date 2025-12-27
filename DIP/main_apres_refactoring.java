package dip;

public class Main2 {
    public static void main(String[] args) {
        Database database;

        database = new MySQLDatabase();
        OrderProcessor2 order = new OrderProcessor2(database);
        order.processOrder("'Données à sauvegarder'");

        database = new MongoDBDatabase();
        OrderProcessor2 order1 = new OrderProcessor2(database);
        order1.processOrder("'Données à sauvegarder'");
    }
}
