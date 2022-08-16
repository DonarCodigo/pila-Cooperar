
package PilaA;


public class PilaM {
    public static void main(String[] args) {
        PilaPal a = new PilaPal();
        a.llenar(3);
        a.mostrar();
         
        
        //1. Verificar si existe la cadena X
        System.out.println("SOL 1");
        System.out.println("Cadena X: ");
        String y = Leer.dato();
        CadenaX(a, y);
        //2. Mostrar las palabras que empiezan en la letra x, donde x es variable
        System.out.println("SOL 2");
        System.out.println("Valor de char X: ");
        char x = Leer.dato().charAt(0);
        Solucion2(a,x);
    }
    public static void CadenaX(PilaPal a, String y){
        PilaPal aux = new PilaPal();
        while(!a.esvacia()){
            String px = a.eliminar();
            if(px.equals(y)){
                System.out.println("Si existe X: ");
                System.out.println(px);
            }
            aux.adicionar(px);
        }
        a.vaciar(aux);
        
    }
    //SOLUCION 2
    public static void Solucion2(PilaPal a,char x){
        PilaPal aux = new PilaPal();
        while(!a.esvacia()){
            String px = a.eliminar();
            if(px.charAt(0)== x){
                System.out.println(px);
            }
            aux.adicionar(px);
        }
        a.vaciar(aux);
        System.out.println("Minibuses de la Pila ");
        System.out.println("<222 abc555 azul 10> ");
        System.out.println("<222 abc555 azul 10> ");
        System.out.println("<222 abc555 azul 10> ");
        System.out.println("<222 abc555 azul 10> ");
        
        
    }
    
}
