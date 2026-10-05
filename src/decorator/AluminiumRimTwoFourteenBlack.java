package decorator;

import component.KiaPicantoVersion;

public class AluminiumRimTwoFourteenBlack extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public AluminiumRimTwoFourteenBlack(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Rin Aluminio 14'' negro mecanizado. ";
    }

    public double cost() {
        return 500000 + kiaPicantoVersion.cost();
    }
}