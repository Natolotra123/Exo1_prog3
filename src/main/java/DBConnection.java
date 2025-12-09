import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public  String URL = "jdbc:postgresql://localhost:5432/product_management_db";
    public  String USER = "product_manager_user";
    public  String PASSWORD = "123456";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}