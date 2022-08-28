/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Funcionario;

/**
 *
 * @author dark_
 */
public interface IFuncionarioDAO {
    public void adiciona(Funcionario funcionario);
    public void altera(Funcionario funcionario);
    public void remove(int id);
    public List<Funcionario> listarTodos();
    public Funcionario getByID(int id);
}
