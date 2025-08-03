
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
            return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length - 1] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int dayLimit = 7;
        int count = 0;
        if (numberOfDays > dayLimit) {
        for (int i = 0; i < dayLimit; i ++) {
            count += birdsPerDay[i];
        }
        return count;}
        else {
             for (int i = 0; i < numberOfDays; i ++) {
            count += birdsPerDay[i];
        }
        return count;
        }
    }

    public int getBusyDays() {
        int count = 0;
        for (int i= 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4) {
                count += 1;
            }
        }
        return count;
    }
}
