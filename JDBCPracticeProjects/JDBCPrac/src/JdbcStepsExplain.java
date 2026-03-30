//1. Import package
import java.sql.*;


public class JdbcStepsExplain {
    public static void main(String[] args) throws Exception {
        /*
        1. Import package
        2. Load and register driver
        3. create connection
        4. create statement
        5. Execute Statement
        6. close
         */

        String URL="jdbc:postgresql://localhost:5432/DemoDb";
        String UNAME="postgres";
        String PASS="1234";

        String query="select name from student where id=1";
       // 2. Load and register driver (optional)
        Class.forName("org.postgresql.Driver");  //(optional)

        // 3. create connection
        Connection con=DriverManager.getConnection(URL, UNAME, PASS);

        //create statement
        Statement st=con.createStatement();

        // 5. Execute Statement
       ResultSet rs= st.executeQuery(query);  //as i just want to see the data (without any updation) thats why I use executeQuery

        rs.next();  //To move to the first row
        System.out.println(rs.getString("name"));

        System.out.println("Connection established");
        //Close the connection
         con.close();
    }
}
