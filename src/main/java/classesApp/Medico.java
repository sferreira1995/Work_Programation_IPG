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

public class Medico {
    private int N_MEDICO;
    private String NOME_MEDICO;
    private int N_OM;

    // Constructor
    public Medico(int N_MEDICO, String NOME_MEDICO, int N_OM) {
        this.N_MEDICO = N_MEDICO;
        this.NOME_MEDICO = NOME_MEDICO;
        this.N_OM = N_OM;
    }

    // Getter for N_MEDICO
    public int getN_MEDICO() {
        return N_MEDICO;
    }

    // Setter for N_MEDICO
    public void setN_MEDICO(int N_MEDICO) {
        this.N_MEDICO = N_MEDICO;
    }

    // Getter for NOME_MEDICO
    public String getNOME_MEDICO() {
        return NOME_MEDICO;
    }

    // Setter for NOME_MEDICO
    public void setNOME_MEDICO(String NOME_MEDICO) {
        this.NOME_MEDICO = NOME_MEDICO;
    }

    // Getter for N_OM
    public int getN_OM() {
        return N_OM;
    }

    // Setter for N_OM
    public void setN_OM(int N_OM) {
        this.N_OM = N_OM;
    }
    
        public static List<Medico> getAllMedicos() {
        List<Medico> Medicos = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.RESPOSTA_EEMI_MEDICO";

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

