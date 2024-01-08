package clases;
/**
 * Clase donde se realizará las funciones para calcular la esfera
 * @author diglesias
 * @version 1.0
 */
public class Esfera {
	/**
	 * Atributo donde se indicara el radio de la esfera
	 */
	double radio = 1.0;
	/**
	 * Constructor sin parametros
	 */
	public Esfera() {
		super();
	}

	/**
	 * Constructor con parametros
	 * @param radio Numero decimal que indicara el radio de la esfera
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Funcion que calcula la superficie de la esfera 
	 * @return El resultado de la operacion para calcula la superficie
	 */
	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	/**
	 * Funcion que calcula el volumen de la esfera
	 * @return El resultado de la operacion para calcular el volumen
	 */
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
