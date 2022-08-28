/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Sala;

/**
 *
 * @author dark_
 */
public interface ISalaDAO {
    public void adiciona(Sala sala);
    public void altera(Sala sala);
    public void remove(int id);
    public List<Sala> listarTodos();
    public Sala getByID(int id);
}
