package Objektvererbung.Bonus;

public class Flugzeug {
    public String getZc() {
        return zc;
    }

    public void setZc(String zc) {
        this.zc = zc;
    }

    String zc;

    @Override
    public String toString() {
        return "Flugzeug{" +
                "zc='" + zc + '\'' +
                '}';
    }
}
