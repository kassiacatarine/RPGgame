public class Hero extends Creature {

    public Hero(String name, String race, int level, int life, int magic,
            int strenght, int agility, int skill, int intelligence, int charisma) {
        super(name, race, level, life, magic, strenght, agility, skill, intelligence, charisma);
    }

    public void Rest(Hero Revitalize) {
        float rev;
        rev = (Revitalize.getLife() + Revitalize.getMagic()) / 2;
        if (rev >= 20){
            Revitalize.setLife(85);
            Revitalize.setMagic(85);
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
