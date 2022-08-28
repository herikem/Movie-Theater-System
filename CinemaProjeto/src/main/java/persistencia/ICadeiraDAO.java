/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Cadeira;

/**
 *
 * @author dark_
 */
public interface ICadeiraDAO {
    public void adiciona(Cadeira cadeira);
    public void altera(Cadeira cadeira);
    public void remove(int id);
    public List<Cadeira> listarAlguns(int x, String y);
    public List<Cadeira> listarTodos();
    public Cadeira getByID(int id);
}
