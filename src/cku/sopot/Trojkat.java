package cku.sopot;

public class Trojkat {
    private float wysokosc;
    private float podstawa;

    public Trojkat(float wysokosc, float podstawa) {
        setWysokosc(wysokosc);
        setPodstawa(podstawa);
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(float wysokosc) {
        if (wysokosc >= 0) this.wysokosc = wysokosc;
        else this.wysokosc = - wysokosc;
    }

    public float getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(float podstawa) {
        if (podstawa >= 0) this.podstawa = podstawa;
        else this.podstawa = - podstawa;
    }
    public float obliczPole(){
        return podstawa * wysokosc /2;
    }

}
