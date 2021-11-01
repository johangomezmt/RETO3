package co.usa.reto3.reto3.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID;
    private String NAME;
    private String DESCRIPTION;

    public Integer getID() {
        return ID;
    }
    public void setID(Integer id) {
        ID = id;
    }
    public String getNAME() {
        return NAME;
    }
    public void setNAME(String name) {
        NAME = name;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
}