import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

class ProteinTranslator {

    Map<String,String> codonMap;

    ProteinTranslator(){
        codonMap = new HashMap<>();
        codonMap.put("AUG","Methionine");
        codonMap.put("UUU","Phenylalanine");
        codonMap.put("UUC","Phenylalanine");
        codonMap.put("UUA","Leucine");
        codonMap.put("UUG","Leucine");
        codonMap.put("UCU","Serine");
        codonMap.put("UCC","Serine");
        codonMap.put("UCA","Serine");
        codonMap.put("UCG","Serine");
        codonMap.put("UAU","Tyrosine");
        codonMap.put("UAC","Tyrosine");
        codonMap.put("UGU","Cysteine");
        codonMap.put("UGC","Cysteine");
        codonMap.put("UGG","Tryptophan");
        codonMap.put("UAA","STOP");
        codonMap.put("UAG","STOP");
        codonMap.put("UGA","STOP");
    }

    List<String> translate(String rnaSequence) {
        int length = rnaSequence.length();
        List<String> codons = new ArrayList<>();
        for(int i = 0;i < length;i += 3){
            String word = codonMap.get(rnaSequence.substring(i,Math.min(i+3,length)));
            if(word == null) throw new IllegalArgumentException("Invalid codon");
            if(word == "STOP") return codons;
            codons.add(word);
        }
        return codons;
        
    }
}
