
public class Treino {
	public String treinoA;
	public String treinoB;
	public String treinoC;
	
	public Treino(String treino){

	}
	public Treino(){
		
	}
	
	public Treino(String treinoA, String treinoB, String treinoC) {
		this.treinoA = treinoA;
		this.treinoB = treinoB;
		this.treinoC = treinoC;
	}

	public String getTreinoA() {
		return treinoA;
	}

	public String getTreinoB() {
		return treinoB;
	}

	public String getTreinoC() {
		return treinoC;
	}

	public void setTreinoA(String treinoA) {
		this.treinoA = treinoA;
	}

	public void setTreinoB(String treinoB) {
		this.treinoB = treinoB;
	}

	public void setTreinoC(String treinoC) {
		this.treinoC = treinoC;
	}
	public void treinoPOB(){
		Treino treinoPOB = new Treino();
		treinoPOB.setTreinoA("Supito Reto 3 - 8/10, Supino inclinado 3 - 10/12, Fly 3 - 10/12, Crucifixo 3 - 10/12, Triceps corda 3 - 10/12, Triceps testa 3 - 10/12");
		System.out.println(treinoPOB.getTreinoA());
	}

	public void treinoPerna(){
		Treino treinoPerna = new Treino();
		treinoPerna.setTreinoB("Agachamento 3 - 8/10, Leg 45° 3 - 8/10, Extensora 3 - 8/10, Flexora 3 - 8/10, Terra 3 - 8/10");
		System.out.println(treinoPerna.getTreinoB());
	}

	public void treinoCB(){
		Treino treinoCB = new Treino();
		treinoCB.setTreinoC("Puxada pronada 3 - 8/10, Puxada supinada 3 - 8/10, Pull-down 3 - 8/10, Rosca direta 3 - 8/10, Rosca alternada 3 - 8/10");
		System.out.println(treinoCB.getTreinoC());
	}

	public static void Treininheos() {
		Treino treino = new Treino("Supito Reto 3 - 8/10, Supino inclinado 3 - 10/12, Fly 3 - 10/12, Crucifixo 3 - 10/12, Triceps corda 3 - 10/12, Triceps testa 3 - 10/12" , "Agachamento 3 - 8/10, Leg 45° 3 - 8/10, Extensora 3 - 8/10, Flexora 3 - 8/10, Terra 3 - 8/10", "Puxada pronada 3 - 8/10, Puxada supinada 3 - 8/10, Pull-down 3 - 8/10, Rosca direta 3 - 8/10, Rosca alternada 3 - 8/10");
		System.out.println(treino.getTreinoA());
		System.out.println(treino.getTreinoB());
		System.out.println(treino.getTreinoC());
		
	}
}