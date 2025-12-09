import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    public final DBConnection dbConnection;

    public DataRetriever() {
        this.dbConnection = new DBConnection();
    }

    public List<Category> getAllCategory()throws SQLException {
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM Product_category Order by id";
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Category category = new Category(
                        rs.getInt("id"),
                        rs.getString("name")
                );
                categories.add(category);
            }
        }catch (SQLException e) {
                System.out.println("Erreur : Impossible de récupérer les catégories !");
                e.printStackTrace();
                throw e;
            }
            return categories;
    }


    public List<Product> getProductList(int page, int size) throws SQLException {
        List<Product> products = new ArrayList<>();
    }
}
