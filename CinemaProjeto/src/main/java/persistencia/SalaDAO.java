/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Sala;

/**
 *
 * @author dark_
 */
public class SalaDAO implements ISalaDAO{

    private final Connection connection;
    public SalaDAO(){
        this.connection = new ConFactory().getConnection();
    }
    @Override
    public void adiciona(Sala sala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Sala sala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sala> listarTodos() {
        try{
            List<Sala> salas = new ArrayList<Sala>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from sala");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setQtd_cadeiras(rs.getInt("qtd_cadeiras"));
                sala.setIdSala(rs.getString("idSala"));
                
                salas.add(sala);
            }
        rs.close();
        stmt.close();
        return salas;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Sala getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
