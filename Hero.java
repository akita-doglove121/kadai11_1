package kadai_11;

public class Hero extends Charactor{//攻撃メソッドと防御メソッドのオーバライドが強制される（作らないとエラー）
	public void attack(Creature monster) {
		System.out.println("Heroの攻撃");
		int damage = this.getAtk() - monster.getDfn();
		if ( damage < 0) {
			damage = 0;
		}
		int newMhp = monster.getHp() -damage;
		if (newMhp < 0) {
			newMhp= 0;
		}
		monster.setHp(newMhp);
		System.out.println(monster.getName() + "に" + damage + "のダメージを与えた！");
		monster.status();
		}

	public void deffence() {
		System.out.println("Heroは防御した");
		int newdfn = this.getDfn();
		if (newdfn > this.getDfn() + 20) {
			newdfn = this.getDfn() + 20;
			System.out.println("これ以上防御力はあがらない");
		}
		else {
			newdfn = this.getDfn() + 10;
			System.out.println("防御力が10上がった！");
		}
	}
	

}
