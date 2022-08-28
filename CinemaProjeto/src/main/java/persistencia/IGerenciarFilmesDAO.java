/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.GerenciarFilmes;

/**
 *
 * @author dark_
 */
public interface IGerenciarFilmesDAO {
    public void adiciona(GerenciarFilmes gerenciarFilmes);
    public void altera(GerenciarFilmes gerenciarFilmes);
    public void remove(int id);
    public List<GerenciarFilmes> listarTodos();
    public GerenciarFilmes getByID(int id);
}
