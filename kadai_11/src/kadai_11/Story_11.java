package kadai_11;
import java.util.List;
public class Story_11 {
    public static void main(String[] args) {
        // キャラクターを配列で作成
        Character[] c = new Character[2];
        c[0] = new Hero("勇者", 25, 7, 3, 5);
        c[1] = new Magician("魔法使い", 25, 5, 2, 3);
        for (Character ch : c) {
        	ch.startStatus();
        	
        }

        // 各キャラクターの状態を表示
        
        // モンスターの設定
        Monster monster = new Monster("ドラゴン", 10, 8, 2, 4);
        monster.startStatus();
        // Battleクラスにキャラクターとモンスターを設定
        Battle.setCharacters(List.of(c[0], c[1])); // heroとmagicianを指定
        Battle.setMonster(monster);

        // バトル開始
        Battle battle = new Battle();
        battle.startBattle();
    }
}
