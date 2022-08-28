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
import negocio.Filme;

/**
 *
 * @author dark_
 */
public class FilmeDAO implements IFilmeDAO{

    private final Connection connection;
    public FilmeDAO(){
        this.connection = new ConFactory().getConnection();
    }
    @Override
    public void adiciona(Filme filme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Filme filme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Filme> listarTodos() {
        try{
            List<Filme> filmes = new ArrayList<Filme>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from filme");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("idFilme"));
                filme.setDuracao(rs.getString("duracao"));
                filme.setGenero(rs.getString("genero"));
                filme.setDiretor(rs.getString("diretor"));
                filme.setNomeFilme(rs.getString("nomeFilme"));
                
                filmes.add(filme);
            }
        rs.close();
        stmt.close();
        return filmes;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Filme getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
