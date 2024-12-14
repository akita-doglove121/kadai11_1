package kadai_11;

import java.util.List;

public abstract class Creature implements TurnTaker {

	private int hp;
	private String name;
	private int atk;
	private int dfn;
	private int spd;
	
	public Creature(String name, int hp, int atk, int dfn, int spd) {
        
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
