/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author stalin
 */
public class vtrabajador extends vpersona{
    
  private Double sueldo; 
  private String login;
  private String clavePassword;
  private String estado;

    public vtrabajador() {
    }

    public vtrabajador(Double sueldo, String login, String clavePassword, String estado) {
        this.sueldo = sueldo;
        this.login = login;
        this.clavePassword = clavePassword;
        this.estado = estado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClavePassword() {
        return clavePassword;
    }

    public void setClavePassword(String clavePassword) {
        this.clavePassword = clavePassword;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
