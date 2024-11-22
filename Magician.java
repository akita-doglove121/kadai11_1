package kadai_11;

public class Magician extends Charactor{
	private int mp;
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
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

}
