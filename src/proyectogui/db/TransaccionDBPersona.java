package proyectogui.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransaccionDBPersona extends TransaccionDB<Persona> {

    public TransaccionDBPersona(Persona pojo) {
        super(pojo);
    }
//    private Persona persona;
//    public TransaccionDBPersona(Persona persona){
//        this.persona = persona;
//    }
    
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

}
