/**
 * Clase para dar el ejemplo solicitado en la Practica 6 de ICC
 *
 * @author Eduardo Vargas Pérez
 **/

/*
  2. Dar un ejemplo en Java donde se vea claramente las diferencias entre ambos y descríbelas mediante comentarios en el archivo .java
  3. Dado tu ejemplo anterior, ¿Cómo consigues que en el método con Paso de Parámetros por Valor modifique el valor en el método Main? Genera otro método que lo implemente y utilízalo.
*/
public class Parametros{
    //Atributos que usare mas adelante para mis ejemplos
    private int valor1;
    private int valor2;

    //PASO POR VALOR
    //Primero hare un ejemplo para el paso por valor
    /**
     * Metodo que duplica un numero entero recibido
     * 
     * @param n El numero a duplicar
     **/
    //Como tal se esta recibiendo el valor de una variable del tipo entero
    public static void duplicar(int n){
	n = 2*n;
    }

    //PASO POR REFERENCIA
    //Ahora un ejemplo con paso por referencia, para ello hare dos metodos constructores
    /**
     * Constructor con parametros, recibe dos valores enteros
     *
     * @param v1
     * @param v2 
     **/
    //Este bien podria ser otro ejemplo de paso por valor
    public Parametros(int v1, int v2){
	this.valor1 = v1;
	this.valor2 = v2;
    }

    /**
     * Consructor copia, recibe como parametro un objeto de la 
     * clase Parametros
     *
     * @param p Un objeto de la clase Parametros
     **/
    //Se recibe la referencia en la memoria del objeto
    public Parametros(Parametros p){
	this(p.valor1, p.valor2);
    }

    //METODO PARA EL TERCER PUNTO DEL EJERCICIO
    /**
     * Metodo que duplica el valor de un valor
     * 
     * @param v Un valor entero
     * @return El doble del valor recibido
     **/
    public static int duplicar2(int v){
	return 2*v;
    }

    //Metodo main para usar el metodo anterior
    /**
     * Metodo main para ejecutar lo solicitado
     *
     * @param args Los argumentos
     **/
    public static void main(String[] args){
	System.out.println("Este programa es solo para ejemplificar");
	
	//Declaro variable que usare con un valor de 5
	int x = 5;

	//Al usar el metodo duplicar no cambia el valor, incluso no regresa nada el metodo por lo que si lo trato de imprimir el valor me marcaria error el compilador
	duplicar(x);

	//Al usar el metodo duplicar2 no cambia el valor, pero si regresa un valor entero que podemos imprimir
	System.out.println(duplicar2(x));

	//Podemos hacer lo anterior de otra forma, podemos reasignar el valor de x aplicando el metodo duplicar2
	
	x = duplicar2(x);
	//Ahora imprimimos la referencia a la variable
	System.out.println(x);
	
	
    }
    
}
