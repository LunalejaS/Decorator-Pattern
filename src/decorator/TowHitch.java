package decorator;

import component.KiaPicantoVersion;

public class TowHitch extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public TowHitch(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Tiro de arrastre. ";
    }

    public double cost() {
        return 810000 + kiaPicantoVersion.cost();
    }
}