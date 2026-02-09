public class _16AverageSpeedInMiles {
    public static void main(String[] args) {
        // Average Speed = Total Distance / Total Time

        double distanceInML = 120; // Distance In Miles
        double timeInHours = 3; // Time in Hours
        double avgSpeed = 0;

        if(timeInHours <= 0){
            System.out.println("Time Cannot be 0 and negative"); 
            return ;
        }else {
            avgSpeed = distanceInML / timeInHours;
            System.out.printf("Average Speed in Miles: %.2f mph%n", avgSpeed);
        }
    }
}