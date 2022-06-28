import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class Views {
    public static void printarEntidade(ResultSet rs){
        try{
            ResultSetMetaData rsmd = rs.getMetaData();
            int colunas = rsmd.getColumnCount();
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "  ");
                for (int j = 2; j < colunas; j++) {
                    System.out.print(rs.getString(j) + "  ");
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}