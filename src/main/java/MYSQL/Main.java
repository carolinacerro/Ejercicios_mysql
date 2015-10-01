package MYSQL;


public class Main {
  public static void main(String[] args) throws Exception {
    MYSQL.MySQLAccess dao = new MYSQL.MySQLAccess();
    dao.readDataBase();
  }

} 