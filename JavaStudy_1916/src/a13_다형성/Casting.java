package a13_다형성;

public class Casting {
	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		Animal[] animals = new Animal[10];
		
		animals[0] = human;
		animals[1] = tiger;
		animals[2] = eagle;
		animals[3] = tiger;
		animals[4] = human;
		animals[5] = eagle;
		animals[6] = tiger;
		animals[7] = eagle;
		animals[8] = tiger;
		animals[9] = human;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Human) {
				Human h = (Human)animals[i];
				h.readBook();
			}else if(animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}else if(animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
			}
		}
		
	}
}
