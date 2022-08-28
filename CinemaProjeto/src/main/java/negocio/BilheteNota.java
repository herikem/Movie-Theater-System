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
public class BilheteNota {
    private int idBilhete;
    private int idNota;
    private int idCadeira;
    private int idFilmeSala;

    public int getIdBilhete() {
        return idBilhete;
    }

    public void setIdBilhete(int idBilhete) {
        this.idBilhete = idBilhete;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdCadeira() {
        return idCadeira;
    }

    public void setIdCadeira(int idCadeira) {
        this.idCadeira = idCadeira;
    }

    public int getIdFilmeSala() {
        return idFilmeSala;
    }

    public void setIdFilmeSala(int idFilmeSala) {
        this.idFilmeSala = idFilmeSala;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String preco;
    private String tipo;
    
}
