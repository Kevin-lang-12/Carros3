/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Conexao_Principal.Conexao;
import beans.Carros;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class CarrosDAO {

    private Conexao conexao;  
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public CarrosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public Carro getCarroNome(String produtoescolhido) {
        String sql = "SELECT * FROM carrosv WHERE produto LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produtoescolhido);
            ResultSet rs = stmt.executeQuery();
            Carro carro = new Carro();
            rs.next();
            carro.setProduto(rs.getString("produto"));
            return carro;
//tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
    
         public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/venda_de_carros2", "root", "root");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
      public int salvar(Carros carr){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO produtosc VALUES(?,?,?,?)");
            st.setString(1,carr.getProduto());
            st.setString(2,carr.getQuantidade());
            st.setString(3,carr.getFormaDePagamento());
            st.setString(4,carr.getTotal());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }        
      public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    } 
}
