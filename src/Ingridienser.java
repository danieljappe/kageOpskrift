public class Ingridienser {
    // Variabler
    private String ingridiensNavn;
    private String målenhed;
    private double mængde;
    private double enhedsVægt;
    private double energiKiloJoule;
    private double energiKalorier;
    private int antalPersoner;

    // Konstanter
    private final int OPRINDELIGT_ANTAL = 4;
    private final double KILOJOULE_TIL_KCAL = 0.239;

    // konstruktør 1 - alle
    public Ingridienser(String ingridiensNavn, String målenhed, double mængde, double enhedsVægt, double energiKiloJoule) {
        this.ingridiensNavn = ingridiensNavn;
        this.målenhed = målenhed;
        this.mængde = mængde;
        this.enhedsVægt = enhedsVægt;
        this.energiKiloJoule = energiKiloJoule;
    }

    // konstruktør 2 - gram = 1
    public Ingridienser(String ingridiensNavn, String målenhed, double mængde, double energiKiloJoule) {
        this.ingridiensNavn = ingridiensNavn;
        this.målenhed = målenhed;
        this.mængde = mængde;
        this.enhedsVægt = 1;
        this.energiKiloJoule = energiKiloJoule;
    }

    // Gettere

    public String getIngridiensNavn() {
        return ingridiensNavn;
    }

    public String getMålenhed() {
        return målenhed;
    }

    public double getMængde() {
        return mængde;
    }

    public double getEnhedsVægt() {
        return enhedsVægt;
    }

    public double getenergiKiloJoule() {
        return energiKiloJoule;
    }

    public double getEnergiKalorier() {
        return energiKalorier;
    }

    // set antalPersoner
    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;

    }


    // Metoder

    // Udskrivninger

    // Udskrivning af ingridienser
    public String printIngridienser() {
        return beregnMængde() + " " + målenhed + " " + ingridiensNavn;
    }

    // Udskrivning af vægt
    public String printVægt() {
        return beregnetVægt() + " gram " + ingridiensNavn;
    }

    // Udskrivning af kilojoule
    public String printKJ() {
        return beregnetKiloJoule() + " kJ " + ingridiensNavn;
    }

    // Udskrivning af kalorier
    public String printKcal() {
        return beregnetKalorier() + " kcal " + ingridiensNavn;
    }


    // metoder og formler

    public double beregnMængde() {
        double mængde = (getMængde() / OPRINDELIGT_ANTAL) * antalPersoner;
        return mængde;

    }

    public double beregnetVægt() {
        double beregnVægt = beregnMængde() * getEnhedsVægt();
        return beregnVægt;

    }

    public double beregnetKiloJoule() {
        double energiKiloJoule = beregnetVægt() * getenergiKiloJoule();
        return energiKiloJoule;
    }

    public double beregnetKalorier() {
        double energiKalorier = beregnetKiloJoule() * KILOJOULE_TIL_KCAL;
        return energiKalorier;


        // Slut udskrivning

    }

    // Totalvægt efter bagning
    public double beregnTotalVægtEfterBagning() {
        double beregnVægtEfter = beregnMængde() * getEnhedsVægt() * 0.8;
        return beregnVægtEfter;
    }

}