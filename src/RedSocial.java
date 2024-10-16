/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aron
 */
public class RedSocial {
    protected String usuario;
    protected String contrasena;

    public RedSocial() {
    }

    public RedSocial(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void mostrarInformacion() {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Contraseña: " + this.getContrasena());
    }
}
