package classesApp;

import com.mycompany.bd_1.OracleDatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Enfermeiro {
    private int N_ENFERMEIRO;
    private String NOME_ENFERMEIRO;
    private int N_OE;

    // Constructor
    public Enfermeiro(int N_ENFERMEIRO, String NOME_ENFERMEIRO, int N_OE) {
        this.N_ENFERMEIRO = N_ENFERMEIRO;
        this.NOME_ENFERMEIRO = NOME_ENFERMEIRO;
        this.N_OE = N_OE;
    }

    // Getter for N_ENFERMEIRO
    public int getN_ENFERMEIRO() {
        return N_ENFERMEIRO;
    }

    // Setter for N_ENFERMEIRO
    public void setN_ENFERMEIRO(int N_ENFERMEIRO) {
        this.N_ENFERMEIRO = N_ENFERMEIRO;
    }

    // Getter for NOME_ENFERMEIRO
    public String getNOME_ENFERMEIRO() {
        return NOME_ENFERMEIRO;
    }

    // Setter for NOME_ENFERMEIRO
    public void setNOME_ENFERMEIRO(String NOME_ENFERMEIRO) {
        this.NOME_ENFERMEIRO = NOME_ENFERMEIRO;
    }

    // Getter for N_OE
    public int getN_OE() {
        return N_OE;
    }

    // Setter for N_OE
    public void setN_OE(int N_OE) {
        this.N_OE = N_OE;
    }
    
    public static List<Enfermeiro> getAllEnfermeiro() {
        List<Enfermeiro> Enfermeiros = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT * FROM BD_TC_1709711.RESPOSTA_EEMI_ENF";

        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME_ENFERMEIRO");
                int id = resultSet.getInt("N_ENFERMEIRO");
                int idOe = resultSet.getInt("N_OE");
 

                Enfermeiro enfermeiro = new Enfermeiro(id, nome,idOe);
                Enfermeiros.add(enfermeiro);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching Destino records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return Enfermeiros;
    }
}