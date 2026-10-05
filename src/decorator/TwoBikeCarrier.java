package decorator;

import component.KiaPicantoVersion;

public class TwoBikeCarrier extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public TwoBikeCarrier(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Portabicicletas x2 Puestos. ";
    }

    public double cost() {
        return 910000 + kiaPicantoVersion.cost();
    }
}