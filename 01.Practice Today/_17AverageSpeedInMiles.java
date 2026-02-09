public class _17AverageSpeedInMiles {
    public static void main(String[] args) {
        double distanceInKM = 120;
        double timeInHours = 3;

        double distanceInMile = distanceInKM / 1.6;
        double avgSpeed = 0;

        if(timeInHours <= 0){
            System.out.println("Time Cannot be 0 and negative"); 
            return ;
        }else{
            avgSpeed = distanceInMile / timeInHours;
            System.out.printf("Average Speed in Miles: %.2f mph%n", avgSpeed);
        }
    }
}
