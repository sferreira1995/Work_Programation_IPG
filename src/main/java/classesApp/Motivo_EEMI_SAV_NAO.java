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

public class Motivo_EEMI_SAV_NAO {
    private int N_EEMI_SAV_NAO;
    private String MOTIVO_EEMI_SAV_NAO;

    // Constructor
    public Motivo_EEMI_SAV_NAO(int N_EEMI_SAV_NAO, String MOTIVO_EEMI_SAV_NAO) {
        this.N_EEMI_SAV_NAO = N_EEMI_SAV_NAO;
        this.MOTIVO_EEMI_SAV_NAO = MOTIVO_EEMI_SAV_NAO;
    }

    // Getter for N_EEMI_SAV_NAO
    public int getN_EEMI_SAV_NAO() {
        return N_EEMI_SAV_NAO;
    }

    // Setter for N_EEMI_SAV_NAO
    public void setN_EEMI_SAV_NAO(int N_EEMI_SAV_NAO) {
        this.N_EEMI_SAV_NAO = N_EEMI_SAV_NAO;
    }

    // Getter for MOTIVO_EEMI_SAV_NAO
    public String getMOTIVO_EEMI_SAV_NAO() {
        return MOTIVO_EEMI_SAV_NAO;
    }

    // Setter for MOTIVO_EEMI_SAV_NAO
    public void setMOTIVO_EEMI_SAV_NAO(String MOTIVO_EEMI_SAV_NAO) {
        this.MOTIVO_EEMI_SAV_NAO = MOTIVO_EEMI_SAV_NAO;
    }
         // Method to get all MOTIVO_EEMI_SAV_NAO records
    public static List<Motivo_EEMI_SAV_NAO> getAllMotivos_EEMI_SAV_NAO() {
        List<Motivo_EEMI_SAV_NAO> motivos_EEMI_SAV_NAO = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.EEMI_SAV_NAO";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                int nMotivo_EEMI_SAV_NAO = resultSet.getInt("N_EEMI_SAV_NAO");
                String motivo_EEMI_SAV_NAO = resultSet.getString("MOTIVO_EMI_SAV_NAO");

                Motivo_EEMI_SAV_NAO novoMotivo_EEMI_SAV_NAO = new Motivo_EEMI_SAV_NAO(nMotivo_EEMI_SAV_NAO, motivo_EEMI_SAV_NAO);
                motivos_EEMI_SAV_NAO.add(novoMotivo_EEMI_SAV_NAO);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Motivo records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return motivos_EEMI_SAV_NAO;
    }
}
