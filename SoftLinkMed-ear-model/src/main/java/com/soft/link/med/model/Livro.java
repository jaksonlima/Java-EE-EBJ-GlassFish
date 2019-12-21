package com.soft.link.med.model;

import com.soft.link.med.model.enuns.EnumEmprestimo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author jakson wilson bonfim de lima
 */
@Entity
@Table(name = "SOFTLINKMED_LIVRO")
public class Livro extends Entidade {

    @Id
    @SequenceGenerator(name = "LIVRO_SEQ", sequenceName = "LIVRO_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIVRO_SEQ")
    private Integer id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "AUTOR")
    private String autor;

    @Column(name = "STATUS_EMPRESTIMO")
    @Enumerated(EnumType.STRING)
    private EnumEmprestimo statusEmprestimo;

    public Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public EnumEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(EnumEmprestimo statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
