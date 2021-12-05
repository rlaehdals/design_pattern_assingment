import java.sql.SQLException;
import java.util.List;

public interface PasswordDao {

    void insert(PasswordInfo p) throws SQLException;
    List<PasswordInfo> findAll() throws SQLException;
    PasswordInfo findByKey(String url) throws SQLException;
    void update(PasswordInfo p) throws SQLException;
    void delete(String url) throws SQLException;
    void delete(PasswordInfo p);
}
