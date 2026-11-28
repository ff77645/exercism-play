public class Hamming {
    String leftStrand = "";
    String rightStrand = "";
    int length = 0;
    public Hamming(String leftStrand, String rightStrand) {
        length = leftStrand.length();
        if(length != rightStrand.length()) throw new IllegalArgumentException("strands must be of equal length");
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int distance = 0;
        for(int i = 0;i < length;i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)){
                distance++;
            }
        }
        return distance;
    }
}
