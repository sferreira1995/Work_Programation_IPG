/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesApp;

import com.mycompany.bd_1.OracleDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vitima {
    private int N_EPISODIO;
    private String NOME_VITIMA;
    private int N_PROCESSO;
    private String DATA_NASCIMENTO;
    private String DATA_ADMISSAO_HOSPITALAR;

    // Constructor
    public Vitima(int N_EPISODIO, String NOME_VITIMA, int N_PROCESSO, String DATA_NASCIMENTO, String DATA_ADMISSAO_HOSPITALAR) {
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
    public String getDATA_NASCIMENTO() {
        return DATA_NASCIMENTO;
    }

    // Setter for DATA_NASCIMENTO
    public void setDATA_NASCIMENTO(String DATA_NASCIMENTO) {
        this.DATA_NASCIMENTO = DATA_NASCIMENTO;
    }

    // Getter for DATA_ADMISSAO_HOSPITALAR
    public String getDATA_ADMISSAO_HOSPITALAR() {
        return DATA_ADMISSAO_HOSPITALAR;
    }

    // Setter for DATA_ADMISSAO_HOSPITALAR
    public void setDATA_ADMISSAO_HOSPITALAR(String DATA_ADMISSAO_HOSPITALAR) {
        this.DATA_ADMISSAO_HOSPITALAR = DATA_ADMISSAO_HOSPITALAR;
    }
    
        public static List<Medico> getAllVitimas() {
        List<Medico> Medicos = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.VITIMA where";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME_MEDICO");
                int id = resultSet.getInt("N_MEDICO");
                int idOm = resultSet.getInt("N_OM");
 
                Medico medico = new Medico(id, nome,idOm);
                Medicos.add(medico);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Destino records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return Medicos;
    }
    
    
}
