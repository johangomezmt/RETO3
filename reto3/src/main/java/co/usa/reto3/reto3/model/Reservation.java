package co.usa.reto3.reto3.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="RESERVATION")
public class Reservation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String CABIN;
    private String CLIENT;
    private String START_DATE;
    private String DELIVERY_DATE;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCABIN() {
        return CABIN;
    }

    public void setCABIN(String CABIN) {
        this.CABIN = CABIN;
    }

    public String getCLIENT() {
        return CLIENT;
    }

    public void setCLIENT(String CLIENT) {
        this.CLIENT = CLIENT;
    }

    public String getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(String START_DATE) {
        this.START_DATE = START_DATE;
    }

    public String getDELIVERY_DATE() {
        return DELIVERY_DATE;
    }

    public void setDELIVERY_DATE(String DELIVERY_DATE) {
        this.DELIVERY_DATE = DELIVERY_DATE;
    }
}
