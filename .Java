public class Main {
	public static void main (String [] args) {
	
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		String nome,comando;
		System.out.println("Seja bem vindo ao jogo de texto. Por favor insira seu nome:");
		nome = in.nextLine(); 
		System.out.println("Seja muito bem vindo:"+nome);
		System.out.println("Voce deseja avançar pra qual direção?(w,a,s,d)");
		comando = in.nextLine();
		if(comando.equals ("w")) {
			System.out.println("voce vai para frente e acha um inmigo");
			System.out.println("o inmigo é um dragão e ele ataca você");
			System.out.println("o que deseja fazer? a = atacar c = correr");
			comando = in.nextLine();
				if(comando.equals("a")) {
					if(rand.nextInt(100)>75) {
						System.out.println("Voce morreu para o Dragão. GG EZ");
						}
					if(rand.nextInt(100)<75) {
						System.out.println("Você matou a Dragão!!! Parabens, Você Ganhou o jogo");
						}
					}
				else {
					System.out.println("Você fugiu seu covarde. Fim de Jogo");
					}
			}
		else if(comando.equals("s")) {
			System.out.println("Você esta entrando em uma caverna");
		}
	
	}
		} 

