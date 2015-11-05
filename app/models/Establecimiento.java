package models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
@Entity
public class Establecimiento {
    public String nombreEdificio;// corresponde al nombre del edificio
    public String descripcion;//Indicar si es casa mateiz o sede
    public String direccion; //Direccion del establesimiento

    @ManyToOne(fetch = FetchType.LAZY)
    public Comuna comuna;
    @ManyToOne(fetch = FetchType.LAZY)
    public Provincia provincia;
    @ManyToOne(fetch = FetchType.LAZY)
    public Region region;
    @ManyToOne(fetch = FetchType.LAZY)
    public Pais pais;
}
