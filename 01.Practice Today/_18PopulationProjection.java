public class _18PopulationProjection {

    private static final long SECONDS_IN_YEAR = 31536000L;

    public static double changeToYears(double valuePerSec) {
        return valuePerSec * SECONDS_IN_YEAR;
    }

    public static void main(String[] args) {
        /**
         * Improved Population Projection for February 2026
         * Rates based on February 2026 demographic data.
         */

        long currentPopulation = 1471600000L;

        double birthsPerSec = 0.958; // Based on ~82,775 births/day
        double deathsPerSec = 0.348; // Based on ~30,052 deaths/day
        double netImmigrantPerSec = 0.012;
        double netEmigrantsPerSec = 0.08;
        double netMigrantsPerSec = netImmigrantPerSec - netEmigrantsPerSec;

        // Total Growth
        double growthsPerSec = birthsPerSec - deathsPerSec + netMigrantsPerSec;

        // Projection
        double annualGrowth = changeToYears(growthsPerSec);
        long projectedPopulationOneYear = currentPopulation + (long) annualGrowth;

        System.out.println("--- India Population Projection Report ---");
        System.out.println("Starting Population: " + currentPopulation);
        System.out.printf("Births per Year:      %,.0f\n", changeToYears(birthsPerSec));
        System.out.printf("Deaths per Year:      %,.0f\n", changeToYears(deathsPerSec));
        System.out.printf("Net Migrants/Year:    %,.0f (Net Loss)\n", changeToYears(netMigrantsPerSec));
        System.out.println("------------------------------------------");
        System.out.printf("Total Annual Growth:  %,.0f\n", annualGrowth);
        System.out.println("Projected Pop (2027): " + projectedPopulationOneYear);
    }
}
