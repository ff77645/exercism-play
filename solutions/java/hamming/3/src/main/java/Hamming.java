public class Hamming {
    String leftStrand = "";
    String rightStrand = "";
    int distance = 0;
    public Hamming(String leftStrand, String rightStrand) {
        int length = leftStrand.length();
        if(length != rightStrand.length()) throw new IllegalArgumentException("strands must be of equal length");
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        for(int i = 0;i < length;i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)){
                distance++;
            }
        }
    }

    public int getHammingDistance() {
        return distance;
    }
}
