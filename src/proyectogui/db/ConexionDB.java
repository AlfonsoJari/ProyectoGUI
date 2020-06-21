package proyectogui.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {

    private static ConexionDB con = null;

    public static ConexionDB getInstance() {
        if (con == null) {
            con = new ConexionDB();
        }
        return con;
    }

    private static Connection conn = null;

    private ConexionDB() {
        String urlDatabase = "jdbc:postgresql://127.0.0.1:5432/javacrud";
        try {
            conn = DriverManager.getConnection(urlDatabase, "postgres", "postgres");
        } catch (Exception ex) {
            System.out.println("Ocurrio un error: " + ex.getMessage());
        }
        System.out.println("La conexion se realizo sin problemas");
    }

    public boolean execute(String sql) {
        boolean res = false;
        try {
            Statement st = conn.createStatement();
            st.execute(sql);
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public boolean execute(TransaccionDB t){
        boolean res = false;
        res = t.execute(conn);
        return res;
    }

}
