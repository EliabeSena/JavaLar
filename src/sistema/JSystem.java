package sistema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class JSystem {

	ArrayList<Planetario> planetas = new ArrayList<Planetario>();
	ArrayList<Bugs> bugs = new ArrayList<Bugs>();
	ArrayList<Developers> desenvolvedores = new ArrayList<Developers>();

	Random random = new Random();

	protected void ImprimirPosicao() {

		for (int i = 0; i < planetas.size(); i++) {
			System.out.println("" + planetas.get(i).Name + ": X = " + planetas.get(i).positionX + "   Y = "
					+ planetas.get(i).positionY);

			for (int j = 0; j < bugs.size(); j++) {
				System.out.println("Bug" + " X = " + bugs.get(j).positionX + "   Y = " + bugs.get(j).positionY);
			}
			for (int k = 0; k < desenvolvedores.size(); k++) {
				System.out.println(
						"X = " + desenvolvedores.get(k).positionX + "   Y = " + desenvolvedores.get(k).positionY);

			}
		}
	}

	protected void ImprimirDias() {
		for (int i = 0; i < planetas.size(); i++) {

		System.out.println("Dias passados " + planetas.get(i).velRot);
		}
	}
	
	protected void ImprimirPosicaoBD() {
		for (int j = 0; j < bugs.size(); j++) {
			System.out.println("Bug" + " X = " + bugs.get(j).positionX + "   Y = " + bugs.get(j).positionY);
		}
		for (int k = 0; k < desenvolvedores.size(); k++) {
			System.out
					.println("X = " + desenvolvedores.get(k).positionX + "   Y = " + desenvolvedores.get(k).positionY);

		}
	}

	protected void ImprimirPosIncial() {

		for (int i = 0; i < planetas.size(); i++) {
			System.out.println("" + planetas.get(i).Name + ": X = " + planetas.get(i).positionX + "   Y = "
					+ planetas.get(i).positionY);
		}
	}

	protected void ImprimirVelTrans() {
		for (int i = 0; i < planetas.size(); i++) {
			System.out.println("Vel de translação " + planetas.get(i).Name + ": " + planetas.get(i).velTrans);

		}
	}

	protected boolean VerificarPosBug() {

		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < bugs.size(); j++) {
				if (planetas.get(j).positionX == bugs.get(j).positionX
						&& planetas.get(j).positionY == bugs.get(j).positionY)
					return true;

			}
		}
		return false;
	}

	protected boolean VerificarPosDev() {
		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < desenvolvedores.size(); j++) {
				if (planetas.get(j).positionX == desenvolvedores.get(j).positionX
						&& planetas.get(j).positionX == desenvolvedores.get(j).positionX)
					return true;
			}

		}
		return false;
	}

	protected void VerifColisao() {

		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < bugs.size(); j++) {
				if (planetas.get(j).positionX == bugs.get(j).positionX
						&& planetas.get(j).positionX == bugs.get(j).positionX) {
					planetas.get(i).velTrans--;
					bugs.remove(i);
				}

			}
		}

		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < desenvolvedores.size(); j++) {
				if (planetas.get(j).positionX == desenvolvedores.get(j).positionX
						&& planetas.get(j).positionX == desenvolvedores.get(j).positionX) {
					planetas.get(i).velTrans++;
					desenvolvedores.remove(i);
				}
			}
		}
	}

	protected void ImprimirColisoes() {
		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < bugs.size(); j++) {
				if (planetas.get(j).positionX == bugs.get(j).positionX
						&& planetas.get(j).positionX == bugs.get(j).positionX)
					System.out.println("" + planetas.get(i).Name + "Colidiu com Bug");

			}
		}

		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < desenvolvedores.size(); j++) {
				if (planetas.get(j).positionX == desenvolvedores.get(j).positionX
						&& planetas.get(j).positionX == desenvolvedores.get(j).positionX)
					System.out.println("" + planetas.get(i).Name + "Colidiu com Dev");
			}
		}

	}

	protected void VerificarExplosões() {
		for (int i = 0; i < planetas.size(); i++) {
			if (planetas.get(i).velRot == 0) {
				planetas.remove(i);
			}
		}
	}

	protected void Distancia() {
		for (int i = 1; i < planetas.size(); i++) {
			for (int j = 0; j < planetas.size()-i; j++) {
			int x = planetas.get(j).positionX - planetas.get(j+i).positionX;
			int y = planetas.get(j).positionY - planetas.get(j+i).positionY;
			int Area = Math.abs(x*y);
			System.out.println("Distancia de "+ planetas.get(j).Name+" Para "+planetas.get(j+i).Name +" = "+Area);
		}}
	}
	protected void DistEuclidiana() {
		for (int i = 0; i < planetas.size(); i++) {
			for (int j = 0; j < planetas.size()-i; j++) {
				
				int x = planetas.get(j).positionX - planetas.get(j+i).positionX;
				int y = planetas.get(j).positionY - planetas.get(j+i).positionY;
				double AreaE = Math.sqrt(x*x + y*y);
				System.out.println("Distancia em java² de "+ planetas.get(j).Name+" Para "+planetas.get(j+i).Name +" = "+AreaE);
			
		}}
	}
	
}
