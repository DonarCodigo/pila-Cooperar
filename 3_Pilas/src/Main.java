
public class Main {

	public static void main(String[] args) {
		PilaE A = new PilaE();
		llenarDatos(A);
		A.mostrar();
		// ------------EJERCICIOS---------------------
		// a) MOSTRAR los estudiantes de semestre X.
		System.out.println("\n--------------SOL A-------------------");
		solA(A, 3);
		// b) VERIFICAR si existe el estudiante de nombre X.
		System.out.println("\n--------------SOL B-------------------");
		if (solB(A, "Alejandra"))
			System.out.println("Existe el estudiante de nombre X");
		else
			System.out.println("NO Existe el estudiante de nombre X");
		// c) Mostrar a el (los) mejor(es) estudiantes.
		System.out.println("\n--------------SOL C-------------------");
		solC(A);
		// d) ORDENAR la Pila según el promedio.
		System.out.println("\n--------------SOL D-------------------");
		solD(A);
		A.mostrar();
		// e) ADICIONAR un nuevo estudiante en el TOPE de la Pila.
		System.out.println("\n--------------SOL E-------------------");
		solE(A);
		A.mostrar();
		// f) ELIMINAR los estudiantes del semestre X.
		System.out.println("\n--------------SOL F-------------------");
		solF(A, 3);
		A.mostrar();
		// g) Incrementar el promedio a 100 a todos los estudiantes que tengan un
		// promedio actual de >=95.
		System.out.println("\n--------------SOL F-------------------");
		solG(A);
		A.mostrar();
	}

	private static void solG(PilaE A) {
		PilaE aux = new PilaE();
		Estudiante x;
		while (!A.esvacia()) {
			x = A.eliminar();
			if (x.getPromedio() >= 95)
				x.setPromedio(100);
			aux.adicionar(x);
		}
		A.vaciar(aux);

	}

	private static void solF(PilaE A, int sx) {
		PilaE aux = new PilaE();
		Estudiante x;
		while (!A.esvacia()) {
			x = A.eliminar();
			if (x.getSemestre() != sx)
				aux.adicionar(x);
		}
		A.vaciar(aux);
	}

	private static void solE(PilaE A) {
		Estudiante nuevo = new Estudiante("Max", "Perez", "888889", 10, 78);
		A.adicionar(nuevo);
	}

	private static void solD(PilaE A) {
		PilaE aux = new PilaE();
		PilaE R = new PilaE();
		while (!A.esvacia()) {
			Estudiante may = A.eliminar();
			while (!A.esvacia()) {
				Estudiante y = A.eliminar();
				if (y.getPromedio() < may.getPromedio()) {
					aux.adicionar(may);
					may = y;
				} else
					aux.adicionar(y);
			}
			A.vaciar(aux);
			R.adicionar(may);
		}
		A.vaciar(R);

	}

	private static void solC(PilaE A) {
		int mayNota = obtenerMayNota(A);
		PilaE aux = new PilaE();
		Estudiante x;
		while (!A.esvacia()) {
			x = A.eliminar();
			if (x.getPromedio() == mayNota)
				x.mostrar();
			aux.adicionar(x);
		}
		A.vaciar(aux);

	}

	private static int obtenerMayNota(PilaE A) {
		int may = Integer.MIN_VALUE;
		PilaE aux = new PilaE();
		Estudiante x;
		while (!A.esvacia()) {
			x = A.eliminar();
			if (x.getPromedio() > may)
				may = x.getPromedio();
			aux.adicionar(x);
		}
		A.vaciar(aux);
		return may;
	}

	private static boolean solB(PilaE A, String nx) {
		PilaE aux = new PilaE();
		Estudiante x;
		while (!A.esvacia()) {
			x = A.eliminar();
			if (x.getNombre().equalsIgnoreCase(nx)) {
				A.adicionar(x);
				A.vaciar(aux);
				return true;
			} else
				aux.adicionar(x);
		}
		A.vaciar(aux);
		return false;
	}

	private static void solA(PilaE A, int sx) {
		PilaE aux = new PilaE();
		Estudiante x;
		while (!A.esvacia()) {
			x = A.eliminar();
			if (x.getSemestre() == sx)
				x.mostrar();
			aux.adicionar(x);
		}
		A.vaciar(aux);
	}

	private static void llenarDatos(PilaE A) {
		A.adicionar(new Estudiante("Carlos", "Perez", "123456", 3, 90));
		A.adicionar(new Estudiante("Ana", "Claros", "12487", 6, 76));
		A.adicionar(new Estudiante("Jose", "Apaza", "879471", 9, 96));
		A.adicionar(new Estudiante("Miguel", "Lopez", "125489", 3, 51));
		A.adicionar(new Estudiante("Carlos", "Martinez", "1993456", 7, 60));
		A.adicionar(new Estudiante("Alejandro", "Quisbert", "656548", 9, 75));
		A.adicionar(new Estudiante("Pepito", "Apaza", "879571", 9, 95));
	}

}
