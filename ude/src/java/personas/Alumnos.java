package personas;

import java.awt.Image;
import java.sql.Date;

public class Alumnos {
    
    //atributos de entidad alumnos    
    private Date fechaIniCar;
    
    //atributos heredados de entiendad persona
    private int ci; //primarykey
    private String primNom, segNom, primApe, segApe, mailPpal, mailSec;
    private Date fechaNac, fechaReg;
    private Image foto;
    private char sexo;
    private String telefono;
    private int auto_increment;
    private String estado;
    
    public Alumnos (int ci, String primNom, String segNom, String primApe, String segApe, String mailPpal, String mailSec, Date fechaNac, Date fechaReg, Image foto, char sexo, String telefono, Date fechaIniCar, int auto_increment, String estado){
        this.ci = ci;
        this.primNom = primNom;
        this.segNom = segNom;
        this.primApe = primApe;
        this.segApe = segApe;
        this.mailPpal = mailPpal;
        this.mailSec = mailSec;
        this.foto = foto;
        this.sexo = sexo;
        this.telefono = telefono;
        this.fechaIniCar = fechaIniCar;
        this.fechaNac = fechaNac;
        this.fechaReg = fechaReg;
        this.auto_increment = auto_increment;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public int getAuto_increment() {
        return auto_increment;
    }

    public void setAuto_increment(int auto_increment) {
        this.auto_increment = auto_increment;
    }
    

    public Date getFechaIniCar() {
        return fechaIniCar;
    }

    public void setFechaIniCar(Date fechaIniCar) {
        this.fechaIniCar = fechaIniCar;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getPrimNom() {
        return primNom;
    }

    public void setPrimNom(String primNom) {
        this.primNom = primNom;
    }

    public String getSegNom() {
        return segNom;
    }

    public void setSegNom(String segNom) {
        this.segNom = segNom;
    }

    public String getPrimApe() {
        return primApe;
    }

    public void setPrimApe(String primApe) {
        this.primApe = primApe;
    }

    public String getSegApe() {
        return segApe;
    }

    public void setSegApe(String segApe) {
        this.segApe = segApe;
    }

    public String getMailPpal() {
        return mailPpal;
    }

    public void setMailPpal(String mailPpal) {
        this.mailPpal = mailPpal;
    }

    public String getMailSec() {
        return mailSec;
    }

    public void setMailSec(String mailSec) {
        this.mailSec = mailSec;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
