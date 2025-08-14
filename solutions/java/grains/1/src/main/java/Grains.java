import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
       if (square < 1 || square > 64) {
           throw new IllegalArgumentException ("square must be between 1 and 64");
       }
        BigInteger grains = BigInteger.ONE;
        for (int i = 1; i < square; i++) {
            grains = grains.multiply(new BigInteger("2"));
        }
        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger grains = new BigInteger("1");
        for (int i = 1; i <= 64; i++) {
            grains = grains.add(grainsOnSquare(i));
        }
        return grains.subtract(BigInteger.ONE);
    }

}
