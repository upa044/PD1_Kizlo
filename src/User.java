
import java.sql.*;

public class User {

    String login;
    String name;
    String password;
    static final String DB_URL = "jdbc:derby://localhost:1527/connect";
    static final String DB_USER = "admin44";
    static final String DB_PASSWD = "Qwerty1234";

    public boolean User(String login, String password) {
        String query = "SELECT * FROM APP.USERS WHERE USERNAME = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, login);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String dbPassword = resultSet.getString("PASSWORD");
                    return password.equals(dbPassword);
                } else {
                    return false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public void connect() throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet
                    = statement.executeQuery("SELECT * FROM APP.USERS");) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("ID") + ". ");
                    System.out.print(resultSet.getString("USERNAME") + " ");
                    System.out.print(resultSet.getString("PASSWORD") + " \n");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public int loginstatus = 0;
    public String grup;

    public String login(String login, String password) {

        String query = "SELECT * FROM APP.USERS WHERE USERNAME = ? AND PASSWORD = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    grup = resultSet.getString("GRUP");
                    loginstatus = 1;
                } else {
                    loginstatus = 0;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                loginstatus = 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            loginstatus = 0;
        }

        return grup;

    }

    public boolean register(String username, String gender, String password, String birthStr, String grup) throws SQLException {
        String query = "INSERT INTO APP.REGISTRATION (USERNAME, GENDER, PASSWORD, BIRTH, GRUP) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, gender);
            stmt.setString(3, password);
            stmt.setString(4, birthStr);
            stmt.setString(5, grup);

            int rowsAff = stmt.executeUpdate();
            return rowsAff > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean enter(String login, String password) {

        return false;
    }

    public boolean userlogin(String username, String password) throws SQLException {
        String query = "INSERT INTO APP.REGISTRATION (USERNAME, PASSWORD) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean sendToUsers(String username, String pass, String group) {
        String query = "INSERT INTO APP.USERS ( USERNAME, PASSWORD, GRUP) VALUES ( ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, pass);
            stmt.setString(3, group);

            int rowsAff = stmt.executeUpdate();
            return rowsAff > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
