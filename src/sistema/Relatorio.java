package sistema;

public class Relatorio {
	JSystem sist = new JSystem();
	
	protected void Relatorio() {
		sist.VerifColisao();
		for (int i = 0; i < sist.planetas.size(); i++) {
			System.out.println("" + sist.planetas.get(i).Name + ": Vel de rotação " + sist.planetas.get(i).positionX + "   Vel de translação "
					+ sist.planetas.get(i).positionY);
		}
	}

}
