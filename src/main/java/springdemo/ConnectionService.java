package springdemo;

public interface ConnectionService {
    NeoConnection connect(String dbName, String username, String password);

}
