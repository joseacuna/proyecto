package models;

import javax.persistence.ManyToOne;

/**
 * Created by Jose on 03-11-15.
 */
//se refiere a las salas o oficinas
public class Dependencia {

    public String nombreSala;
    public String ubicacion;

    @ManyToOne
    public Establecimiento establecimiento;

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
