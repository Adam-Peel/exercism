public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed < 5){
            return 221 * speed;
        } else if (speed < 9) {
            return 221 * speed * 0.9;
        } else if (speed == 9) {
            return 221 * speed * 0.8;
        } else {
            return 221 * speed * 0.77;
        }
            
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.floor(productionRatePerHour(speed) / 60);
    }
}
