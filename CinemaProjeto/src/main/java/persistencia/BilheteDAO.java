/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Bilhete;

/**
 *
 * @author dark_
 */
public class BilheteDAO implements IBilheteDAO {
    private final Connection connection;
    public BilheteDAO(){
        this.connection = new ConFactory().getConnection();
    }

    @Override
    public void adiciona(Bilhete bilhete) {
        String sql = "insert into bilhete " + "(idNota, idFuncionario, data, cpf, tipoPagamento, qtdIngressos)" + " values (?, ?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement stmt=connection.prepareStatement(sql);
            
            stmt.setInt(1,bilhete.getIdNota());
            stmt.setInt(2,bilhete.getIdFuncionario());
            stmt.setDate(3, new Date(bilhete.getData().getTimeInMillis()));
            stmt.setString(4,bilhete.getCpf());
            stmt.setString(5,bilhete.getTipoPagamento());
            stmt.setInt(6,bilhete.getQtdIngressos());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Bilhete bilhete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bilhete> listarAlguns() {
        try{
            List<Bilhete> bilhetes = new ArrayList<Bilhete>();
            PreparedStatement stmt = this.connection.
            prepareStatement("SELECT * FROM bilhete ORDER BY idNota DESC LIMIT 1");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Bilhete bilhete = new Bilhete();
                bilhete.setIdNota(rs.getInt("idNota"));
                bilhete.setIdFuncionario(rs.getInt("idFuncionario"));
                
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("data"));
                bilhete.setData(data);

                bilhete.setCpf(rs.getString("cpf"));
                bilhete.setTipoPagamento(rs.getString("tipoPagamento"));
                bilhete.setQtdIngressos(rs.getInt("qtdIngressos"));
                
                bilhetes.add(bilhete);
            }
        rs.close();
        stmt.close();
        return bilhetes;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Bilhete> listarTodos(){
        try{
            List<Bilhete> bilhetes = new ArrayList<Bilhete>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from bilhete");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Bilhete bilhete = new Bilhete();
                bilhete.setIdNota(rs.getInt("idNota"));
                bilhete.setIdFuncionario(rs.getInt("idFuncionario"));
                
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("data"));
                bilhete.setData(data);

                bilhete.setCpf(rs.getString("cpf"));
                bilhete.setTipoPagamento(rs.getString("tipoPagamento"));
                bilhete.setQtdIngressos(rs.getInt("qtdIngressos"));
                
                bilhetes.add(bilhete);
            }
        rs.close();
        stmt.close();
        return bilhetes;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public Bilhete getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
