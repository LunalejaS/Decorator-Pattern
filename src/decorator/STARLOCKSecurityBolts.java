package decorator;

import component.KiaPicantoVersion;

public class STARLOCKSecurityBolts extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public STARLOCKSecurityBolts(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Pornos de seguridad STARLOCK. ";
    }

    public double cost() {
        return 156100 + kiaPicantoVersion.cost();
    }
}