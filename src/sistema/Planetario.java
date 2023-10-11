package sistema;

abstract class Planetario extends Galaxia {
	protected int velTrans;
	protected double velRot;
	protected int Posmax;
	protected int Posmin;
	protected String Name;

	JSystem sist = new JSystem();
	protected Planetario() {
		
	}
	
	protected void Transladar(int inst) {

		double cont = velTrans * inst;

		while (cont != 0) {
			if (this.positionX == Posmax && this.positionY > Posmin) {
				while (this.positionY > Posmin && cont != 0) {
					this.positionY--;
					cont--;
				}
			}

			if (this.positionX <= Posmax && this.positionY == Posmin) {
				while (this.positionX > Posmin && cont != 0) {
					this.positionX--;
					cont--;
				}
			}
			if (this.positionX == Posmin && this.positionY < Posmax) {
				while (this.positionY < Posmax && cont != 0) {
					this.positionY++;
					cont--;
				}
			}
			if (this.positionX < Posmax && this.positionY == Posmax) {
				while (this.positionX < Posmax && cont != 0) {
					this.positionX++;
					cont--;
				}

			}
			
			sist.VerificarExplosões();
		}

	}

	protected void Rotacionar(int inst) {
		
		double dias = (velRot * inst)/24;
		
	}

}
