
import java.sql.Date;
public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String Band_name;
    private Date Date;
    private String Location;
    private int Ticket_price;

    public void setBand_name(String Band_name) {
        this.Band_name = Band_name;
    }
    public void setDate(Date Date) {
        this.Date = Date;
    }
    public void setLocation(String Location) {
        this.Location = Location;
    }
    public void setTicket_price(int Ticket_price) {
        this.Ticket_price = Ticket_price;
    }

    public String getBand_name() {
        return Band_name;
    }
    public Date getDate() {
        return Date;
    }
    public String Location() {
        return Location;
    }
    public int Ticket_price() {
        return Ticket_price;
    }
}