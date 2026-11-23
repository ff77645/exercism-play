class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance = 0;
    int battery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(battery < batteryDrain) return true;
        return false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(battery <= 0) return;
        distance += speed;
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if(Math.ceilDiv(distance,car.speed) * car.batteryDrain > car.battery) return false;
        return true;
    }
}
