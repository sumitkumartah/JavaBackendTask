import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InstertIntoTable {
    public static void main(String[] args) throws  Exception{
        String URL="jdbc:postgresql://localhost:5432/DemoDb";
        String UNAME="postgres";
        String PASS="1234";

        String query="insert into student values(4, 'BOB', 75)";
        // 2. Load and register driver (optional)
        Class.forName("org.postgresql.Driver");  //(optional)

        // 3. create connection
        Connection con= DriverManager.getConnection(URL, UNAME, PASS);
        System.out.println("Connection established");

        //create statement
        Statement st=con.createStatement();

        // 5. Execute Statement
         boolean status= st.execute(query);
         con.close();
    }
}
