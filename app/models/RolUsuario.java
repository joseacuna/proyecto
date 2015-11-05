package models;
import play.data.validation.Required;
import play.db.jpa.JPA;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(initialValue = 1, name = "idAutonGen", sequenceName = "seq_tipo_usuario")
public class RolUsuario extends EntidadAutoLongAltKey {

    @Required
    public String rolUsuario;

    @Override
    public String toString() {
        return rolUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public static RolUsuario getById(Long idUsuario) {
        return JPA.em().find(RolUsuario.class,idUsuario);
    }
}
