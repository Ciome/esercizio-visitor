
public class Guerriero implements RuoloVisitabile {
	
	private String nome;
	private int livello;
	
	Guerriero(String nome, int livello) {
		this.nome = nome;
		this.livello = livello;
	}
	
	@Override
	public void acceptVisitor(RuoloVisitor visitor) {
		visitor.visitGuerriero(this);
	}

	public String getNome() {
		return nome;
	}

	public int getLivello() {
		return livello;
	}

}
