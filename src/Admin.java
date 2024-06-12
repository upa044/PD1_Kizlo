
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
    
//    String q1, q2, q3, q4, q5, q1a1, q1a2, q1a3, q2a1, q2a2, q2a3, q3a1, q3a2, q3a3, q4a1, q4a2, q4a3, q5a1, q5a2, q5a3;

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

            // Выполнение запроса INSERT
            int rowsAff = insertStmt.executeUpdate();
            return rowsAff > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    

    }
    

    
    public void getTest(String title) {
        User user = new User();
        GUI gui = new GUI();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(user.DB_URL, user.DB_USER, user.DB_PASSWD);

            String sql = "SELECT QUEST1, QUEST2, QUEST3, QUEST4, QUEST5, OPT1, OPT2, OPT3, OPT4, OPT5, OPT6, OPT7, OPT8, OPT9, OPT10, OPT11, OPT12, OPT13, OPT14, OPT15 FROM APP.QUESTION WHERE TITLE = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                String q1 = rs.getString("QUEST1");
                String q2 = rs.getString("QUEST2");
                String q3 = rs.getString("QUEST3");
                String q4 = rs.getString("QUEST4");
                String q5 = rs.getString("QUEST5");

                String q1Answer1 = rs.getString("OPT1");
                String q1Answer2 = rs.getString("OPT2");
                String q1Answer3 = rs.getString("OPT3");

                
                String q2Answer1 = rs.getString("OPT4");
                String q2Answer2 = rs.getString("OPT5");
                String q2Answer3 = rs.getString("OPT6");

                
                String q3Answer1 = rs.getString("OPT7");
                String q3Answer2 = rs.getString("OPT8");
                String q3Answer3 = rs.getString("OPT9");

                
                String q4Answer1 = rs.getString("OPT10");
                String q4Answer2 = rs.getString("OPT11");
                String q4Answer3 = rs.getString("OPT12");

                
                String q5Answer1 = rs.getString("OPT13");
                String q5Answer2 = rs.getString("OPT14");
                String q5Answer3 = rs.getString("OPT15");


                System.out.println("q1: " + q1);
                System.out.println("q1a1: " + q1Answer1);
                System.out.println("q1a2: " + q1Answer2);
                System.out.println("q1a3: " + q1Answer3 + "\n");

                System.out.println("q2: " + q2);
                System.out.println("q2a1: " + q2Answer1);
                System.out.println("q2a2: " + q2Answer2);
                System.out.println("q2a3: " + q2Answer3 + "\n");
                
                System.out.println("q3: " + q3);
                System.out.println("q3a1: " + q3Answer1);
                System.out.println("q3a2: " + q3Answer2);
                System.out.println("q3a3: " + q3Answer3 + "\n");
                
                System.out.println("q4: " + q4);
                System.out.println("q4a1: " + q4Answer1);
                System.out.println("q4a2: " + q4Answer2);
                System.out.println("q4a3: " + q4Answer3 + "\n");
                
                System.out.println("q5: " + q5);
                System.out.println("q5a1: " + q5Answer1);
                System.out.println("q5a2: " + q5Answer2);
                System.out.println("q5a3: " + q5Answer3 + "\n");

                gui.receiveTest(q1, q2, q3, q4, q5, q1Answer1, q1Answer2, q1Answer3, q2Answer1, q2Answer2, q2Answer3, q3Answer1, q3Answer2, q3Answer3, q4Answer1, q4Answer2, q4Answer3, q5Answer1, q5Answer2, q5Answer3);

            } else {
                System.out.println("test not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
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

    public void rezultUser(Tester rezult, Tester user) {

    }

}
