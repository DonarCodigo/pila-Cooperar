
public class Estudiante {
	private String nombre, apellido, ci;
	private int semestre, promedio;

	public Estudiante() {
		nombre = "";
		apellido = "";
		ci = "";
		semestre = 0;
		promedio = 0;
	}

	public Estudiante(String nombre, String apellido, String ci, int semestre, int promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.semestre = semestre;
		this.promedio = promedio;
	}

	public void Leer() {

		System.out.println("Int. nombre, apellido, ci, semestre, promedio");
		nombre = Leer.dato();
		apellido = Leer.dato();
		ci = Leer.dato();
		semestre = Leer.datoInt();
		promedio = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", semestre=" + semestre
				+ ", promedio=" + promedio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

}
