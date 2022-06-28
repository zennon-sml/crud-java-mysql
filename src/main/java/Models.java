import java.sql.*;

public class Models {
    public static Connection fazerConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10502351";
            String usuario = "sql10502351";
            String senha = "273r7UMB9k";
            Connection con = DriverManager.getConnection(//abre a conexao
                    servidor,
                    usuario,
                    senha
            );
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static ResultSet selectAll(String entidade){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();
            String query = "select * from "+entidade;
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}