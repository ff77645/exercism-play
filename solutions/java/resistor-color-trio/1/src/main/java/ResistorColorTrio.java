import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

class ResistorColorTrio {

    Map<String,Integer> colorMap = new LinkedHashMap<>();
    Map<Integer,String> unitMap = new LinkedHashMap<>();

    ResistorColorTrio(){
        colorMap.put("black",0);
        colorMap.put("brown",1);
        colorMap.put("red",2);
        colorMap.put("orange",3);
        colorMap.put("yellow",4);
        colorMap.put("green",5);
        colorMap.put("blue",6);
        colorMap.put("violet",7);
        colorMap.put("grey",8);
        colorMap.put("white",9);
        unitMap.put(9,"giga");
        unitMap.put(6,"mega");
        unitMap.put(3,"kilo");
    }
    
    String label(String[] colors) {
        String numStr = "";
        int expo = 0;
        for(int idx = 0;idx < 3;idx++){
            if(idx < 2){
                numStr += colorMap.get(colors[idx]);
            }else{
                expo = colorMap.get(colors[idx]);
            }
        }
        
        double value = Integer.parseInt(numStr) * Math.pow(10,expo);
        if(value == 0) return "0 ohms";
        
        String unit = "";
        for(Integer unitKey:unitMap.keySet()){
            if(value % Math.pow(10,unitKey) == 0){
                value /= Math.pow(10,unitKey);
                unit = unitMap.get(unitKey);
                break;
            }
        }
        return (int)value + " " + unit + "ohms";
    }
}
