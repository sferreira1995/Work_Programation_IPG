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

public class Quem_Ativa {
    private int N_QUEM_ATIVA;
    private String QUEM_ATIVA;

    public Quem_Ativa(int N_QUEM_ATIVA, String QUEM_ATIVA) {
        this.N_QUEM_ATIVA = N_QUEM_ATIVA;
        this.QUEM_ATIVA = QUEM_ATIVA;
    }

    public int getN_QUEM_ATIVA() {
        return N_QUEM_ATIVA;
    }

    public void setN_QUEM_ATIVA(int N_QUEM_ATIVA) {
        this.N_QUEM_ATIVA = N_QUEM_ATIVA;
    }

    public String getQUEM_ATIVA() {
        return QUEM_ATIVA;
    }

    public void setQUEM_ATIVA(String QUEM_ATIVA) {
        this.QUEM_ATIVA = QUEM_ATIVA;
    }
    
    public static List<Quem_Ativa> getAllQuemAtiva() {
        List<Quem_Ativa> Lista_QuemAtiva = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.QUEM_ATIVA";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                String funcao = resultSet.getString("QUEM_ATIVA");
                int id = resultSet.getInt("n_QUEM_ATIVA");
 

                Quem_Ativa quem_Ativa = new Quem_Ativa(id, funcao);
                Lista_QuemAtiva.add(quem_Ativa);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Destino records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return Lista_QuemAtiva;
    }
}
