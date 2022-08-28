/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Filme;

/**
 *
 * @author dark_
 */
public interface IFilmeDAO {
    public void adiciona(Filme filme);
    public void altera(Filme filme);
    public void remove(int id);
    public List<Filme> listarTodos();
    public Filme getByID(int id);
}
