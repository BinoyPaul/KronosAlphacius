import java.sql.*;

public class Postgres {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        String url = /*"jdbc:postgresql://ec2-54-221-253-117.compute-1.amazonaws.com:5432/deeuv84th2tbdp";*/"jdbc:postgresql://qdjjtnkv.db.elephantsql.com:5432/riiqejit";
        String username = /*"nfomreqhhtibsc";*/"riiqejit";
        String password = /*"wuHqPw9OXjx9CnWzoUHmTEUWSQ";*/"coLjz2IQxSBCTk_ul4tEBmMvIhyj6kQv";

        try {
        	System.out.println("Hi Gumaango!");
        	Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM sample.location");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(2));
                System.out.print("Column 2 returned ");
                System.out.println(rs.getString(3));
            }
            
            System.out.println("Hi people");
            rs.close();
            st.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}