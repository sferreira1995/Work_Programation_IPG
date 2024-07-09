/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesApp;

import com.mycompany.bd_1.OracleDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vitima {

    private int N_EPISODIO;
    private String NOME_VITIMA;
    private int N_PROCESSO;
    private String DATA_NASCIMENTO;
    private String DATA_ADMISSAO_HOSPITALAR;
    private String SEXO;

    // Constructor
    public Vitima(int N_PROCESSO, String NOME_VITIMA, String DATA_NASCIMENTO, String DATA_ADMISSAO_HOSPITALAR, String SEXO) {
        this.NOME_VITIMA = NOME_VITIMA;
        this.N_PROCESSO = N_PROCESSO;
        this.DATA_NASCIMENTO = DATA_NASCIMENTO;
        this.DATA_ADMISSAO_HOSPITALAR = DATA_ADMISSAO_HOSPITALAR;
        this.SEXO = SEXO;
    }

    public Vitima() {
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
    public LocalDate getDATA_NASCIMENTO() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        
        // Parse the string to LocalDateTime first
        LocalDate localDate = LocalDate.parse(this.DATA_NASCIMENTO.substring(0, 10));
        
        return localDate;
    }

    // Setter for DATA_NASCIMENTO
    public void setDATA_NASCIMENTO(String DATA_NASCIMENTO) {
        this.DATA_NASCIMENTO = DATA_NASCIMENTO;
    }

    // Getter for DATA_ADMISSAO_HOSPITALAR
    public LocalDate getDATA_ADMISSAO_HOSPITALAR() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        // Parse the string to LocalDateTime first
        LocalDate localDate = LocalDate.parse(this.DATA_ADMISSAO_HOSPITALAR.substring(0, 10));
        return localDate;
    }

    // Setter for DATA_ADMISSAO_HOSPITALAR
    public void setDATA_ADMISSAO_HOSPITALAR(String DATA_ADMISSAO_HOSPITALAR) {
        this.DATA_ADMISSAO_HOSPITALAR = DATA_ADMISSAO_HOSPITALAR;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public static Vitima getVitimaProcess(int processo) {

        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.VITIMA WHERE N_PROCESSO = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, processo);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                do {
                    String nome = resultSet.getString("NOME_VITIMA");
                    int n_processo = resultSet.getInt("N_PROCESSO");
                    String data_nascimento = resultSet.getString("DATA_NASCIMENTO");
                    String data_admissao = resultSet.getString("DATA_ADMISSAO_HOSPITALAR");
                    String sexo = resultSet.getString("SEXO");

                    Vitima vitima = new Vitima(n_processo, nome, data_nascimento, data_admissao, sexo);
                    return vitima;
                } while (resultSet.next());
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Vitima records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return null;
    }
    
    public static void verifyAndInsertVitimaProcess(int processo, String nome, String DATA_NASCIMENTO, String DATA_ADMISSAO_HOSPITALAR,String SEXO) {
    Connection connection = OracleDatabaseConnection.getConnection();
    String query = "SELECT COUNT(*) FROM BD_TC_1709711.VITIMA WHERE N_PROCESSO = ?";
    String insertQuery = "INSERT INTO BD_TC_1709711.VITIMA (N_PROCESSO, NOME_VITIMA, DATA_NASCIMENTO, DATA_ADMISSAO_HOSPITALAR,SEXO) VALUES (?, ?, TO_DATE(?, 'YYYY-MM-DD'),  TO_DATE(?, 'YYYY-MM-DD'), ?)";

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, processo);
        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();
        int count = resultSet.getInt(1);

        if (count == 0) {
            // Process does not exist, insert new record
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setInt(1, processo);
            insertStatement.setString(2, nome);
            insertStatement.setString(3, DATA_NASCIMENTO);
            insertStatement.setString(4, DATA_ADMISSAO_HOSPITALAR);
            insertStatement.setString(5, SEXO);
            insertStatement.executeUpdate();
        }
    } catch (SQLException e) {
        System.out.println("Error verifying or inserting Vitima records: " + e.getMessage());
    } finally {
        OracleDatabaseConnection.closeConnection(connection);
    }
}
}
