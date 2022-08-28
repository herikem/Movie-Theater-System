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
import negocio.Cadeira;

/**
 *
 * @author dark_
 */
public class CadeiraDAO implements ICadeiraDAO {
    private final Connection connection;
    public CadeiraDAO(){
        this.connection = new ConFactory().getConnection();
    }
    @Override
    public void adiciona(Cadeira cadeira) {
        //temporario, apenas para adicionar cadeiras fixas no DB.
        String sql = "insert into cadeira " + "(idCadeira, idSala, numero, estado)" + " values (?, ?, ?, ?)";
    
        try {
            PreparedStatement stmt=connection.prepareStatement(sql);
            
            stmt.setInt(1,cadeira.getIdCadeira());
            stmt.setInt(2,cadeira.getIdSala());
            stmt.setString(3,cadeira.getNumero());
            stmt.setString(4,cadeira.getEstado());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Cadeira cadeira) {
        String sql ="update cadeira set estado = ? where cadeira.idSala = ? and cadeira.numero =?";
        
        try{
            PreparedStatement stmt=connection.prepareStatement(sql);
            stmt.setString(1,cadeira.getEstado());
            stmt.setInt(2,cadeira.getIdSala());
            stmt.setString(3, cadeira.getNumero());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int id) {
        String sql = "delete from cadeira where cadeira.idCadeira="+id;
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.execute();
        stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Cadeira> listarAlguns(int x, String y) {
        try{
            List<Cadeira> cadeiras = new ArrayList<Cadeira>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from cadeira where cadeira.idSala="+x+" and cadeira.numero="+"'"+y+"'");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cadeira cadeira = new Cadeira();
                cadeira.setIdCadeira(rs.getInt("idCadeira"));
                cadeira.setIdSala(rs.getInt("idSala"));
                cadeira.setNumero(rs.getString("numero"));
                cadeira.setEstado(rs.getString("estado"));
                
                cadeiras.add(cadeira);
            }
        rs.close();
        stmt.close();
        return cadeiras;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Cadeira> listarTodos(){
        try{
            List<Cadeira> cadeiras = new ArrayList<Cadeira>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from cadeira");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cadeira cadeira = new Cadeira();
                cadeira.setIdCadeira(rs.getInt("idCadeira"));
                cadeira.setIdSala(rs.getInt("idSala"));
                cadeira.setNumero(rs.getString("numero"));
                cadeira.setEstado(rs.getString("estado"));
                
                cadeiras.add(cadeira);
            }
        rs.close();
        stmt.close();
        return cadeiras;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public Cadeira getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
