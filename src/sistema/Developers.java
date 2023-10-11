package sistema;

import java.util.Random;

public class Developers extends Galaxia {

	JSystem sist = new JSystem();
	Random random = new Random();

	Developers(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	Developers(){
		
	}

	public void CriarDevs(int quant) {
		int x;
		int y;
		if (sist.VerificarPosDev() == false) {
			for (int i = 0; i < quant; i++) {
				x = random.nextInt(15 )+1;
				y = random.nextInt(15 )+1;
				
				sist.desenvolvedores.add(new Developers(x, y));
			}
		}

	}
}
