package models;

import play.db.jpa.JPA;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@SequenceGenerator(name = "idAutoGen", sequenceName = "seq_persona")
public class Persona extends EntidadAutoLongAltKey{

    public String nombres;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String rut;
    public int genero;
    public String direccion;
    public String telefono;
    public String anexo;
    @Temporal(TemporalType.TIMESTAMP)
    public Date fechaNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    public Comuna comuna;
    @ManyToOne(fetch = FetchType.LAZY)
    public Provincia provincia;
    @ManyToOne(fetch = FetchType.LAZY)
    public Region region;
    @ManyToOne(fetch = FetchType.LAZY)
    public Pais pais;
    @OneToMany
    public Usuario usuarios;

    public static Persona findPersonaByAltKey(String altKey) {
        try{
            Persona persona= JPA.em().createQuery("select pr FROM Persona pr where pr.altKey=?1",Persona.class).setParameter(1,altKey).getSingleResult();
            return persona;
        }catch (NoResultException e){
            return null;
        }


    }

    /*public static Persona checkUsuario(String usuario) {
        try{
            Persona usuario= JPA.em().createQuery("select per from Persona per where per.usuarios.usuario=?1",Persona.class);
            return usuario;

        }
        catch (NoResultException e){
            return null;
        }

    }*/
}
