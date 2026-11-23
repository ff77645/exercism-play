import java.util.Map;

class SqueakyClean {

    private static Map<Character,Character> letterMap = Map.of('4','a','3','e','0','o','1','l','7','t');
    
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = identifier.toCharArray();
        boolean nextToUpcase = false;
        for(char cha:charArr){
            if(Character.isWhitespace(cha)){
                sb.append('_');
            }else if(Character.compare('-',cha) == 0){
                nextToUpcase = true;
                continue;
            }else if(Character.isLetter(cha)){
                if(nextToUpcase) {
                    sb.append(Character.toUpperCase(cha));
                }else{
                    sb.append(cha);
                }
            }else if(Character.isDigit(cha)){
                sb.append(letterMap.get(cha));
            }
            nextToUpcase = false;
        }
        return sb.toString();
    }
}
