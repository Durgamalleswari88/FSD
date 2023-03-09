import java.sql.*;
class DBConnect
{
public static void main(String args[]) 
{
try{
//1.Register with Driver-Step1
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver registered suyccessfully");
//2.Establish connection
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("Connectoin Established Successfully");
//3.Statement object
Statement stmt=c.createStatement();
//4.execute
String sql="create table CSE05D1(empid integer primary key,empname varchar(40))";
stmt.execute(sql);
System.out.println("Table is created");
}
catch(Exception e){
System.out.println(e);
}
}
}