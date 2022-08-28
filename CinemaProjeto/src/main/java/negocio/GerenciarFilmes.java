/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author dark_
 */
public class GerenciarFilmes {
    //filme_sala//
    
    //interface gerenciar filmes visualiza a tabela filmes e a sala
    //e passa pra ca os ids referentes da combinação de qual filme passa em qual sala
    
    private int idFilmeSala;
    private int idSala;
    private int idFilme;
    private String filme;
    private String horario;
    
    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public int getIdFilmeSala() {
        return idFilmeSala;
    }

    public void setIdFilmeSala(int idFilmeSala) {
        this.idFilmeSala = idFilmeSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    

}