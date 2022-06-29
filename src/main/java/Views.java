import entidades.Endereco;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class Views {
    public static void printar(Endereco[] enderecos){
        for(Endereco e: enderecos){
            System.out.println(e.idEnd +"-"+ e.rua +"-"+ e.cidade);
        }
    }
}