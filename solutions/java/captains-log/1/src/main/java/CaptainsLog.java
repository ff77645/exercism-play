import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int index = random.nextInt(10);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        int num = random.nextInt(9000) + 1000;
        return "NCC-" + num;
    }

    double randomStardate() {
        return 41000.0 + random.nextDouble() * 1000;
    }
}
