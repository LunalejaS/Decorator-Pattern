package decorator;

import component.KiaPicantoVersion;

public class AluminiumRimFourteenBlack extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public AluminiumRimFourteenBlack(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Rin Aluminio 14'' negro mecanizado. ";
    }

    public double cost() {
        return 500000 + kiaPicantoVersion.cost();
    }
}