//Inserting an image in the table which is BLOB object

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import jdbcUtil.JdbcConnection;

public class TestApp5 {
    public static void main(String[] args) throws SQLException{

        Connection connection = null;
        PreparedStatement pstmt = null;

        try{
            connection  = JdbcConnection.getJdbcConnection();

            String sqlInsertQuery = "insert into person(`id`,`image`) values(?,?)";
            pstmt = connection.prepareStatement(sqlInsertQuery);
            pstmt.setInt(1,1);

            File f = new File("C:\\Users\\adhinesh\\Downloads\\Telegram Desktop\\goku @Anime_Wallpapers_HD_4K.jpg");
            FileInputStream fis = new FileInputStream(f);
            pstmt.setBlob(2,fis);

            System.out.println("Inserting file from : "+f.getAbsolutePath());
           int rows =  pstmt.executeUpdate();
           if(rows == 1){
               System.out.println("Record inserted successfully ....");
           }
           else{
               System.out.println("No record inserted.....");
           }

        }catch (SQLException se){
            se.printStackTrace();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        finally {
            try{
                JdbcConnection.closeConnection(null,pstmt,connection);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
