package sistema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Menu {

	Scanner scanner = new Scanner(System.in);
	JSystem sist = new JSystem();
	Bugs bugs = new Bugs();
	Developers devs = new Developers();
	Relatorio relatorio = new Relatorio();

	Menu() {
		sist.planetas.add(new Phyton());
		sist.planetas.add(new JavaScript());
		sist.planetas.add(new Ruby());
		sist.planetas.add(new PHP());
		sist.planetas.add(new Csharp());
		sist.planetas.add(new Cplus());
		sist.planetas.add(new C());
		
	
		System.out.println("             Bem-vindo ao JavaLar ");
		System.out.println("Para finalizar, digite 'sair' a qualquer momento");
		System.out.println("               Deseja iniciar? ");

		PosInicial();
		CriarBusDevs();
		Transladar();
		Escolha();
		relatorio.Relatorio();
		
		
	}

	private void Escolha() {
		String respostaF = "";
	while(!respostaF.equalsIgnoreCase("sair")) {
		System.out.println("O que deseja fazer agora?");
		System.out.println("Transladar: 1   Verificar Colisões: 2");
		 respostaF = scanner.next();
		int resposta2 = scanner.nextInt();
		if (resposta2 == 1)
			Transladar();
		else if (resposta2 == 2) {
			sist.ImprimirColisoes();
			sist.ImprimirVelTrans();
		}
		}
	}

	private void Transladar() {
		
		System.out.println("insira os instantes para transladar os planetas");
		int inst = scanner.nextInt();
		for (int i = 0; i < sist.planetas.size(); i++) {

			sist.planetas.get(i).Transladar(inst);
			sist.planetas.get(i).Rotacionar(inst);
			sist.VerifColisao();
		}
		sist.ImprimirPosicao();
		sist.ImprimirDias();
		sist.Distancia();
		sist.DistEuclidiana();
	}

	private void CriarBusDevs() {
		System.out.println("Digite o numero de Bugs");
		int Nbugs = scanner.nextInt();
		bugs.CriarBugs(Nbugs);
		System.out.println("Digite o numero de Desenvolvedores");
		int Ndevs = scanner.nextInt();
		devs.CriarDevs(Ndevs);
	}

	private void PosInicial() {

		String resposta;
		String respostaPos;
		resposta = scanner.next();

		if (resposta.equalsIgnoreCase("sim"))
			System.out.println("Deseja ver as posiçoes iniciais?");
		respostaPos = scanner.next();
		if (respostaPos.equalsIgnoreCase("sim")) {
			sist.ImprimirPosIncial();
			sist.ImprimirDias();
			sist.Distancia();
			sist.DistEuclidiana();
		}
	}
}
