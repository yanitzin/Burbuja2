import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conectar {
    protected PreparedStatement ps;
    protected String bd;
    protected Connection cn;
    protected Statement st;
    protected String sql;
    protected ResultSet rs;
    protected final String url =  "jdbc:sqlserver://alex:51403;databaseName=burbuja2";

    public Conectar(String bd){
        this.bd=bd;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Registrado");
            cn=DriverManager.getConnection(url+bd,"sa","123");
            System.out.println("Conexion Establecida");
            st= cn.createStatement();
            
        }catch(SQLException e1){
            System.out.println("ERROR SQL:"+ e1.getMessage());
        }
        catch(ClassNotFoundException e2){
            System.out.println("ERROR DRIVER:"+ e2.getMessage());
        }
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}