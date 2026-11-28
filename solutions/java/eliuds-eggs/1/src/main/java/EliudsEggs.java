public class EliudsEggs {
    public int eggCount(int number) {
        String binaryString = Integer.toBinaryString(number);
        return binaryString.replace("0","").length();
    }
}
