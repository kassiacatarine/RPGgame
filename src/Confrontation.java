import java.util.HashMap;

/**
 * Confrontation
 */
public class Confrontation {

    private BuildCharacter bCharacter;
    private HashMap<String, Hero> heroes;
    private HashMap<String, Monster> monsters;
    private Battle battle;

    public Confrontation() {
        bCharacter = new BuildCharacter();
        heroes = bCharacter.listHeroes();
        monsters = bCharacter.listMonsters();
        battle = new Battle();
    }

    public void init() {
        Creature winnerFirst = callBattle(monsters.get("montaro"), heroes.get("dark-glorysson"));
        Creature winnerSecond = callBattle(monsters.get("matilda"), heroes.get("mellayne"));
        Creature winnerThird = callBattle(monsters.get("lord-black"), heroes.get("gryin"));
        Creature winnerLast = callBattle(winnerFirst, winnerSecond);
        Creature winnerFinished = callBattle(winnerThird, winnerLast);
        championshipFinished(winnerFinished);
    }

    public Creature callBattle(Creature first, Creature second) {
        first.toString();
        second.toString();
        return battle.battleStart(first, second);
    }

    public void championshipFinished(Creature winner) {
        System.out.println("|------------------------ Championship Finished ------------------------|");
        System.out.println();
        winner.toString();
    }
}