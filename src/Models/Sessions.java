package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessions {

    private int sessionId;
    private Date LocalDate;
    private List<Etudiants> etudiants;

    public Sessions() {
    }

    public Sessions(int sessionId, Date localDate, List<Etudiants> etudiants) {
        this.sessionId = sessionId;
        LocalDate = localDate;
        this.etudiants = new ArrayList<>();
    }

    public int getSessionId() {
        return sessionId;
    }
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
    public Date getLocalDate() {
        return LocalDate;
    }
    public void setLocalDate(Date localDate) {
        LocalDate = localDate;
    }
    public List<Etudiants> getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(List<Etudiants> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Sessions {" +
                "sessionId = " + sessionId +
                ", LocalDate = " + LocalDate +
                ", etudiants = " + etudiants +
                '}';
    }
}
