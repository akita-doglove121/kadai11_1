package kadai_11;

public class Magician extends Character{
	private int mp = 30;
	public Magician(String name, int hp, int atk, int dfn, int spd) {
        super(name, hp, atk, dfn, spd);  // 親クラスのコンストラクタを呼び出す
    }
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void startStatus() {
		System.out.println("魔法使い" + this.getName() + "が誕生した！");
	    System.out.println("体力は" + this.getHp() + "だ");
	    System.out.println("攻撃力は" + this.getAtk() + "だ");
	    System.out.println("防御力は" + this.getDfn() + "だ");
	    System.out.println("素早さは" + this.getSpd() + "だ");
	    System.out.println("MPは" + this.getMp() + "だ");
	}
	
	public void attack(Creature monster) {
		System.out.println( this.getName() + "は攻撃魔法を唱えた！");
		int newatk =this.getAtk() + 3;
		int damage = newatk - monster.getDfn();
		if ( damage < 0) {
			damage = 0;
		}
		int newMhp = monster.getHp() - damage;
		monster.setHp(newMhp);
		System.out.println(monster.getName() + "に" + damage + "のダメージを与えた！");
		System.out.println("MPを3消費した。");
		newatk -=3;
		this.setMp(getMp() - 3);
		System.out.println("残りMPは" + this.getMp() + "だ！");
		monster.status();
		
	}
	

	public void deffesce() {
		System.out.println("Magicianは防御した");
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
	public void heal() {
		System.out.println("回復魔法を唱えた");
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

	@Override
	public void deffense() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
