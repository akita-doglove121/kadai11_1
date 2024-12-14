package kadai_11;

public class Hero extends Charactor{//攻撃メソッドと防御メソッドのオーバライドが強制される（作らないとエラー）
	private int hp = 25;
	private String name = "勇者";
	private int atk = 7;
	private int dfn = 3;
	private int spd = 5;
	
	public void startStatus() {
		System.out.println("勇者" + this.getName() + "が誕生した！");
	    System.out.println("体力は" + this.getHp() + "だ");
	    System.out.println("攻撃力は" + this.getAtk() + "だ");
	    System.out.println("防御力は" + this.getDfn() + "だ");
	    System.out.println("素早さは" + this.getSpd() + "だ");
	}
	
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
