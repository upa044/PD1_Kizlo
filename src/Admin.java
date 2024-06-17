
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

    public boolean addAnswer(String answer1,String answer2,String answer3,String answer4,String answer5,String title1) {
      
        String getMaxIdQuery = "SELECT MAX(ID) FROM APP.ANSWER";
        String insertQuery = "INSERT INTO APP.ANSWER (ID,AN1,AN2,AN3,AN4,AN5,TITLE ) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
             PreparedStatement getMaxIdStmt = connection.prepareStatement(getMaxIdQuery);
             PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {

            
            ResultSet rs = getMaxIdStmt.executeQuery();
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            int newId = maxId + 1;

           
            insertStmt.setInt(1, newId);
            insertStmt.setString(2, answer1);
            insertStmt.setString(3, answer2);
            insertStmt.setString(4, answer3);
            insertStmt.setString(5, answer4);
            insertStmt.setString(6, answer5);
            insertStmt.setString(7, title1);
            
           

           
            int rowsAff = insertStmt.executeUpdate();
            return rowsAff > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addQuestion(String title, String quest1, String quest2, String quest3, String quest4, String quest5, String opt1, String opt2, String opt3, String opt4, String opt5, String opt6, String opt7, String opt8, String opt9, String opt10, String opt11, String opt12, String opt13, String opt14, String opt15) {
        String getMaxIdQuery = "SELECT MAX(ID) FROM APP.QUESTION";
        String insertQuery = "INSERT INTO APP.QUESTION (ID, TITLE, QUEST1, QUEST2, QUEST3, QUEST4, QUEST5, OPT1, OPT2, OPT3, OPT4, OPT5, OPT6, OPT7, OPT8, OPT9, OPT10, OPT11, OPT12, OPT13, OPT14, OPT15) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
             PreparedStatement getMaxIdStmt = connection.prepareStatement(getMaxIdQuery);
             PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {

            
            ResultSet rs = getMaxIdStmt.executeQuery();
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            int newId = maxId + 1;

           
            insertStmt.setInt(1, newId);
            insertStmt.setString(2, title);
            insertStmt.setString(3, quest1);
            insertStmt.setString(4, quest2);
            insertStmt.setString(5, quest3);
            insertStmt.setString(6, quest4);
            insertStmt.setString(7, quest5);
            insertStmt.setString(8, opt1);
            insertStmt.setString(9, opt2);
            insertStmt.setString(10, opt3);
            insertStmt.setString(11, opt4);
            insertStmt.setString(12, opt5);
            insertStmt.setString(13, opt6);
            insertStmt.setString(14, opt7);
            insertStmt.setString(15, opt8);
            insertStmt.setString(16, opt9);
            insertStmt.setString(17, opt10);
            insertStmt.setString(18, opt11);
            insertStmt.setString(19, opt12);
            insertStmt.setString(20, opt13);
            insertStmt.setString(21, opt14);
            insertStmt.setString(22, opt15);

            
            int rowsAff = insertStmt.executeUpdate();
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

            String query1 = "DELETE FROM APP.REGISTRATION WHERE USERNAME = ?";
            String query2 = "DELETE FROM APP.USERS WHERE USERNAME = ?";

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD); PreparedStatement stmt1 = connection.prepareStatement(query1); PreparedStatement stmt2 = connection.prepareStatement(query2)) {

                stmt1.setString(1, username);
                int rowsAff1 = stmt1.executeUpdate();

                // Удаление из таблицы User
                stmt2.setString(1, username);
                int rowsAff2 = stmt2.executeUpdate();

                if (rowsAff1 > 0 && rowsAff2 > 0) {
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

   

}
