/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.BilheteNota;

/**
 *
 * @author dark_
 */
public interface IBilheteNotaDAO {
    public void adiciona(BilheteNota bilheteNota);
    public void altera(BilheteNota bilheteNota);
    public void remove(int id);
    public List<BilheteNota> listarTodos();
    public BilheteNota getByID(int id);
}
