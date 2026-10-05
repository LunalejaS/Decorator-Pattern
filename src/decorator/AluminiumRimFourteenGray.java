package decorator;

import component.KiaPicantoVersion;

public class AluminiumRimFourteenGray extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public AluminiumRimFourteenGray(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Rin Aluminio 14'' gris mecanizado. ";
    }

    public double cost() {
        return 500000 + kiaPicantoVersion.cost();
    }
}