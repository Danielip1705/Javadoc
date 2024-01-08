package clases;
	/**
	 * Clase donde se realizara distintas operaciones
	 */
public class Operaciones {
	/**
	* Atributo que indica el 1º numero 
	*/
	double num1;
	/**
	 * Atributos que indica el 2º numero
	 */
	double num2;
	/**
	 * Constructor sin parametros
	 */
	public Operaciones() {
		
	}
	/**
	 * Constructor con parametros
	 * @param num1 Numero decimal que se iniciara 1º
	 * @param num2 Numero decimal que se iniciara 2º
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	/**
	 * Funcion donde se realiza la suma de num1 y num2
	 * @return El resultado de la suma de num1 y num2
	 */
	public double suma() {
		return num1+num2;
	}
	/**
	 * Funcion donde se realiza la resta de num1 y num2
	 * @return El resultado de la resta de num1 y num2
	 */
	public double resta() {
		return num1-num2;
	}
	/**
	 * Funcion donde se realiza la multiplicacion de num1 y num2
	 * @return El resultado de la multiplicacion de num1 y num2
	 */
	public double multiplicacion() {
		return num1*num2;
	}
	/**
	 * Funcion donde se realiza la division de num1 y num2
	 * @return El resultado de la division de num1 y num2
	 */
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}
	/**
	 * Funcion donde indica cual es el numero maximo entre num1 y num2
	 * @return El numero maximo entre num1 y num2
	 */
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	/**
	 * Funcion donde indica cual es el numero minimo entre num1 y num2
	 * @return El numero maximo entre num1 y num2
	 */
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
