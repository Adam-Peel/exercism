class NeedForSpeed {
int speed;
int batteryLevel = 100;
int batteryDrain;
int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryLevel < this.batteryDrain ? true : false;
    }

    public int distanceDriven() {
         return this.distance;
    }

    public void drive() {
       if (this.batteryLevel >= this.batteryDrain ) {
           this.distance += this.speed;
           this.batteryLevel -= this.batteryDrain;} else {
           return;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if (car.speed  * (100 / car.batteryDrain) < distance) {
            return false;
        } else {
            return true;
        }
    }
}
