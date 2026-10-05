package decorator;

import component.KiaPicantoVersion;

public class AluminiumRimThirteenGray extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public AluminiumRimThirteenGray(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Rin Aluminio 13'' PICANTO. ";
    }

    public double cost() {
        return 350000 + kiaPicantoVersion.cost();
    }
}