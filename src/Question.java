import javax.swing.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Question {
     static final String DB_URL = "jdbc:derby://localhost:1527/connect";
    static final String DB_USER = "admin44";
    static final String DB_PASSWD = "Qwerty1234";

    private JList<String> titleList;

    public Question(JList<String> titleList) {
        this.titleList = titleList;
    }

    public void loadTitles() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT TITLE FROM APP.QUESTION")) {

            while (rs.next()) {
                String title = rs.getString("TITLE");
                listModel.addElement(title);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        titleList.setModel(listModel);
    }

    public String[][] getTestData(String title) {
        String[][] data = new String[5][4]; // 5 questions, each with the question text and 3 options
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            String sql = "SELECT QUEST1, QUEST2, QUEST3, QUEST4, QUEST5, OPT1, OPT2, OPT3, OPT4, OPT5, OPT6, OPT7, OPT8, OPT9, OPT10, OPT11, OPT12, OPT13, OPT14, OPT15 FROM APP.QUESTION WHERE TITLE = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                data[0][0] = rs.getString("QUEST1");
                data[0][1] = rs.getString("OPT1");
                data[0][2] = rs.getString("OPT2");
                data[0][3] = rs.getString("OPT3");

                data[1][0] = rs.getString("QUEST2");
                data[1][1] = rs.getString("OPT4");
                data[1][2] = rs.getString("OPT5");
                data[1][3] = rs.getString("OPT6");

                data[2][0] = rs.getString("QUEST3");
                data[2][1] = rs.getString("OPT7");
                data[2][2] = rs.getString("OPT8");
                data[2][3] = rs.getString("OPT9");

                data[3][0] = rs.getString("QUEST4");
                data[3][1] = rs.getString("OPT10");
                data[3][2] = rs.getString("OPT11");
                data[3][3] = rs.getString("OPT12");

                data[4][0] = rs.getString("QUEST5");
                data[4][1] = rs.getString("OPT13");
                data[4][2] = rs.getString("OPT14");
                data[4][3] = rs.getString("OPT15");
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

        return data;
        
    }
    public int getTestID(String title) {
       
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            String sql = "SELECT QUEST1, QUEST2, QUEST3, QUEST4, QUEST5, OPT1, OPT2, OPT3, OPT4, OPT5, OPT6, OPT7, OPT8, OPT9, OPT10, OPT11, OPT12, OPT13, OPT14, OPT15 FROM APP.QUESTION WHERE TITLE = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("ID");
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

        return 0;
        
    }
    
    public void removeTest(JTable TestTable){
        int selectedRow = TestTable.getSelectedRow();
        if (selectedRow >= 0) {
            String title = (String) TestTable.getValueAt(selectedRow, 1);
            int columnCount = TestTable.getColumnCount();
            String query1 = "DELETE FROM APP.QUESTION WHERE TITLE = ?";
            String query2 = "DELETE FROM APP.ANSWER WHERE TITLE = ?";

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD); PreparedStatement stmt1 = connection.prepareStatement(query1); PreparedStatement stmt2 = connection.prepareStatement(query2)) {

                stmt1.setString(1, title);
                int rowsAff1 = stmt1.executeUpdate();

                // Удаление из таблицы User
                stmt2.setString(1, title);
                int rowsAff2 = stmt2.executeUpdate();

                if (rowsAff1 > 0 && rowsAff2 > 0) {
                    System.out.println("Quiz " + title + " deleted successfully.");
                    ((DefaultTableModel) TestTable.getModel()).removeRow(selectedRow);
                } else {
                    System.out.println("Quiz " + title + " not found.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No Quiz selected.");
        }
    }
        
        public void searchTest(String searchTest, JTable TestTable){
            String query = "SELECT * FROM APP.QUESTION WHERE TITLE LIKE ?";

        try {

            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + searchTest + "%");
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
            TestTable.setModel(model);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
            
        }
        public void viewTest(JTable TestTable) {

        String query = "SELECT * FROM APP.QUESTION";

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

            TestTable.setModel(model);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        

        
    
    
    
    
    
}
