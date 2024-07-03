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
import java.util.List;


public class Destino {
    private String SERVICO;
    private int N_DESTINO;
    private String INSTITUICAO;

    // Constructor
    public Destino(String SERVICO, int N_DESTINO, String INSTITUICAO) {
        this.SERVICO = SERVICO;
        this.N_DESTINO = N_DESTINO;
        this.INSTITUICAO = INSTITUICAO;
    }

    // Getter for SERVICO
    public String getSERVICO() {
        return SERVICO;
    }

    // Setter for SERVICO
    public void setSERVICO(String SERVICO) {
        this.SERVICO = SERVICO;
    }

    // Getter for N_DESTINO
    public int getN_DESTINO() {
        return N_DESTINO;
    }

    // Setter for N_DESTINO
    public void setN_DESTINO(int N_DESTINO) {
        this.N_DESTINO = N_DESTINO;
    }

    // Getter for INSTITUICAO
    public String getINSTITUICAO() {
        return INSTITUICAO;
    }

    // Setter for INSTITUICAO
    public void setINSTITUICAO(String INSTITUICAO) {
        this.INSTITUICAO = INSTITUICAO;
    }
    
     // Method to get all Destino records
    public static List<Destino> getAllDestinos() {
        List<Destino> destinos = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.DESTINO";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                String servico = resultSet.getString("SERVIÇO");
                int nDestino = resultSet.getInt("N_DESTINO");
                String instituicao = resultSet.getString("INSTITUIÇÃO");

                Destino destino = new Destino(servico, nDestino, instituicao);
                destinos.add(destino);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Destino records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return destinos;
    }
}