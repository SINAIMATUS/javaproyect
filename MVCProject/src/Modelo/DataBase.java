package Modelo;

import java.sql.*;
import java.util.*;


/**
 *
 * @author SINAI DAYANARA M
 */
public class DataBase {
    private final String URL="jdbc:mysql://localhost://3306/publicacion.";
    private final String user="Dayanara";
    private final String password="dbdayanara";
    
    private Connection conexion;
    
    public DataBase(){
        try{
            conexion=DriverManager.getConnection(URL, user, password);
                    System.out.println("Conexion Establecida");
                    
        }catch(SQLException e){
            System.out.println("Error de Conexion");
            e.printStackTrace();
        }
    }
    
    public int Actualizar(String consulta){
        try{
            Statement st=conexion.createStatement();
            return st.executeUpdate(consulta);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
        
        
    }
    
    private List OrganizarDatos(ResultSet rs){
            List filas=new ArrayList();
            try{
                int numColumnas=rs.getMetaData().getColumnCount();
                while(rs.next()){
                    Map<String, Object> renglon=new HashMap();
                    for(int i=1; i<=numColumnas; i++){
                        String nombreCampo=rs.getMetaData().getColumnName(i);
                        Object valor=rs.getObject(nombreCampo);
                        renglon.put(nombreCampo, valor);
                    }
                    filas.add(renglon);
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            return filas;
        }
    
    public List Listar(String Consulta){
        ResultSet rs=null;
        List  resultado=new ArrayList();
        try{
            Statement st=conexion.createStatement();
            rs=st.executeQuery(Consulta);
            resultado=OrganizarDatos(rs);
            
        }catch(SQLException e){
            System.out.println("No se realizo la consulta");
            e.printStackTrace();
        }
        return resultado;
    }
    
    public void CerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
}
    
}
