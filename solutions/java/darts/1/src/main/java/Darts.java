class Darts {
    int score(double xOfDart, double yOfDart) {
        double val = Math.sqrt(Math.pow(xOfDart,2)+Math.pow(yOfDart,2));
        if(val <= 1) return 10;
        if(val <= 5) return 5;
        if(val <= 10) return 1;
        return 0;
    }
}
