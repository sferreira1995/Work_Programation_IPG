/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesApp;

import java.util.Date;

public class Vitima {
    private int N_EPISODIO;
    private String NOME_VITIMA;
    private int N_PROCESSO;
    private Date DATA_NASCIMENTO;
    private Date DATA_ADMISSAO_HOSPITALAR;

    // Constructor
    public Vitima(int N_EPISODIO, String NOME_VITIMA, int N_PROCESSO, Date DATA_NASCIMENTO, Date DATA_ADMISSAO_HOSPITALAR) {
        this.N_EPISODIO = N_EPISODIO;
        this.NOME_VITIMA = NOME_VITIMA;
        this.N_PROCESSO = N_PROCESSO;
        this.DATA_NASCIMENTO = DATA_NASCIMENTO;
        this.DATA_ADMISSAO_HOSPITALAR = DATA_ADMISSAO_HOSPITALAR;
    }

    // Getter for N_EPISODIO
    public int getN_EPISODIO() {
        return N_EPISODIO;
    }

    // Setter for N_EPISODIO
    public void setN_EPISODIO(int N_EPISODIO) {
        this.N_EPISODIO = N_EPISODIO;
    }

    // Getter for NOME_VITIMA
    public String getNOME_VITIMA() {
        return NOME_VITIMA;
    }

    // Setter for NOME_VITIMA
    public void setNOME_VITIMA(String NOME_VITIMA) {
        this.NOME_VITIMA = NOME_VITIMA;
    }

    // Getter for N_PROCESSO
    public int getN_PROCESSO() {
        return N_PROCESSO;
    }

    // Setter for N_PROCESSO
    public void setN_PROCESSO(int N_PROCESSO) {
        this.N_PROCESSO = N_PROCESSO;
    }

    // Getter for DATA_NASCIMENTO
    public Date getDATA_NASCIMENTO() {
        return DATA_NASCIMENTO;
    }

    // Setter for DATA_NASCIMENTO
    public void setDATA_NASCIMENTO(Date DATA_NASCIMENTO) {
        this.DATA_NASCIMENTO = DATA_NASCIMENTO;
    }

    // Getter for DATA_ADMISSAO_HOSPITALAR
    public Date getDATA_ADMISSAO_HOSPITALAR() {
        return DATA_ADMISSAO_HOSPITALAR;
    }

    // Setter for DATA_ADMISSAO_HOSPITALAR
    public void setDATA_ADMISSAO_HOSPITALAR(Date DATA_ADMISSAO_HOSPITALAR) {
        this.DATA_ADMISSAO_HOSPITALAR = DATA_ADMISSAO_HOSPITALAR;
    }
}
