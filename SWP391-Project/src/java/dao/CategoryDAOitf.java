
package daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author ihtng
 */
public class CategoryDAOitf {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public CategoryDAOitf() {
    }

    private void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
    }

   
}