package decorator;

import component.KiaPicantoVersion;

public class MatrixGeneralAlarmSystem extends AccesoriesDecorator {
    KiaPicantoVersion kiaPicantoVersion;

    public MatrixGeneralAlarmSystem(KiaPicantoVersion kiaPicantoVersion) {
        this.kiaPicantoVersion = kiaPicantoVersion;
    }

    public String getDescription() {
        return kiaPicantoVersion.getDescription() + ", Alarmas Matrix General 2 Controles. ";
    }

    public double cost() {
        return 205000 + kiaPicantoVersion.cost();
    }
}