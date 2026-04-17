package herencia.AnimalyPerro;
/*
Se creó la clase Animal con el método hacerSonido().

La clase Perro hereda de Animal y sobrescribe el método
hacerSonido() utilizando @Override.

Esto permite que el método tenga un comportamiento diferente
según la clase que lo implemente.

Se demuestra el uso de polimorfismo.
*/
public class Animal {

	    public void hacerSonido() {
	        System.out.println("El animal hace un sonido");
	    }
	}

