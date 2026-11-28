class NaturalNumber {
    private int sum = 0;
    int number;
    NaturalNumber(int number) {

        if(number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        
        this.number = number;
        int val = number / 2 + 1;
        for(int i = 1;i < val;i++){
            if(number % i == 0){
                sum += i;
            }
        }
    }

    Classification getClassification() {
        if(sum == number) return Classification.PERFECT;
        else if (sum > number) return Classification.ABUNDANT;
        else return Classification.DEFICIENT;
    }
}
