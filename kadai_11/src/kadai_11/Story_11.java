package kadai_11;
import java.util.*;
import java.util.List;
public class Story_11 {
    public static void main(String[] args) {
        // キャラクターを配列で作成
        Character[] c = new Character[2];
        c[0] = new Hero("勇者", 25, 7, 3, 5);
        c[1] = new Magician("魔法使い", 25, 5, 2, 3);
        for (Character ch : c) {
        	
        }

        // 各キャラクターの状態を表示
        
        // モンスターの設定
        Monster monster = new Monster("ドラゴン", 100, 8, 2, 4);
        System.out.println("モンスターの" + monster.getName() + "が誕生した！");
        System.out.println(monster.getName() + "の体力は" + monster.getHp() + "だ");
        System.out.println(monster.getName() + "の攻撃力は" + monster.getAtk() + "だ");
        System.out.println(monster.getName() + "の防御力は" + monster.getDfn() + "だ");
        System.out.println("素早さは" + monster.getSpd() + "だ");

        // Battleクラスにキャラクターとモンスターを設定
        Battle.setCharacters(List.of(c[0], c[1])); // heroとmagicianを指定
        Battle.setMonster(monster);

        // バトル開始
        Battle battle = new Battle();
        battle.startBattle();
    }
}
