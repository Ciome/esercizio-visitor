// Forse meglio astratta almeno implemento visitRuolo?
public interface RuoloVisitor {
	public void visitRuolo(RuoloVisitabile ruolo);
	public void visitGuerriero(Guerriero guerriero);
	public void visitMago(Mago mago);
}

