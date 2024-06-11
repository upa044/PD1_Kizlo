
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Admin extends User {


    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String answer;
    static final String DB_URL = "jdbc:derby://localhost:1527/connect";
    static final String DB_USER = "admin44";
    static final String DB_PASSWD = "Qwerty1234";

    Admin() {

    }

    public void viewuser(JTable userTable) {

        String query = "SELECT * FROM APP.REGISTRATION";

        try {

            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }

            Vector<Vector<Object>> data = new Vector<>();
            while (resultSet.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(resultSet.getObject(i));
                }
                data.add(row);
            }

            DefaultTableModel model = new DefaultTableModel(data, columnNames);

            userTable.setModel(model);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void searchUser(String searchText, JTable userTable) {
        String query = "SELECT * FROM APP.REGISTRATION WHERE USERNAME LIKE ?";

        try {

            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + searchText + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }

            Vector<Vector<Object>> data = new Vector<>();
            while (resultSet.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(resultSet.getObject(i));
                }
                data.add(row);
            }

            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            userTable.setModel(model);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addTest(String title, Tester test) {

    }

    public boolean addQuestion(String question, String option1, String option2, String option3, String option4, String answer) {
        String query = "INSERT INTO APP.TEST (QUESTION, OPTION1, OPTION2, OPTION3, OPTION4, ANSWER) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, question);
            stmt.setString(2, option1);
            stmt.setString(3, option2);
            stmt.setString(4, option3);
            stmt.setString(5, option4);
            stmt.setString(6, answer);

            int rowsAff = stmt.executeUpdate();
            return rowsAff > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public void removeTest(Tester test) {
    }

    public void removeQuestion(Question question) {
    }

    public void removeUser(JTable userTable) {
      int selectedRow = userTable.getSelectedRow();
    if (selectedRow >= 0) {
        String username = (String) userTable.getValueAt(selectedRow, 0);
        int columnCount = userTable.getColumnCount();
        String group = "";

        
        for (int i = 0; i < columnCount; i++) {
            if ("GRUP".equals(userTable.getColumnName(i))) {
                group = (String) userTable.getValueAt(selectedRow, i);
                break;
            }
        }

        if ("Skolotajs".equals(group)) {
            JOptionPane.showMessageDialog(null, "Jūs nevarat dzēst šo personu, jo viņš ir Skolotajs.", "Kļūda", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "DELETE FROM APP.REGISTRATION WHERE USERNAME = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, username);

            int rowsAff = stmt.executeUpdate();
            if (rowsAff > 0) {
                System.out.println("User " + username + " deleted successfully.");
                ((DefaultTableModel) userTable.getModel()).removeRow(selectedRow);
            } else {
                System.out.println("User " + username + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("No user selected.");
    }
        

    }

    public void rezultUser(Tester rezult, Tester user) {

    }

}
