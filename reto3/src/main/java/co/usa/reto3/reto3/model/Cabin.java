package co.usa.reto3.reto3.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cabin")
public class Cabin implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String BRAND;
    private String ROOMS;
    private Integer CATEGORY_ID;
    private String NAME;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getROOMS() {
        return ROOMS;
    }

    public void setROOMS(String ROOMS) {
        this.ROOMS = ROOMS;
    }

    public Integer getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public void setCATEGORY_ID(Integer CATEGORY_ID) {
        this.CATEGORY_ID = CATEGORY_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
