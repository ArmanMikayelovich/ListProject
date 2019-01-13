package am.aca.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbWorker {
    private Connection connection = getConnection();

    public DbWorker() throws SQLException {
    }

    private Connection getConnection() throws SQLException {
        String jdbcPath = "jdbc:mariadb://127.0.0.1/list";
        String user = "root";
        String password = "9999";

        Connection connection = DriverManager.getConnection(jdbcPath,user,password);
        return connection;

    }



    public void registerUser(String first) {
        //TODO
    }
    public void editUser() {
        //TODO
    }
    public void removeUser() {
        //TODO
    }

    public void createProduct() {
        //TODO
    }

    public void editProduct() {
        //TODO
    }
    public void deleteProduct() {
        //TODO
    }

}
