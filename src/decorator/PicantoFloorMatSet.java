package decorator;

import component.KiaPicantoVersion;

public class PicantoFloorMatSet extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public PicantoFloorMatSet(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Tapete tres piezas alfombra PICANTO (2018-2023). ";
    }

    public double cost() {
        return 92000 + kiaPicantoVersion.cost();
    }
}