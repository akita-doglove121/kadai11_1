package kadai_11;

import java.util.List;

public class Battle {
    private static List<Character> characters;
    private static Creature monster;

    public static void setCharacters(List<Character> chars) {
        characters = chars;
    }

    public static List<Character> getCharacter() {
        return characters;
    }

    public static void setMonster(Creature m) {
        monster = m;
    }

    public static Creature getMonster() {
        return monster;
    }

    public void startBattle() {
        while (true) {
            for (Character character : characters) {
                character.turnTake();  // キャラクターのターン
                if (monster.getHp() <= 0) {
                    System.out.println(monster.getName() + "は倒れた！");
                    return;
                }
            }
            monster.takeTurn();  // モンスターのターン
            if (characters.stream().anyMatch(ch -> ch.getHp() <= 0)) {
                System.out.println("すべてのキャラクターが倒れた！ゲームオーバー！");
                return;
            }
        }
    }
}
