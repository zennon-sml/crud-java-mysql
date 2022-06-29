package consultas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
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
}
