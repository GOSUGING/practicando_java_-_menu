/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aron
 */
public class Instagram extends RedSocial {
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String contrasena) {
        super(usuario, contrasena);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String mostrarEstado() {
        return estado ? "disponible" : "no disponible";
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ID: " + this.getId());
        System.out.println("Historia: " + this.getHistoria());
        System.out.println("Estado: " + this.mostrarEstado());;
    }




}
