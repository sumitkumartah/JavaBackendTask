import java.sql.*;

public class ReadAllData {
    public static void main(String[] args) throws  Exception {
        String URL="jdbc:postgresql://localhost:5432/DemoDb";
        String UNAME="postgres";
        String PASS="1234";

        String query="select * from student";
        // 2. Load and register driver (optional)
        Class.forName("org.postgresql.Driver");  //(optional)

        // 3. create connection
        Connection con= DriverManager.getConnection(URL, UNAME, PASS);

        //create statement
        Statement st=con.createStatement();

        // 5. Execute Statement
        ResultSet rs= st.executeQuery(query);  //as i just want to see the data (without any updation) thats why I use executeQuery

        while(rs.next()){
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.println(rs.getInt("marks"));
        }

        System.out.println("Connection established");
        //Close the connection
        con.close();
    }
}
