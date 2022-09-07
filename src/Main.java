import java.util.Scanner;

public class Main {

    private Opskrift opskrift = new Opskrift();

    private void udskrivVelkomst() {
        // Start Input
        System.out.println("------------------------------");
        System.out.println("Pandekager");
        System.out.println("Indtast venligst antal personer: ");
        System.out.println("------------------------------");
    }

    private void indlæsAntalPersoner() {
// Scanner
        Scanner brugerInput = new Scanner(System.in);
        int antal = brugerInput.nextInt();
        opskrift.setAntalPersoner(antal);
    }

    private void udskrivIngredienser() {
        System.out.println("Ingredienser:");
        for (Ingridienser ing : opskrift.getIngridiensArray()) {
            ing.printIngridienser();
            System.out.println(ing.printIngridienser());
        }
        System.out.println("------------------------------");
    }

    private void udskrivVægtPrIngrediens() {
        System.out.println("Vægt:");
        for (Ingridienser ing : opskrift.getIngridiensArray()) {
            ing.printVægt();
            System.out.println(ing.printVægt());
        }
        System.out.println("------------------------------");
    }

    private void udskrivTotalVægt() {

                // Total vægt før

        double totalVægtFør = opskrift.beregnTotalVægtFør();
        System.out.println("Den samlede vægt før bagning er: " + totalVægtFør);

                // Total vægt efter

        double totalVægtEfter = opskrift.beregnTotalVægtEfter();
        System.out.println("Den samlede vægt efter bagning er ca. " + totalVægtEfter + " gram");
        System.out.println("------------------------------");

                // Gennemsnit

        System.out.println("Den gennemsnitslige vægt per ingrediens: ");
        System.out.println(totalVægtEfter / opskrift.getIngridiensArray().length + " gram");
        System.out.println("------------------------------");
    }

    private void udskrivEnergi() {

        // Udskriv KiloJoule
        for (Ingridienser ing : opskrift.getIngridiensArray()) {
            ing.printKJ();
            System.out.println(ing.printKJ());
        }
        System.out.println("------------------------------");


            // Udskriv total Kilojoule
            double totalKiloJoule = opskrift.udskrivKJ();
            System.out.println("Den samlede total kiloJoule er " + totalKiloJoule);

                // Gennemsnitslige kJ per ingrediens
                System.out.println("Den gennemsnitslige kJ per ingrediens: ");
                System.out.println(totalKiloJoule / opskrift.getIngridiensArray().length + " kJ");
                System.out.println("------------------------------");


        // Udskriv Kalorier
        System.out.println("Energiindhold i kalorier for hver ingrediens: ");
        for (Ingridienser ing : opskrift.getIngridiensArray()) {
            ing.printKcal();
            System.out.println(ing.printKcal());
        }
        System.out.println("------------------------------");

            // Udskriv Total Kalorier
            double totalKalorier = opskrift.udskrivKcal();
            System.out.printf("Den samlede mængde kalorier er %.2f kcal.\n",totalKalorier);

                // Gennemsnitslige kcal per ingrediens
                System.out.println("Den gennemsnitslige kcal per ingrediens: ");
                System.out.println(totalKalorier / opskrift.getIngridiensArray().length%0.2f + " kcal");
                System.out.println("------------------------------");

    }

    public void start() {

        udskrivVelkomst();
        indlæsAntalPersoner();
        udskrivIngredienser();
        udskrivVægtPrIngrediens();
        udskrivTotalVægt();
        udskrivEnergi();

    }


    public static void main(String[] args) {

        Main program = new Main();
        program.start();

    }
}