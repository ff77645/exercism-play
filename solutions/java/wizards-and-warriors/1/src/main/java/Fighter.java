class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public boolean isVulnerable(){
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 : 6;
    }

    public String toString(){
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    
    private boolean isPrepareSpell = false;

    void prepareSpell(){
        isPrepareSpell = true;
    }
    
    @Override
    public boolean isVulnerable(){
        return !isPrepareSpell;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        return isPrepareSpell ? 12 : 3;
    }

    public String toString(){
        return "Fighter is a Wizard";
    }
}
