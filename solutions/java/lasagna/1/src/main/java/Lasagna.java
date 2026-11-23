public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int usedTime){
        return expectedMinutesInOven() - usedTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int floor){
        return floor * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int floor,int usedTime){
        return preparationTimeInMinutes(floor) + usedTime;
    }
}
