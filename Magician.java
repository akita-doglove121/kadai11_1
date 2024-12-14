package kadai_11;

public class Magician extends Charactor{
	private int hp = 25;
	private String name = "魔法つかい";
	private int atk = 5;
	private int dfn = 2;
	private int spd = 3;
	private int mp = 30;
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void startStatus() {
		System.out.println("勇者" + this.getName() + "が誕生した！");
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
		int newmp = getMp() - 3;
		System.out.println("残りMPは" + this.getMp() + "だ！");
		newatk -=3;
		monster.status();
		
	}
	public void deffence() {
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
	}
	public void heal() {
		System.out.println("回復魔法を唱えた");
	}

}
