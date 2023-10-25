package Animal.src;

public class Zoo {
    public static void main(String[] args) {
        Animal perro = new Animal(4,true,"mamifero",23,"rojo"); //UNA VEZ HECHO EL CONSTRUCTOR DE PONEN AQUI LOS VALORES ENTRE()//ahora vamos a package, que representara cada uno de ellos a una clase distinta
		//el package directamente coge las caracteristicas de animal: con el perro. accedes a todas las caracteristicas
		//creamos un nuevo animal:
		Animal tortuga = new Animal(4,false,"ovipero",80,"verde");//aqui ponemos las caracterisdticas.
		
		Animal burro = new Animal(4,true,"mamifero",200,"marron oscuro");
		
		Animal tucan = new Animal(2,false,"ave",1);//aqui vendra a buscar el constructor de 4 parametros, automatico le pondra gris de color
		
		Animal cocodrillo = new Animal(2,false,"reptil",300,"verde");
    

        perro.setColor("blanco");
        System.out.println(perro.getColor());
        cocodrillo.setPelo(true);
        System.out.println(cocodrillo.toString());
        System.out.println(cocodrillo.getPatas());
    }
    
}
