package kadai_11;
import java.util.*;

public class Story_11 {
	public static void main(String []args) {
		Hero hero= new Hero();
		hero.setName("ゆうしゃ1");
	    hero.setHp(12);
	    hero.setAtk(8);
	    hero.setDfn(2);
	    
	    System.out.println("勇者" + hero.getName() + "が誕生した！");
	    System.out.println("体力は" + hero.getHp() + "だ");
	    System.out.println("攻撃力は" + hero.getAtk() + "だ");
	    System.out.println("防御力は" + hero.getDfn() + "だ");
	    
	    Magician magician =new Magician();
	    magician.setName("魔法使い1");
	    magician.setHp(10);
	    magician.setAtk(7);
	    magician.setDfn(1);
	    magician.setMp(30);
	    
	    System.out.println("魔法使い" + magician.getName() + "が誕生した！");
	    System.out.println("体力は" + magician.getHp() + "だ");
	    System.out.println("攻撃力は" + magician.getAtk() + "だ");
	    System.out.println("防御力は" + magician.getDfn() + "だ");
	    System.out.println("MPは" + magician.getMp() + "だ");
	    
	    Monster monster = new Monster();
	    monster.setName("ドラゴン");
	    monster.setHp(100);
	    monster.setAtk(8);
	    monster.setDfn(2);
		
	    System.out.println("モンスターの" + monster.getName() + "が誕生した！");
	    System.out.println( monster.getName() + "の体力は" + monster.getHp() + "だ");
	    System.out.println( monster.getName() + "の攻撃力は" + monster.getAtk() + "だ");
	    System.out.println( monster.getName() + "の防御力は" + monster.getDfn() + "だ");
	   
	}

}
