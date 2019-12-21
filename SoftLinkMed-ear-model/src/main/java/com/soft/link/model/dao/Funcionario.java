package com.soft.link.model.dao;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jakson Wilson Bonfim de Lima
 */
public class Funcionario implements Serializable {

    private Integer id_funcionario;

    private Integer id_pessoa;

    private Integer id_ocupassao;

    private Integer id_especialidade;

    private Integer id_clinica;

    public Funcionario() {
    }

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Integer getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Integer id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public Integer getId_ocupassao() {
        return id_ocupassao;
    }

    public void setId_ocupassao(Integer id_ocupassao) {
        this.id_ocupassao = id_ocupassao;
    }

    public Integer getId_especialidade() {
        return id_especialidade;
    }

    public void setId_especialidade(Integer id_especialidade) {
        this.id_especialidade = id_especialidade;
    }

    public Integer getId_clinica() {
        return id_clinica;
    }

    public void setId_clinica(Integer id_clinica) {
        this.id_clinica = id_clinica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id_funcionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.id_funcionario, other.id_funcionario);
    }

}
