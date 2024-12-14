package kadai_11;

import java.util.Random;

public class Monster extends Creature {
    public void attack(Charactors[0],Charactors[1]) {
		System.out.println(this.getName() + "の攻撃！");
		
		Random rdm = new Random();
		int target = rdm.nextInt(2);
		
		if(target == 0) {
			System.out.println(this.getName() + "は" + hero.getName() + "に攻撃した！" );
			int damage = this.getAtk() -hero.getDfn();
			if (damage < 0) {
				damage = 0;
			}
			int newHhp = hero.getHp() -damage;
			hero.setHp(newHhp);
			System.out.println(hero.getName() + "に" + damage + "のダメージを与えた！");
			hero.status();
		}else {
			System.out.println(this.getName() + "は" + magician.getName() + "に攻撃した！" );
			int damage = this.getAtk() -magician.getDfn();
			if (damage < 0) {
				damage = 0;
			}
			int newMghp = magician.getHp() - damage;
			magician.setHp(newMghp);
			System.out.println(magician.getName() + "に" + damage + "のダメージを与えた！");
			magician.status();
			
		}
	
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
	

}
