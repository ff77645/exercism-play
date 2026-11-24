public class GameMaster {

    public String describe(Character cha){
        return "You're a level "+cha.getLevel()+" "+cha.getCharacterClass()+" with "+cha.getHitPoints()+" hit points.";
    }

    public String describe(Destination des){
        return "You've arrived at "+des.getName()+", which has "+des.getInhabitants()+" inhabitants.";
    }

    public String describe(TravelMethod Tra){
        String str = "";
        if(Tra == TravelMethod.WALKING){
            str = "by walking.";
        }else {
            str = "on horseback.";
        }
        return "You're traveling to your destination " + str;
    }

    public String describe(Character cha,Destination des,TravelMethod tra){
        return describe(cha) + " " + describe(tra) + " " + describe(des);
    }

    public String describe(Character cha,Destination des){
        return describe(cha) + " " + describe(TravelMethod.WALKING) + " " + describe(des);
    }
}
