package proyectogui.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        ConexionDB con = ConexionDB.getInstance();
        Persona p = new Persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("Av 1");
        p.setTelefono("888");

        TransaccionDB<Persona> t1 = new TransaccionDB<Persona>(p) {
            @Override
            public boolean execute(Connection conn) {
                boolean res = false;
                try {
                    String sql = "insert into persona (clave, nombre, direccion, telefono) values (?,?,?,?)";
                    PreparedStatement ps;
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, pojo.getClave());
                    ps.setString(2, pojo.getNombre());
                    ps.setString(3, pojo.getDireccion());
                    ps.setString(4, pojo.getTelefono());
                    ps.execute();
                    System.out.println("Se guardo");
                    res = true;
                } catch (SQLException ex) {
                    Logger.getLogger(TransaccionDBPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
                return res;
            }
        };

        boolean r = con.execute(t1);
        if (r) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
    }
}
