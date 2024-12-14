package kadai_11;

import java.util.List;
import java.util.Random;

public abstract class Monster extends Creature {
	public Monster(String name, int hp, int atk, int dfn, int spd) {
        super(name, hp, atk, dfn, spd);  // 親クラスのコンストラクタを呼び出す
    }
	
	public void attack(List<Character> characters) {
	    System.out.println(this.getName() + "の攻撃！");

	    // ランダムでターゲットを選ぶ
	    Random rdm = new Random();
	    int targetIndex = rdm.nextInt(characters.size());  // 0 または 1 のランダムインデックスを取得
	    Character target = characters.get(targetIndex);  // ランダムに選ばれたターゲット

	    System.out.println(this.getName() + "は" + target.getName() + "に攻撃した！");

	    // ダメージ計算
	    int damage = this.getAtk() - target.getDfn();
	    if (damage < 0) {
	        damage = 0;  // ダメージが負の値にならないようにする
	    }

	    // 攻撃対象のHPを減らす
	    target.setHp(target.getHp() - damage);
	    System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");

	    // 攻撃後のステータス表示
	    target.status();
	}
	

	public void deffence() {
		System.out.println(this.getName()+"は守りを硬めた！");
		int newdfn = this.getDfn();
		if (newdfn > this.getDfn() + 20) {
			newdfn= this.getDfn() + 20;
			System.out.println("これ以上防御力はあがらない");
		}
		else {
			newdfn= this.getDfn() + 10;
			System.out.println("防御力が10上がった！");
		}
	}
	public void takeTurn() {
        System.out.println(this.getName() + "のターン！");
        // ターゲットとしてモンスターを攻撃
        attack(Battle.getCharacter());
    }
	

}
