/* Vamos a crear un programa que sirva como una pequeña calculadora,
 * no va a funcionar porque faltaria mas codigo pero es lo para ver
 * como funcionan las clases, atributos y metodos.
 * Para crear necesitamos (en este orden):
 * 1- Clase
 * 2- Atributo
 * 3- Metodo
 */


//CLASES
/*Las clases (pueden ser publicas o privadas) siempre tienen atributos y metodos, son la base del programa*/
public class operacion {

//ATRIBUTOS
/* son como las caracteristicas del programa, por ejemplo, las caracteristicas de una calculadora seria que necesita dos numeros
 * como minimo y puede sumar, restar, multiplicar... 
 * Con los atributos tienes lo que necesitas para hacer las operaciones, si quieres que haga una multiplicacion tendrias que crear int multiplicacion, 
 * si quieres division, division, etc... 
 * Hemos creado dos int numeros porque necesitarias los dos numeros para hacer cualquier operacion,
 * si necesitaras mas pues creas mas, y si quieres meterte en que solo pida dos cuando se necesiten dos 
 * y mas cuando sean mas casi que otro dia, esto es solo para ver las cosas
*/
int numero1;
int numero2;
int suma;
int resta;


//METODOS
/* Con los metodos tienes las operaciones que puedes realizar. Parecen atributos pero no lo son, porque se comportan de distinta manera, si, ¿pero como?
 Bueno pues si tu quieres sumar por ejemplo el 5 y el 8 tendrias que crear el atributo 5, el 8, el 9... sin embargo como los metodos tu le pides que meta
 dos numero y a correr, no tienes que andar creando mas que lo minimo para que el usuario pueda ir metiendo sus datos

 Los metodos siempre son con "public (lo que sea) nombre del metodo que le das"
 Pueden ser void (no devuelve nada por defecto, en este caso lo que hace es pedirte que metas numeros), int, float, etc... quedando tal que asi:
 public void ponerNumeros(){}
 public int
 public float
*/

public void ponerNumeros(){ //Creas esto para que primero te pida los numeros, hay que ir por partes
    numero1 = Introduce el numero 1;
    numero2 = Introduce el numero 2;
}

public void sumar (){ //Creas esto para que se cree el metodo suma, y pueda sumar

suma = numero1+numero2;

}

}