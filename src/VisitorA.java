import java.util.ArrayList;

public class VisitorA implements RuoloVisitor {
	
	private int nGuerrieri = 0;
	private int nMaghi = 0;
	
	public void contaPersonaggi(ArrayList<RuoloVisitabile> personaggi) {
		nGuerrieri = 0;
		nMaghi = 0;
		personaggi.forEach(p -> visitRuolo(p));
		System.out.println("guerrieri: " + nGuerrieri);
		System.out.println("maghi: " + nMaghi);
	}
	
	@Override
	public void visitRuolo(RuoloVisitabile ruolo) {
		ruolo.acceptVisitor(this);
	}

	@Override
	public void visitGuerriero(Guerriero guerriero) {
		nGuerrieri++;
	}

	@Override
	public void visitMago(Mago mago) {
		nMaghi++;
	}

}
