package com.soft.link.med.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author jakson wilson bonfim de lima
 */
@Entity
@Table(name = "SOFTLINKMED_EMPRESTIMO")
public class Emprestimo extends Entidade {

    @Id
    @SequenceGenerator(name = "EMPRESTIMO_SEQ", sequenceName = "EMPRESTIMO_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPRESTIMO_SEQ")
    private Integer id;

    @Column(name = "DATA_EMPRESTIMO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmprestimo;

    @Column(name = "DATA_DEVOLUCAO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDevolucao;

    @JoinColumn(name = "LIVRO_ID", referencedColumnName = "ID")
    @ManyToOne
    private Livro livro;

    @JoinColumn(name = "PESSOA_ID", referencedColumnName = "ID")
    @ManyToOne
    private Pessoa pessoa;

    public Emprestimo() {
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
