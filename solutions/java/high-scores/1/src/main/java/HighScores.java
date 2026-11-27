import java.util.List;
import java.util.ArrayList;

class HighScores {

    List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        Integer res = Integer.MIN_VALUE;
        for(Integer val:highScores){
            if(res.compareTo(val) < 0){
                res = val;
            }
        }
        return res;
    }

    List<Integer> personalTopThree() {
        List<Integer> list = new ArrayList(highScores);
        list.sort(null);
        return list.reversed().subList(0,Integer.min(3,highScores.size()));
    }

}
