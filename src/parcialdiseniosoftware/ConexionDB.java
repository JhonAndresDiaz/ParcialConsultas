
package parcialdiseniosoftware;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author diaza
 */
public class ConexionDB {
    
    private final String base = "hospital";
    private final String user = "root";
    private final String password = "";

    private final String url = "jdbc:mariadb://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexion establecida");
        } catch(SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;        
    } 
}
