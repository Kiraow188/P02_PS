package sg.edu.rp.c347.p02_ps;

public class Holiday {
    private String day;
    private String date;
    private boolean ph;

    private String type;

    public Holiday(String day, String date, boolean ph, String type) {
        this.day = day;
        this.date = date;
        this.ph = ph;
        this.type = type;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {

        this.day = day;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public boolean isPh() {

        return ph;
    }

    public void setPh(boolean ph) {

        this.ph = ph;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }
}
