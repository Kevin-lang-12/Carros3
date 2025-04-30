package Data;

import Conexao_Principal.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    
        private Conexao conexao;  
    Connection conn2;
    PreparedStatement st;
    ResultSet rs;

    public ClienteDAO() {
        this.conexao = new Conexao();
        this.conn2 = this.conexao.getConexao();
    }
    
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO clientes(nome, endereço, cpf ) VALUES "
                + "(?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn2.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCPF());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir Cliente: " + e.getMessage());
        }
    }
}
