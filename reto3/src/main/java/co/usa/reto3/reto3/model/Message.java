package co.usa.reto3.reto3.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="MESSAGE")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String MESSAGE;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer id) {
        ID = id;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String message) {
        MESSAGE = message;
    }
}
