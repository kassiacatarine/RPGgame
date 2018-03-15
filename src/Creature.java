public abstract class Creature implements Generic{

    public Creature(String name, String race, int level, int life, int spell, int strenght, int agility, int skill, int intelligence, int charisma) {
        this.name = name;
        this.race = race;
        this.level = level;
        this.life = life;
        this.spell = spell;
        this.strenght = strenght;
        this.agility = agility;
        this.skill = skill;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
        private String name;
	private String race;
	private int level;
	private int life;
	private int spell;
	private int strenght;
	private int agility;
	private int skill;
	private int intelligence;
	private int charisma;

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0 && level < 11 ){
            this.level = level;
        } else{
            throw new IllegalArgumentException
            ("Level value is invalid, it needs to be more than 0 and equal or less then 10");
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life > 0 && life < 101 ){
            this.life = life;
        } else{
            throw new IllegalArgumentException
            ("Life value is invalid, it needs to be more than 0 and equal or less then 100");
        }
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        if (spell > 0 && spell < 101 ){
            this.spell = spell;
        } else{
            throw new IllegalArgumentException
            ("spell value is invalid, it needs to be more than 0 and equal or less then 100");
        }
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        if (strenght > 0 && strenght < 33 ){
            this.strenght = strenght;
        } else{
            throw new IllegalArgumentException
            ("Strenght value is invalid, it needs to be more than 0 and equal or less than 32");
        }
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        if (agility > 0 && agility < 13 ){
            this.agility = agility;
        } else{
            throw new IllegalArgumentException
            ("Agility value is invalid, it needs to be more than 0 and equal or less than 12");
        }
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        if (skill > 0 && skill < 17 ){
            this.skill = skill;
        } else{
            throw new IllegalArgumentException
            ("Skill value is invalid, it needs to be more than 0 and equal or less than 16");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence > 0 && intelligence < 21 ){
            this.intelligence = intelligence;
        } else{
            throw new IllegalArgumentException
            ("Intelligence value is invalid, it needs to be more than 0 and equal or less than 20");
        }
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        if (charisma > 0 && charisma < 13 ){
            this.charisma = charisma;
        } else{
            throw new IllegalArgumentException
            ("Charisma value is invalid, it needs to be more than 0 and equal or less than 12");
        }
    }
    
    public float attack(){
        return 0;
    }
    public float defend(){
         return 0;
    }
    
    public boolean alive(){
        
        return true;
    }
    
    public void losesLife(){
    
    }
    
    public void revitalize(){
    
    }
    
    public abstract float rest();

    public String toString(){
        return "a"; //to treat
   }
    
    public void call(){
    
    }
    
 }