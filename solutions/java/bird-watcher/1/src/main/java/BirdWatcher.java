
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int todayIndex = birdsPerDay.length - 1;
        int totalCount = birdsPerDay[todayIndex];
        totalCount++;
        birdsPerDay[todayIndex] = totalCount;
    }

    public boolean hasDayWithoutBirds() {
        for(int count:birdsPerDay){
            if(count == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int amount = 0;
        if(numberOfDays > birdsPerDay.length) numberOfDays = birdsPerDay.length;
        for(int index = 0; index < numberOfDays; index++ ){
            amount += birdsPerDay[index];
        }
        return amount;
    }

    public int getBusyDays() {
        int count = 0;
        for(int val:birdsPerDay){
            if(val >= 5) count++;
        }
        return count;
    }
}
