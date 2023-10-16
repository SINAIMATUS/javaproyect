package Modelo;
import java.sql.Date;

/**
 *
 * @author SINAI DAYANARA M
 */
public class Autor {
    private int id_autor;
    private String cedula;
    private String nombres;
    private String Apellidos;
    private String email;
    private Date fechaNAC;

    public Autor(int id_autor, String cedula, String nombres, String Apellidos, String email, Date fechaNAC) {
        this.id_autor = id_autor;
        this.cedula = cedula;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.fechaNAC = fechaNAC;
    }

    public Autor(String cedula, String nombres, String Apellidos, String email, Date fechaNAC) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.fechaNAC = fechaNAC;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNAC() {
        return fechaNAC;
    }

    public void setFechaNAC(Date fechaNAC) {
        this.fechaNAC = fechaNAC;
    }
    }
    