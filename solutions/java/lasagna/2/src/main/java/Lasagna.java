public class Lasagna {

    private final int EXPECTED_MINUTES_IN_OVEN = 40;
    private final int PREPARATION_TIME_PER_LAYER = 2;
   
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int usedTime){
        return expectedMinutesInOven() - usedTime;
    }

    public int preparationTimeInMinutes(int floor){
        return floor * PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int floor,int usedTime){
        return preparationTimeInMinutes(floor) + usedTime;
    }
}
