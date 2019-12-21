package com.soft.link.med.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author jakson wilson bonfim de lima
 */
@Entity
@Table(name = "SOFTLINKMED_PESSOA")
public class Pessoa extends Entidade {

    @Id
    @SequenceGenerator(name = "PESSOA_SEQ", sequenceName = "PESSOA_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PESSOA_SEQ")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private String cpf;

    public Pessoa() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
