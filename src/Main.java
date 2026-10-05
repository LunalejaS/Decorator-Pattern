import component.*;
import decorator.*;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    private static final String PRECIO = "> Precio $COP: ";
    private static final String DESCRIPCION = "> Descripcion: ";

    private static final NumberFormat FORMATO_COP = NumberFormat.getInstance(new Locale("es", "CO"));
    static {
        FORMATO_COP.setMaximumFractionDigits(0);
        FORMATO_COP.setGroupingUsed(true);
    }

    private static void imprimir(KiaPicantoVersion kia) {
        System.out.println(DESCRIPCION + kia.getDescription());
        System.out.println(PRECIO + FORMATO_COP.format(kia.cost()));
        System.out.println();
    }

    public static void main(String[] args) {
        // Kia Picanto versions without accesories
        System.out.println("*** Kia Picanto Version sin accesorios: \n");

        KiaPicantoVersion kiaPicantoGTA = new GTLineAT();
        imprimir(kiaPicantoGTA);

        KiaPicantoVersion kiaPicantoVibrantMT = new VibrantMT();
        imprimir(kiaPicantoVibrantMT);

        KiaPicantoVersion kiaPicantoZenithAT = new ZenithAT();
        imprimir(kiaPicantoZenithAT);

        KiaPicantoVersion kiaPicantoZenithMT = new ZenithMT();
        imprimir(kiaPicantoZenithMT);

        // Kia Picanto versions with accesories (examples)
        System.out.println("*** Kia Picanto Version con accesorios: \n");

        // Example 1: GT Line AT + black rims + alarm + floor mats
        KiaPicantoVersion ejemplo1 = new GTLineAT();
        ejemplo1 = new AluminiumRimFourteenBlack(ejemplo1);
        ejemplo1 = new MatrixGeneralAlarmSystem(ejemplo1);
        ejemplo1 = new PicantoFloorMatSet(ejemplo1);
        imprimir(ejemplo1);

        // Example 2: Vibrant MT + 13'' rims + parking sensor + security bolts
        KiaPicantoVersion ejemplo2 = new STARLOCKSecurityBolts(
                new ParkingSensor(
                        new AluminiumRimThirteenGray(
                                new VibrantMT())));
        imprimir(ejemplo2);

        // Example 3: Zenith AT + gray rims + tow hitch + bike carrier + cargo net
        KiaPicantoVersion ejemplo3 = new ZenithAT();
        ejemplo3 = new AluminiumRimFourteenGray(ejemplo3);
        ejemplo3 = new TowHitch(ejemplo3);
        ejemplo3 = new TwoBikeCarrier(ejemplo3);
        ejemplo3 = new CargoNet(ejemplo3);
        imprimir(ejemplo3);

        // Example 4: Zenith MT with the same accessory added twice (decorators stack)
        KiaPicantoVersion ejemplo4 = new ZenithMT();
        ejemplo4 = new ParkingSensor(ejemplo4);
        ejemplo4 = new ParkingSensor(ejemplo4);
        imprimir(ejemplo4);
    }
}