public class CarsAssemble {
    private final int HOURLY_OUTPUT = 221;
    public double productionRatePerHour(int speed) {
        double output = HOURLY_OUTPUT * speed;
        if(speed == 10){
            output *= 0.77;
        }else if(speed == 9){
            output *= 0.80;
        }else if(speed > 4){
            output *= 0.90;
        }
        return output;
    }

    public int workingItemsPerMinute(int speed) {
        double total = productionRatePerHour(speed);
        int outputForMinute = (int)(total / 60);
        return outputForMinute;
    }
}
