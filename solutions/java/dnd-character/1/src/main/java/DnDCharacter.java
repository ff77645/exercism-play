import java.util.List;
import java.util.Random;
import java.util.ArrayList;

class DnDCharacter {

    Random random = new Random();
    private int DICE_COUNT = 4;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    int ability(List<Integer> scores) {
        int sum = 0;
        Integer min = scores.get(0);
        for(Integer i:scores){
            min = Integer.min(min,i);
            sum += i;
        }
        return sum - min;
    }

    List<Integer> rollDice() {
        List<Integer> list = new ArrayList<>(DICE_COUNT);
        for(int i = 0;i < DICE_COUNT;i++){
            list.add(random.nextInt(6) + 1);
        }
        return list;
    }

    int modifier(int input) {
        return (int)Math.floorDiv(input - 10,2);
    }

    int getStrength() {
        if(strength != 0) return strength;
        strength = ability(rollDice());
        return strength;
    }

    int getDexterity() {
        if(dexterity != 0) return dexterity;
        dexterity = ability(rollDice());
        return dexterity;
    }

    int getConstitution() {
        if(constitution != 0) return constitution;
        constitution = ability(rollDice());
        return constitution;
    }

    int getIntelligence() {
        if(intelligence != 0) return intelligence;
        intelligence = ability(rollDice());
        return intelligence;
    }

    int getWisdom() {
        if(wisdom != 0) return wisdom;
        wisdom = ability(rollDice());
        return wisdom;
    }

    int getCharisma() {
        if(charisma != 0) return charisma;
        charisma = ability(rollDice());
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
