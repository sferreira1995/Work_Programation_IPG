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

public class Local {
    private int N_LOCAL;
    private String LOCAL;

    // Constructor
    public Local(int N_LOCAL, String LOCAL) {
        this.N_LOCAL = N_LOCAL;
        this.LOCAL = LOCAL;
    }

    // Getter for N_LOCAL
    public int getN_LOCAL() {
        return N_LOCAL;
    }

    // Setter for N_LOCAL
    public void setN_LOCAL(int N_LOCAL) {
        this.N_LOCAL = N_LOCAL;
    }

    // Getter for LOCAL
    public String getLOCAL() {
        return LOCAL;
    }

    // Setter for LOCAL
    public void setLOCAL(String LOCAL) {
        this.LOCAL = LOCAL;
    }
         // Method to get all Destino records
    public static List<Local> getAllLocais() {
        List<Local> locais = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.LOCAL";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                int nLocal = resultSet.getInt("N_LOCAL");
                String local = resultSet.getString("LOCAL");

                Local novoLocal = new Local(nLocal, local);
                locais.add(novoLocal);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Destino records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return locais;
    }
}
