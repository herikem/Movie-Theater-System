/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import negocio.BilheteNota;

/**
 *
 * @author dark_
 */
public class BilheteNotaDAO implements IBilheteNotaDAO {
    private final Connection connection;
    public BilheteNotaDAO(){
        this.connection = new ConFactory().getConnection();
    }
    @Override
    public void adiciona(BilheteNota bilheteNota) {
        String sql = "insert into item_bilhete " + "(idBilhete, preco, tipo, idNota, idCadeira, idFilmeSala)" + " values (?, ?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement stmt=connection.prepareStatement(sql);
            
            stmt.setInt(1,bilheteNota.getIdBilhete());
            stmt.setString(2,bilheteNota.getPreco());
            stmt.setString(3,bilheteNota.getTipo());
            stmt.setInt(4,bilheteNota.getIdNota());
            stmt.setInt(5,bilheteNota.getIdCadeira());
            stmt.setInt(6,bilheteNota.getIdFilmeSala());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(BilheteNota bilheteNota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BilheteNota> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BilheteNota getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
