import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn=db.connect_to_db("Sample", "postgres", "1808");
        //db.createTable( conn, "employee");
       // db.insert_row(conn,"employee","Rathi","India");
        db.update_name(conn,"employee","sakthi","balan");
       db.read_data(conn,"employee");
    }
}
