package kadai_11;


public class Hero extends Character{//攻撃メソッドと防御メソッドのオーバライドが強制される（作らないとエラー）
	public Hero(String name, int hp, int atk, int dfn, int spd) {
        super(name, hp, atk, dfn, spd);  // 親クラスのコンストラクタを呼び出す
    }
	
	public void startStatus() {
		System.out.println("勇者" + this.getName() + "が誕生した！");
	    System.out.println("体力は" + this.getHp() + "だ");
	    System.out.println("攻撃力は" + this.getAtk() + "だ");
	    System.out.println("防御力は" + this.getDfn() + "だ");
	    System.out.println("素早さは" + this.getSpd() + "だ");
	}
	
	public void attack(Creature monster) {
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

	public void deffense() {
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
		this.setDfn(newdfn);  // 防御力を更新
		
	}
	public void turnTake() {
        System.out.println(this.getName() + "のターン！");
        // ターゲットとしてモンスターを攻撃
        attack(Battle.getMonster());
    }

	@Override
	public int getSpeed() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	

}
