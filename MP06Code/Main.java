import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        PasswordDao passwordDao = new PasswordDaoImpl();

        passwordDao.insert(new PasswordInfo("http","smu","abcde"));
        passwordDao.insert(new PasswordInfo("http2","smu2","abcde"));

        List<PasswordInfo> all = passwordDao.findAll();

        for (PasswordInfo a: all){
            System.out.println(a.toString());
        }

        passwordDao.update(new PasswordInfo("http2","smu1","abcde"));

        PasswordInfo http2 = passwordDao.findByKey("http2");

        System.out.println(http2.toString());

        passwordDao.delete("http2");

        all = passwordDao.findAll();

        for (PasswordInfo a: all){
            System.out.println(a.toString());
        }

    }
}
