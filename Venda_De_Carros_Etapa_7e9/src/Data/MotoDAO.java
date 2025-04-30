package Data;

import Conexao_Principal.Conexao;
import beans.Carros;
import beans.Motos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MotoDAO {
    private Conexao conexao;  
    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public MotoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public Moto getMotoNome(String produtoescolhido) {
        String sql = "SELECT * FROM motosv WHERE produto LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produtoescolhido);
            ResultSet rs = stmt.executeQuery();
            Moto moto = new Moto();
            rs.next();
            moto.setProduto(rs.getString("produto"));
            return moto;
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
      public int salvar(Motos mot){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO produtosc VALUES(?,?,?,?)");
            st.setString(1,mot.getProduto());
            st.setString(2,mot.getQuantidade());
            st.setString(3,mot.getFormaDePagamento());
            st.setString(4,mot.getTotal());
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