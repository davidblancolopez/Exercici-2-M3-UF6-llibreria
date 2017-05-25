
package Control;

import Persistencia.ConfigConnection;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class GestioLlibre extends HttpServlet{
    private Connection con;
    private ConfigConnection dbCon;
    
    @Override
    public void init() throws ServletException{
        super.init();
        dbCon = new ConfigConnection(this.getInitParameter("driver"),
                this.getInitParameter("cadenaConnexioInit"),
                this.getInitParameter("usuari"), this.getInitParameter("contrasenya"));
    }
    
    
}
