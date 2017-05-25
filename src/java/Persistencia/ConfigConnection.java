
package Persistencia;
import java.sql.*;
import java.util.logging.Logger;

public class ConfigConnection {

    private Connection con;
    private String cadenaConnection;
    private String usuari;
    private String contrasenya;
    private String driver;
    private boolean obert;
        

    public ConfigConnection() {
        cadenaConnection = "jdbc:oracle:thin:@192.168.180.10:1521:INSLAFERRERI";
        usuari = "DAVIDBLANCO";
        contrasenya = "1423";
        driver = "oracle.jdbc.driver.OracleDriver";
    }

    public ConfigConnection(String driver, String cadenaConnection, String usuari, String contrasenya) {
        this.cadenaConnection = cadenaConnection;
        this.usuari = usuari;
        this.contrasenya = contrasenya;
        this.driver = driver;
    }

    public Connection getCon() {
        
        try{
            setObert(false);
            Class.forName(driver);
            con = DriverManager.getConnection(cadenaConnection, usuari, contrasenya);
            setObert(true);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
            //Logger.getLogger(ConfigConnection.class.getName()).log(level.);
        }
        
        return con;
    }

    public boolean isObert() {
        return obert;
    }

    public void setObert(boolean obert) {
        this.obert = obert;
    }

    public boolean tancar() throws SQLException{
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Connexió ja tancada.");
            return false;
        }
        return true;
    }
    
    
}