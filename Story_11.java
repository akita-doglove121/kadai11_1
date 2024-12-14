package kadai_11;
import java.util.*;

public class Story_11 {
	public static void main(String []args) {
		Charactor[] c = new Charoctor[2];
		c[0] = new Hero();
		c[1] = new Magician();
		for (Charactor ch : c) {
			ch.startStatus();
		}
	    
	    
	    Monster monster = new Monster();
	    monster.setName("ドラゴン");
	    monster.setHp(100);
	    monster.setAtk(8);
	    monster.setDfn(2);
	    monster.setSpd(4);
		
	    System.out.println("モンスターの" + monster.getName() + "が誕生した！");
	    System.out.println( monster.getName() + "の体力は" + monster.getHp() + "だ");
	    System.out.println( monster.getName() + "の攻撃力は" + monster.getAtk() + "だ");
	    System.out.println( monster.getName() + "の防御力は" + monster.getDfn() + "だ");
	    System.out.println("素早さは" + monster.getSpd() + "だ");
	    
	    startBattle();
	   
	}
	

}
