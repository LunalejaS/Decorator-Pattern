package decorator;

import component.KiaPicantoVersion;

public class CargoNet extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public CargoNet(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Malla de Carga. ";
    }

    public double cost() {
        return 500000 + kiaPicantoVersion.cost();
    }
}