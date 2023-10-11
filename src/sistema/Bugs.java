package sistema;

import java.util.Random;

public class Bugs extends Galaxia {
	JSystem sist = new JSystem();
	Random random = new Random();
	
	Bugs(int x, int y){
	this.positionX = x;
	this.positionY= y;
	
	}
	Bugs(){
		
	}

	public void CriarBugs(int quant) {
		int x;
		int y;
		if (sist.VerificarPosBug() == false) {
			for (int i = 0; i < quant; i++) {
				x = random.nextInt(15) + 1;
				y = random.nextInt(15) + 1;
				sist.bugs.add(new Bugs(x, y));
			}
		}

	}

}	


