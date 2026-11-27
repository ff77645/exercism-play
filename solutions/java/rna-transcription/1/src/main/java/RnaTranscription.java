import java.util.Map;

class RnaTranscription {

    Map<String,String> data = Map.of("G","C","C","G","T","A","A","U");

    String transcribe(String dnaStrand) {
        if(dnaStrand.isEmpty()) return dnaStrand;
        // return data.get(dnaStrand);
        String resStr = "";
        for(String str:dnaStrand.split("")){
            resStr += data.get(str);
        }
        return resStr;
    }

}
