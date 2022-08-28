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
import java.util.HashSet;
import java.util.List;
import negocio.GerenciarFilmes;

/**
 *
 * @author dark_
 */
public class GerenciarFilmesDAO implements IGerenciarFilmesDAO {
    private final Connection connection;
    public GerenciarFilmesDAO(){
        this.connection = new ConFactory().getConnection();
    }

    @Override
    public void adiciona(GerenciarFilmes gerenciarFilmes) {
        String sql = "insert into filme_sala " + "(idFilmeSala, idSala, idFilme, nomeFilme, horario)" + " values (?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement stmt=connection.prepareStatement(sql);
            
            stmt.setInt(1,gerenciarFilmes.getIdFilmeSala());
            stmt.setInt(2,gerenciarFilmes.getIdSala());
            stmt.setInt(3,gerenciarFilmes.getIdFilme());
            stmt.setString(4,gerenciarFilmes.getFilme());
            stmt.setString(5,gerenciarFilmes.getHorario());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(GerenciarFilmes gerenciarFilmes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GerenciarFilmes> listarTodos() {
        try{
            List<GerenciarFilmes> gerenciarFilmes = new ArrayList<GerenciarFilmes>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from filme_sala");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                GerenciarFilmes gerenciarFilme = new GerenciarFilmes();
                gerenciarFilme.setIdFilmeSala(rs.getInt("idFilmeSala"));
                gerenciarFilme.setIdSala(rs.getInt("idSala"));
                gerenciarFilme.setIdFilme(rs.getInt("idFilme"));
                gerenciarFilme.setFilme(rs.getString("nomeFilme"));
                gerenciarFilme.setHorario(rs.getString("horario"));

                gerenciarFilmes.add(gerenciarFilme);
            }
        rs.close();
        stmt.close();
        return gerenciarFilmes;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public GerenciarFilmes getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
