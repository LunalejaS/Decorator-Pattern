package decorator;

import component.KiaPicantoVersion;

public class ParkingSensor extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public ParkingSensor(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Sensor de Parqueo. ";
    }

    public double cost() {
        return 150000 + kiaPicantoVersion.cost();
    }
}