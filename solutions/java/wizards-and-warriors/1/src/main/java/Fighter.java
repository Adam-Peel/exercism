class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

class Wizard extends Fighter {

    private boolean isSpellCalled = false;
    
     public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        isSpellCalled = true;
    }

    @Override
    public boolean isVulnerable() {
       return isSpellCalled ? false : true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
       return isSpellCalled ? 12 : 3;
    }
}

// TODO: define the Wizard class
