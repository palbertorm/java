package Animal.src;

public class Animal { //esto es una plantilla, cada cosa que crees de esta plantilla tendra estos atributos
	/*
	 * primera etapa, definir lo que hemos puesto en zoo, que son los atributos.
	 * atributos
	 */
	
	//atributos://DESPUES DE PONER EL CONSTRUCTOR DSE QUITAN LOS DATOS//se pone private pq son atributos solo de animal en este caso, pq lo queremos
	
	//el private es como un policia de frontera, permiten q puedas lñeer o modificar el dato..
	
	//getter i setter se pone entre constructor i metodos gnerales
	private int patas; //= 0; 
	private boolean pelo; //= false;
	private String tipo; //= "";
	private double peso; //= 0d;//esto es plantilla NUNCA SE AÑADE AQUI LA CAPACIDAD!
	private String color; //= "";
	private boolean cazando; //= false; //aqui decidimos que no esta cazandpo, en cuando lo llamamos estara cazando, i si lo volvemos a llamar deja de cazar etc
	
	//metodo constructor, se llama como la clase!!
	//los consstructores seimpre han de ser publicos, y nunca deben devolver nada, ni metodos de entrada ni de salida
	//se encarga de poblar con datos que va a tener inicialmente. INICIALIZA LOS DATOS
	
	//copiamos el constructor, el d menos parametros arriba, es para poder eliminar un elemento para algun animal
	public Animal(int patas,boolean pelo,String tipo,double peso) { //eliminamos el ultimo parametro, ya que si le paso 4 elementos vendra a buscar aqui
		this.patas = patas;
		this.pelo = pelo;
		this.tipo = tipo;
		this.peso = peso;
		this.color = "gris";//se lo pongo directo, pq java no permite eludir un parametro
		
		this.cazando = false;
	}
	
	public Animal(int patas,boolean pelo,String tipo,double peso,String color) {//si pasan 5 elementos buscara aqui
		this.patas = patas;
		this.pelo = pelo;
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
		
		this.cazando = false;
	}
	
	//getter, lo q hace es recuperar datos, no reciben, pero tienen return
	public int getPatas() {
		return this.patas;
	}
	
	public boolean getPelo() {
		return this.pelo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public String getColor() {
		return this.color;
	}
	
	//setters, reciben algo pero no devuelven
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	//metodos generales
	public String caminar() {
		return "Estoy andando";
	}
	public String comer() {
		return"Estoy comiendo";
	}
	public String cazar() {
		String respuesta = (this.cazando) ?"Dejo de cazar" : "Voy a empezar a cazar" ;
		this.cazando = (this.cazando) ? false : true ;//si esta cazando, quiero q deje de cazar y viceversa. i lo almacenamos en this.cazando(q es el atributo) efecto interruptor.
		return respuesta; //cuando la guardamos retorna la variable "Estoy cazando";//aqui utiliz<aremos el metodo switching, es como un ionmterruptor, cuando lo llame la 1a vez dira q estoy cazando, la segunda vez q no, q esta comiendo o durmienof
	}
	
	//metodos propios
	public String toString() { //sobrescribir el metodo propio como el tostring.,SIN STATIC!! STATIC SOLO EN EL MAIN
		
		String respuesta = (this.pelo)? "Si" : "No"; 
		return "Soy un animal que tengo " + this.patas + " patas, soy de la familia de los " + this.tipo +
				" con un color " + this.color + " y un peso " + this.peso + ". " + respuesta + " Tengo pelo"; //aqui modificamos lo q devuelve, en vesz del identificador de memoria
		
		/*+
		 * hacer una estructura para el toString que permita obtener que cuando detecte que tengais 
		 * pelo sea fals lo traduzca en no, i cuando this pelo sea true lo traduzca con la palabra si
		 * con un if
		 */
	}
}