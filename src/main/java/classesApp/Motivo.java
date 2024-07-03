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

public class Motivo {
    private int N_MOTIVO;
    private String MOTIVO;

    // Constructor
    public Motivo(int N_MOTIVO, String MOTIVO) {
        this.N_MOTIVO = N_MOTIVO;
        this.MOTIVO = MOTIVO;
    }

    // Getter for N_MOTIVO
    public int getN_MOTIVO() {
        return N_MOTIVO;
    }

    // Setter for N_LOCAL
    public void setN_MOTIVO(int N_MOTIVO) {
        this.N_MOTIVO = N_MOTIVO;
    }

    // Getter for LOCAL
    public String getMOTIVO() {
        return MOTIVO;
    }

    // Setter for LOCAL
    public void setMOTIVO(String MOTIVO) {
        this.MOTIVO = MOTIVO;
    }
         // Method to get all Destino records
    public static List<Motivo> getAllMotivos() {
        List<Motivo> motivos = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.MOTIVO_PCR";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                int nMotivo = resultSet.getInt("N_Motivo");
                String motivo = resultSet.getString("MOTIVO");

                Motivo novoMotivo = new Motivo(nMotivo, motivo);
                motivos.add(novoMotivo);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Motivo records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return motivos;
    }
}
