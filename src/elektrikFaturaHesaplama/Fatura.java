package elektrikFaturaHesaplama;

public class Fatura {
    private double tuketim;
    private String ay;
    private double gunlukTuketim;
    private double tutar;

    public Fatura() {

    }

    public Fatura(double tuketim, String ay) {
        this.tuketim = tuketim;
        this.ay = ay;
    }

    public double getTuketim() {
        return tuketim;
    }

    public void setTuketim(double tuketim) {
        this.tuketim = tuketim;
    }

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay.substring(0,1).toUpperCase()+ay.substring(1).toLowerCase();
    }

    public double getGunlukTuketim() {
        return gunlukTuketim;
    }

    public void setGunlukTuketim(double gunlukTuketim) {
        this.gunlukTuketim = gunlukTuketim;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    @Override
    public String toString() {
        return "*******FATURA******\n" +
                "AY= " + ay + "\n"+
                "AYLIK TÜKETİM= " + tuketim + " KW\n" +
                "GÜNLÜK TÜKETİM= " + gunlukTuketim + " KW\n" +
                "-------------------\n"+
                "FATURA TUTARI= "+ tutar+" TL";
    }
}

