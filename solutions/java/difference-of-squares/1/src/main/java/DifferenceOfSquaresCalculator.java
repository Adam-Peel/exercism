class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int number = 0;
        for (int i = 0; i <= input; i++) {
            number += i;
        }
        return number * number;
    }

    int computeSumOfSquaresTo(int input) {
       int number = 0;
        for (int i = 0; i <= input; i++){
            number += i*i;
        }
        return number;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
