import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatementJdbc {
    public static void main(String[] args) throws Exception{
        String URL="jdbc:postgresql://localhost:5432/DemoDb";
        String UNAME="postgres";
        String PASS="1234";

        int id=101;
        String name="Oggy";
        int marks=55;

        String query="insert into student values(?, ?, ?)";
        // 2. Load and register driver (optional)
        Class.forName("org.postgresql.Driver");  //(optional)

        // 3. create connection
        Connection con= DriverManager.getConnection(URL, UNAME, PASS);
        System.out.println("Connection established");

        PreparedStatement st=con.prepareStatement(query);
        st.setInt(1, id);
        st.setString(2,name);
        st.setInt(3,marks);

        st.execute();
        con.close();

    }
}
