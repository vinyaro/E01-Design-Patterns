package singleton;

public class DBConnection {

    private static DBConnection instancia;

    private String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DBConnection getInstancia(String connectionString){
        if (instancia == null){
            instancia = new DBConnection(connectionString);
        }
        return instancia;
    
    }

    public void connect() {
        System.out.println("Connectando ao banco: " + this.connectionString);
    }
}
