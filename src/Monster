public class Monster extends Creature {

    public Monster(String name, String race, int level, int life, int magic,
            int strenght, int agility, int skill, int intelligence, int charisma) {
        super(name, race, level, life, magic, strenght, agility, skill, intelligence, charisma);
    }
   

    public void Rest(Monster Revitalize) {
        float rev;
        rev = (Revitalize.getLife() + Revitalize.getMagic()) / 2;
        if (rev >= 20){
            Revitalize.setLife(80);
            Revitalize.setMagic(80);
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
