import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iNo = false;
        boolean hNo = false;
        for(String card:theirCollection){
            if(!myCollection.contains(card)) {
                iNo = true;
                break;
            }
        }
        for(String card:myCollection){
            if(!theirCollection.contains(card)) {
                hNo = true;
                break;
            }
        }
        return hNo && iNo;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        var firstSet = collections.getFirst();
        var commonSet = new HashSet<String>();
        for(String card:firstSet){
            boolean allHas = true;
            for(Set<String> set:collections){
                if(!set.contains(card)) {
                    allHas = false;
                    break;
                };
            }
            if(allHas) commonSet.add(card);
        }
        return commonSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        var cards = new HashSet<String>();
        for(Set<String> set:collections){
            for(String card:set){
                cards.add(card);
            }
        }
        return cards;
    }
}
