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
import negocio.Funcionario;

/**
 *
 * @author dark_
 */
public class FuncionarioDAO implements IFuncionarioDAO {
    private final Connection connection;
    public FuncionarioDAO(){
        this.connection = new ConFactory().getConnection();
    }

    @Override
    public void adiciona(Funcionario funcionario) {
        String sql = "insert into funcionario " + "(idFuncionario, nome, cpf, telefone, login, senha, tipo)" + " values (?, ?, ?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement stmt=connection.prepareStatement(sql);
            
            stmt.setInt(1,funcionario.getIdFuncionario());
            stmt.setString(2,funcionario.getNome());
            stmt.setString(3,funcionario.getCpf());
            stmt.setString(4,funcionario.getTelefone());
            stmt.setString(5,funcionario.getLogin());
            stmt.setString(6,funcionario.getSenha());
            stmt.setString(7,funcionario.getTipo());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        String sql = "delete from funcionario where funcionario.idFuncionario="+id;
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.execute();
        stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Funcionario> listarTodos() {
        try{
            List<Funcionario> funcionarios = new ArrayList<Funcionario>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from funcionario");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setLogin(rs.getString("login"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setTipo(rs.getString("tipo"));
                
                funcionarios.add(funcionario);
            }
        rs.close();
        stmt.close();
        return funcionarios;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Funcionario getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}