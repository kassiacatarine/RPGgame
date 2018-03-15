public class Hero extends Creature {
    
    private int bless;
    
    public int getBless(){
        return bless;
    }
    public void setBless(int bless){
        this.bless = bless;
    }

    public Hero(String name, String race, int level, 
                int life, int spell, int strenght, 
                int agility, int skill, int intelligence,
                int charisma, int bless) {
        super(name, race, level, life, spell, strenght, agility, skill, intelligence, charisma);
        this.bless = bless;
    }

    public void Rest(Hero Revitalize) {
        float rev;
        rev = (Revitalize.getLife() + Revitalize.getSpell()) / 2;
        if (rev >= 20){
            Revitalize.setLife(85);
            Revitalize.setSpell(85);
        }
    }

    @Override
    public float rest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void call() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
