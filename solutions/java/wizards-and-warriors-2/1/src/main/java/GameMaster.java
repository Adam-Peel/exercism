public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod method) {
        String travel;
        if (method == TravelMethod.WALKING) {
            travel = "by walking.";
        } else {
            travel = "on horseback.";
        }
        
        return "You're traveling to your destination " + travel;
    }
    
    public String describe(Character character, Destination destination, TravelMethod method) {
        return this.describe(character) + " " + this.describe(method) + " " + this.describe(destination);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return this.describe(character) + " " + this.describe(TravelMethod.WALKING) + " " + this.describe(destination);
    }
}
