public class PangramChecker {

    public boolean isPangram(String input) {
        for(char c = 'a';c <= 'z';c++){
            if(input.indexOf(c) < 0 && input.indexOf(Character.toUpperCase(c)) < 0){
                return false;
            }
        }
        return true;
    }

}
