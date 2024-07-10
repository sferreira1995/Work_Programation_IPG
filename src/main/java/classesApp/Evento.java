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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {

    private int N_EVENTO;
    private String DATA_HORA_EVENTO;
    private String DATA_HORA_CHAMADA;
    private String DATA_HORA_CHEGADA;
    private String PCR_S_N;
    private String EQUIPA_LOCAL_SAV;
    private String EEMI_SAV;
    private String HORA_INICIO_SAV;
    private String HORA_INICIO_SAV_ER;
    private String RITMO_DESFIBRILHAVEL;
    private String HORA_1_DESFIBRILHACAO;
    private String HORA_1_DESFIBRILHACAO_ER;
    private String RCE;
    private String HORA_RCE_SIM;
    private String HORA_RCE_SIM_ER;
    private String HORA_RCE_NAO;
    private String HORA_RCE_NAO_ER;
    private int QUEM_ATIVA_N_QUEM_ATIVA;
    private int VITIMA_N_PROCESSO;
    private int LOCAL_N_LOCAL;
    private int RESPOSTA_EEMI_MEDICO_N_MEDICO;
    private int RESPOSTA_EEMI_ENF_N_ENFERMEIRO;
    private int MOTIVO_PCR_N_MOTIVO;
    private int DESTINO_N_DESTINO;
    private int EEMI_SAV_NAO_N_EEMI_SAV_NAO;

    public Evento() {
    }
    
        public static void insertEvento(String dataEvento, String dataChamada, String dataChegada, String pcr, String activa, int vitima, String local, String Enfermeiro, String Medico ) {
    Connection connection = OracleDatabaseConnection.getConnection();
    String insertQuery = "INSERT INTO BD_TC_1709711.EVENTO ( DATA_HORA_EVENTO, DATA_HORA_CHAMADA, DATA_HORA_CHEGADA, PCR_S_N, QUEM_ATIVA_N_QUEM_ATIVA, VITIMA_N_PROCESSO, LOCAL_N_LOCAL, RESPOSTA_EEMI_MEDICO_N_MEDICO, RESPOSTA_EEMI_ENF_N_ENFERMEIRO)  VALUES "
            + "(TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'), TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'), TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'), ?, (Select N_QUEM_ATIVA FROM BD_TC_1709711.QUEM_ATIVA WHERE QUEM_ATIVA= ? ), ? , (Select N_LOCAL FROM BD_TC_1709711.LOCAL WHERE LOCAL= ?), (Select N_MEDICO FROM BD_TC_1709711.RESPOSTA_EEMI_MEDICO WHERE NOME_MEDICO= ? ), (Select N_ENFERMEIRO FROM BD_TC_1709711.RESPOSTA_EEMI_ENF WHERE NOME_ENFERMEIRO= ? ))";
    String test="";
            System.out.println(insertQuery);
    try {
   
            // Process does not exist, insert new record
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, dataEvento);
            insertStatement.setString(2, dataChamada);
            insertStatement.setString(3, dataChegada);
            insertStatement.setString(4, pcr);
            insertStatement.setString(5, activa);
            insertStatement.setInt(6, vitima);
            insertStatement.setString(7, local);
            insertStatement.setString(8, Medico);
            insertStatement.setString(9, Enfermeiro);

            insertStatement.executeUpdate();
            
        } catch (SQLException e) {
            
            System.out.println("Error verifying or inserting Event records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
    }

    public static int getAllEventos() {
        List<Evento> Lista_Eventos = new ArrayList<>();
        Connection connection = OracleDatabaseConnection.getConnection();
        String query = "SELECT count(*) AS total_Eventos FROM BD_TC_1709711.EVENTO";
       int total=0;
        try {
            ResultSet resultSet = OracleDatabaseConnection.executeQuery(connection, query);
            while (resultSet.next()) {
                String funcao = resultSet.getString("Evento");
                total = resultSet.getInt("total_Eventos");

            }
        } catch (SQLException e) {
            System.out.println("Error fetching Destino records: " + e.getMessage());
        } finally {
            OracleDatabaseConnection.closeConnection(connection);
        }
        return total;
    }
}
