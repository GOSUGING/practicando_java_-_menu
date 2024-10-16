
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aron
 */
public class Twitter extends RedSocial {
    private int id;
    private String noticia;
    private LocalDate fecha;

    public Twitter() {
    }

    public Twitter(int id, String noticia, LocalDate fecha, String usuario, String contrasena) {
        super(usuario, contrasena);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ID: " + this.getId());
        System.out.println("Informacion noticia: " + this.getNoticia());
        System.out.println("Fecha noticia: " + this.getFecha());
    }

    
}
