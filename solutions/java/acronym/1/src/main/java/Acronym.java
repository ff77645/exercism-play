class Acronym {

    String phrase = "";
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String res = "";
        for(String str:phrase.split("[\\s-]+")){
             res += str.replaceAll("[^a-zA-Z]","").substring(0,1).toUpperCase();   
        }
        return res;
    }

}
