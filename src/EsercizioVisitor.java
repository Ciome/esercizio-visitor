import java.util.ArrayList;

/*
Visitor

Fai un interfaccia RuoloVisitable, e due classi che lo implementano, per esempio Mago e Guerriero, 
puoi dare a loro campi che vuoi, io darei qualcosa come "Nome" e "puntiEsperienza".

Fai un interfaccia RuoloVisitor e due classi che lo implementano, per esempio VisitorA e VisitorB, 
entrambi possono visitare sia Mago che guerriero, ma li visitano in modo differente.

Interfaccia RuoloVisitable deve avere un metodo acceptVisitor(RuoloVisitor rv) e dentro questo metodo un visitor rv puo' chiamare il metodo visit(this).
Il "this" e' riferito all'oggetto RuoloVistable che ha accettato il visitor e passa se stesso al visitor tramite il "this".

crea una lista di con dei maghi e dei guerrieri ed utilizza i visitor che hai creato.

VisitorA potrebbe contare il numero di maghi e guerrieri presenti nella lista;
VisitorB potrebbe trovare il mago con il puntiEsperienza piu' alto e il guerriero con il puntiEsperienza piu' alto.

L'interfaccia RuoloVisitor deve avere un metodo visitor per ogni tipo di RuoloVisitable che puo' visitare,
tipo visit(Mago mago) e visit(Guerriero guerriero);

In pratica devi creare degli "agenti" che entrano dentro gli oggetti RuoloVisitable e fanno cose con tutto cio' che e' contenuto al loro interno.
 */

public class EsercizioVisitor {

	public static void main(String[] args) {
		ArrayList<RuoloVisitabile> personaggi = new ArrayList<RuoloVisitabile>();
		personaggi.add(new Guerriero("g1", 15));
		personaggi.add(new Mago("m1", 12));
		personaggi.add(new Guerriero("g2", 8));
		personaggi.add(new Mago("m2", 20));
		personaggi.add(new Guerriero("g2", 12));

		VisitorA vA = new VisitorA();
		VisitorB vB = new VisitorB();
		vA.contaPersonaggi(personaggi);
		vB.trovaPiuForti(personaggi);

	}

}
