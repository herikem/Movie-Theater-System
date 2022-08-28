/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Bilhete;

/**
 *
 * @author dark_
 */
public interface IBilheteDAO {
    public void adiciona(Bilhete bilhete);
    public void altera(Bilhete bilhete);
    public void remove(int id);
    public List<Bilhete> listarAlguns();
    public List<Bilhete> listarTodos();
    public Bilhete getByID(int id);
}
