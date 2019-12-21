package com.soft.link.model.dao;

import com.soft.link.med.model.Entidade;
import java.io.Serializable;

/**
 * @author Jakson Wilson Bonfim de Lima
 */
public class Consultorio extends Entidade implements Serializable {

    private Integer id_consultorio;

    private String nome_consultorio;

    public Consultorio() {
    }

    public Integer getId_consultorio() {
        return id_consultorio;
    }

    public void setId_consultorio(Integer id_consultorio) {
        this.id_consultorio = id_consultorio;
    }

    public String getNome_consultorio() {
        return nome_consultorio;
    }

    public void setNome_consultorio(String nome_consultorio) {
        this.nome_consultorio = nome_consultorio;
    }

    @Override
    public String toString() {
        return "Consultorio{" + "id_consultorio=" + id_consultorio + ", nome_consultorio=" + nome_consultorio + '}';
    }

}
