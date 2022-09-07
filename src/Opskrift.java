public class Opskrift {
    private String navn;
    private int antalPersoner;
    private Ingridienser[] ingridiensArray;

    public Opskrift() {

        Ingridienser vaniljestang = new Ingridienser("vaniljestang", "stk", 0.25, 6, 0.04);
        Ingridienser sukker = new Ingridienser("sukker", "gram", 25, 1, 17);
        Ingridienser kardemomme = new Ingridienser("kardemomme", "tsk", 0.25, 1, 13.44);
        Ingridienser æg = new Ingridienser("æg", "stk", 1.5, 60, 5.7);
        Ingridienser mælk = new Ingridienser("mælk", "dl", 1.5, 100, 1.6);
        Ingridienser øl = new Ingridienser("øl", "spsk", 2, 6, 1.5);
        Ingridienser salt = new Ingridienser("salt", "knivspids", 0.5, 0.25, 0);
        Ingridienser hvedemel = new Ingridienser("hvedemel", "gram", 62.5, 1, 14.76);
        Ingridienser smør = new Ingridienser("smør", "spsk", 0.5, 15, 30.30);

        // Array af ingredienserne
        ingridiensArray = new Ingridienser[]{vaniljestang, sukker, kardemomme, æg, mælk, øl, salt, hvedemel, smør};

    }

    // Getter array

    public Ingridienser[] getIngridiensArray() {
        return ingridiensArray;
    }

    // set antal
    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;
        for (Ingridienser ing : ingridiensArray) {
            ing.setAntalPersoner(antalPersoner);
        }
    }

    // Metode for getter
    public int getAntalPersoner() {
        return antalPersoner;
    }

    // totalvægt
    public double beregnTotalVægtFør() {
        double totalVægt = 0;
        for (Ingridienser ing : ingridiensArray) {
            totalVægt += ing.beregnetVægt();
        }
        return totalVægt;
    }

    public double beregnTotalVægtEfter() {
        double totalVægtEfter = 0;
        for (Ingridienser ing : ingridiensArray) {
            totalVægtEfter += ing.beregnTotalVægtEfterBagning();
        }
        return totalVægtEfter;
    }


    // gennemsnit

    // totalkj
    public double udskrivKJ() {
        double totalKJ = 0;
        for (Ingridienser ing : ingridiensArray) {
            totalKJ += ing.beregnetKiloJoule();
        }
        return totalKJ;
    }

    // totalkcal
    public double udskrivKcal() {
        double totalKcal = 0;
        for (Ingridienser ing : ingridiensArray) {
            totalKcal += ing.beregnetKalorier();
        }
        return totalKcal;
    }


    // gennemsnit for energi

}
