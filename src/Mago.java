
public class Mago implements RuoloVisitabile {
	
	private String nome;
	private int livello;
	
	public Mago(String nome, int livello) {
		this.nome = nome;
		this.livello = livello;
	}

	@Override
	public void acceptVisitor(RuoloVisitor visitor) {
		visitor.visitMago(this);
	}

	public String getNome() {
		return nome;
	}

	public int getLivello() {
		return livello;
	}
	
	

}
