
import java.sql.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tester {
    
   
    
    
    String password;
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String answer;
    static final String DB_URL = "jdbc:derby://localhost:1527/connect";
    static final String DB_USER = "admin44";
    static final String DB_PASSWD = "Qwerty1234";
    
    public Tester(){
        
    }
    
    
    
    
    
    public boolean save(String username,int mark, double procenti,double punkti,String test,int repeat ){
            
       
        String insertQuery = "INSERT INTO APP.REZULTATI (USERNAME,MARK,PROCENTI,PUNKTI,TEST,REPEAT) VALUES (?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
         
             PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {

            insertStmt.setString(1,username );
            insertStmt.setInt(2, mark);
            insertStmt.setDouble(3, procenti);
            insertStmt.setDouble(4, punkti);
            insertStmt.setString(5,test );
            insertStmt.setInt(6, repeat);
            
            int rowsAff = insertStmt.executeUpdate();
            return rowsAff > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }  
    }
    
    public void load(){
        
    }
    public void searchRezult(String searchUser, JTable rezultTable) {
        String query = "SELECT * FROM APP.REZULTATI WHERE USERNAME LIKE ?";

        try {

            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + searchUser + "%");
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
            rezultTable.setModel(model);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void  getResults(JTable rezultTable){
        
        String query = "SELECT * FROM APP.REZULTATI";

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

            rezultTable.setModel(model);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    
    public void repeat(){
        
    }
    
}
