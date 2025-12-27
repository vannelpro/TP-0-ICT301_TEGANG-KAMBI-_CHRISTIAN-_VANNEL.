package dip;
public class OrderProcessor2 {
    private Database database;

    public OrderProcessor2(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}


interface Database {
    public void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}
