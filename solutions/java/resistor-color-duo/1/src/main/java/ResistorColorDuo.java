import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColorDuo {

    Map<String,Integer> colorMap = new LinkedHashMap<>();

    ResistorColorDuo(){
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
    }
    
    int value(String[] colors) {
        String numStr = "";
        for(int idx = 0;idx < 2;idx++){
            numStr += colorMap.get(colors[idx]);
        }
        return Integer.parseInt(numStr);
    }
}
