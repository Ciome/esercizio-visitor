import java.util.ArrayList;

public class VisitorB implements RuoloVisitor {

	private Guerriero guerrieroPiuForte;
	private Mago magoPiuForte;
	
	public void trovaPiuForti(ArrayList<RuoloVisitabile> personaggi) {
		personaggi.forEach(p -> visitRuolo(p));
		if (guerrieroPiuForte != null)
			System.out.println("guerriero più forte: " + guerrieroPiuForte.getNome());
		if (magoPiuForte != null)
			System.out.println("mago più forte: " + magoPiuForte.getNome());
	}
	
	@Override
	public void visitRuolo(RuoloVisitabile ruolo) {
		ruolo.acceptVisitor(this);
	}

	@Override
	public void visitGuerriero(Guerriero guerriero) {
		if (guerrieroPiuForte == null)
			guerrieroPiuForte = guerriero;
		else if (guerriero.getLivello() > guerrieroPiuForte.getLivello())
			guerrieroPiuForte = guerriero;
	}

	@Override
	public void visitMago(Mago mago) {
		if (magoPiuForte == null)
			magoPiuForte = mago;
		else if (mago.getLivello()> magoPiuForte.getLivello())
			magoPiuForte = mago;
	}

}
