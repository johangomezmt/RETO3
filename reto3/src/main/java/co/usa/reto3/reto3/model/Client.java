package co.usa.reto3.reto3.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID;
    private String NAME;
    private String EMAIL;
    private String PASSWORD;
    private Integer AGE;

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
    public String getEMAIL() {
        return EMAIL;
    }
    public void setEMAIL(String email) {
        EMAIL = email;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Integer getAGE() {
        return AGE;
    }
    public void setAGE(Integer age) {
        AGE = age;
    }

}
