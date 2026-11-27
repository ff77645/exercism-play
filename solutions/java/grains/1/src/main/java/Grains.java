import java.math.BigInteger;

class Grains {
    
    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64) throw new IllegalArgumentException("square must be between 1 and 64");
        if(square == 1) return BigInteger.ONE;
        return grainsOnSquare(square - 1).multiply(BigInteger.TWO);
    }

    BigInteger grainsOnBoard() {
        BigInteger sum = BigInteger.ZERO;
        for(int i = 1;i < 65;i++){
            sum = sum.add(BigInteger.TWO.pow(i-1));
        }
        return sum;
    }

}
