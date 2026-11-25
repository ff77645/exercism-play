class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] charArr = new Integer(numberToCheck).toString().toCharArray();
        int len = charArr.length;
        int val = 0;
        for(char cha:charArr){
            val += Math.pow(cha - '0',len);
        }

        return val == numberToCheck;
    }

}
