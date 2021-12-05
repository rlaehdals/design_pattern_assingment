import org.sqlite.core.DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDaoImpl implements PasswordDao{

    private Connection connection;

    private Statement statement;

    private ResultSet resultSet;

    private final String DB_FILE_NAME="WEB";
    private final String DB_TABLE_NAME="person";
    public PasswordDaoImpl() throws SQLException {
        connection= DriverManager.getConnection("jdbc:sqlite:"+DB_FILE_NAME);
        statement=connection.createStatement();
        resultSet=null;

        String table = "( url text PRIMARY KEY, id text, password text)";

        statement.executeUpdate("DROP TABLE IF EXISTS "+ DB_TABLE_NAME);

        statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
    }

    @Override
    public void insert(PasswordInfo p) throws SQLException {
        statement.execute("INSERT INTO "+DB_TABLE_NAME+" (url, id, password)"+" VALUES "+"("+p.toString()+")");
    }

    @Override
    public List<PasswordInfo> findAll() throws SQLException {
        List<PasswordInfo> list =new ArrayList<>();

        resultSet=statement.executeQuery("SELECT * FROM "+ DB_TABLE_NAME);

        while (resultSet.next()){
            list.add(new PasswordInfo(resultSet.getString("url"), resultSet.getString("id"),resultSet.getString("password") ));
        }
        return list;
    }

    @Override
    public PasswordInfo findByKey(String url) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME + " WHERE url = " + "'"+url+"'");

        return new PasswordInfo(resultSet.getString("url"), resultSet.getString("id"),resultSet.getString("password"));
    }

    @Override
    public void update(PasswordInfo p) throws SQLException {
        statement.execute("UPDATE "+DB_TABLE_NAME+" SET id = "+"'"+p.getId()+"'" +" WHERE url = "+ "'"+p.getUrl()+"'");
    }

    @Override
    public void delete(String url) throws SQLException {
        statement.execute("DELETE FROM "+ DB_TABLE_NAME +" WHERE url = "+"'"+url+"'");
    }

    @Override
    public void delete(PasswordInfo p) {

    }
}
