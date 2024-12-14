package kadai_11;

import java.util.List;

public abstract class Creature implements TurnTaker {

	private int hp;
	private String name;
	private int atk;
	private int dfn;
	private int spd;
	
	public Creature(String name, int hp, int atk, int dfn, int spd) {
		this.name = name;
	    this.hp = hp;
	    this.atk = atk;
	    this.dfn = dfn;
	    this.spd = spd;
    }
	public void startStatus() {
		System.out.println("名前" + this.getName() + "が誕生した！");
	    System.out.println("体力は" + this.getHp() + "だ");
	    System.out.println("攻撃力は" + this.getAtk() + "だ");
	    System.out.println("防御力は" + this.getDfn() + "だ");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	

	
	public abstract void attack(List<Character> characters); //抽象化　public abstract 戻り値　メソッド（）；
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
    public abstract void deffence();
    public int getDfn() {
		return dfn;
	}
	public void setDfn(int dfn) {
		this.dfn = dfn;
	}
	void status() {
	    System.out.println(this.getName() + "のHPは " + this.getHp() + "だ！");
	}
	public void takeTurn() {
        System.out.println(this.getName() + "のターン！");
        // ターゲットとしてキャラクターを攻撃
      attack(Battle.getCharacter());
    }

}
