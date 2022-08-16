import java.util.Iterator;

public class PilaE {
	private int max = 50, tope;
	private Estudiante v[] = new Estudiante[max + 1];

	PilaE() {
		tope = 0;
	}

	public boolean esvacia() {
		return tope == 0 ? true : false;
	}

	public boolean esllena() {
		return tope == max ? true : false;
	}

	public void adicionar(Estudiante elem) {
		if (esllena()) {
			System.out.println("Pila Llena");
		} else {
			tope++;
			v[tope] = elem;
		}
	}

	public Estudiante eliminar() {
		Estudiante elem = new Estudiante();
		if (esvacia()) {
			System.out.println("Pila Vacia");
		} else {
			elem = v[tope];
			tope--;
		}
		return elem;
	}

	public void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Estudiante e = new Estudiante();
			e.Leer();
			adicionar(e);
		}
	}

	public void mostrar() {
		System.out.println("\nDatos de la Pila Estudiantes: ");
		PilaE aux = new PilaE();
		Estudiante x;
		while (!esvacia()) {
			x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	public void vaciar(PilaE Z) {
		while (!Z.esvacia())
			adicionar(Z.eliminar());
	}

}
