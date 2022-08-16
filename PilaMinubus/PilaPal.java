
package PilaA;

public class PilaPal {
    
    private int max = 100;
    private String v[] = new String[max+1];
    private int tope;

    PilaPal() {
        tope = 0;
    }
    PilaPal(int m){
        max = m;
        tope = 0;
    }
    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (tope);
    }
    void adicionar (String elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }
    String eliminar ()
    {
	String elem = "";
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    void mostrar (){
        String elem;
        if (esvacia ())
        System.out.println ("Pila vacia");
        else{
            System.out.println ("\n palabra de la Pila ");
            PilaPal aux = new PilaPal();
            while (!esvacia ()){
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println (elem);
            }
            while (!aux.esvacia ()){
                elem = aux.eliminar();
                adicionar(elem);
            }
        }
    }
    void llenar(int n){
        for(int i = 1; i <= n; i++){
            adicionar(Leer.dato());
        }
    }
    void vaciar(PilaPal a){
        while(!a.esvacia ())
            adicionar (a.eliminar());
    }
    
    
    
}
