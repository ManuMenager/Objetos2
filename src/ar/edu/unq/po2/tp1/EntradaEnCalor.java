package ar.edu.unq.po2.tp1;

public record EntradaEnCalor() {
	/*
	- Ejercicio 1 (Evaluación de protocolos de una clase).

	Smalltalk -> Opción 2
	Wollok -> Opción 2
	
	Considero que tanto para Smalltalk como para Wollok la opción 2 es más adecuada, 
	debido a que se usan constructores, lo que permite mantener el encapsulamiento de una mejor manera 
	y asi evitar que se pueda acceder y modificar atributos de forma libre.
	
	
	-- Ejercicio 2 (Delegación).
	
	Smalltalk -> Opción 2.
	Wollok -> Opción 2.
	
	Considero que tanto para Smalltalk como para Wollok la opción 2 es más adecuada, 
	porque delega de una forma mejor la tarea de buscarEnFichero al secretario y no accede directamente el jefe.
	
	
	-- Ejercicio 3 (Polimorfismo).
	
	 - Opciones 1: Se utiliza una variable "rojo" que es poco descriptiva de lo que representa, además de que el valor de la variable "rojo" es un INT por lo que puede generar mucha confusión, además de un metodo "rojoPermitido()" que tampoco se puede intuir muy bien que es lo que hace y tambien no queda definido en ningún lado la clase CuentaCorriente, quizas deberia ser una subclase de CuentaBancaria y deberia entender el metodo extraer(unMonto) y que en dicha subclase se defina que se hace en ese caso sin la necesidad de andar corroborando de que clase es.
	
	 - Opción 2: Al igual que en la anterior opción se utiliza "rojo" y "rojoPermitido()" los cuales son confusos. También se corrobora de una manera un poco más escondida e incorrecta el tipo de la CuentaBancaria, en este caso no se lo define como una clase sino como un tipo, pero lo correcto seria que se haga la subclase CuentaCorriente y que dicha clase entienda el metodo extraer(unMonto).
	
	 - Opción 3:
	
	 Es una mejor opción que las anteriores pero se podria mejorar y evitar código repetido, definiendo en el metodo de la Cuenta Bancaria lo que ambas subclases hacen y solamente definiendo en las subclases la condición del if.
	
	 class CuentaBancaria {
	    method extraer(unMonto) {
	        if (self.condicionParaExtraer(unMonto)){
	            self.setSaldo(self.getSaldo() - unMonto)
	        }
	    }
	    
	    method condicionParaExtraer(unMonto)
	 }
	
	 class CajaDeAhorro inherits CuentaBancaria {
	    override method condicionParaExtraer(unMonto) {
	        return self.getSaldo() >= unMonto
	    }
	 }
	
	 class CuentaCorriente inherits CuentaBancaria {
	    override method condicionParaExtraer(unMonto) {
	        return (self.getSaldo() + self.rojoPermitido()) >= unMonto
	    }
	 }
	    
	 - Opción 4:
	
	En mi opinión el metodo "rojoPermitido()" es confuso pero la herencia y los metodos generan un polimorfismo correcto.
	
	
	==========================================================================================================
	
	-- Actividad de lectura 1.
	
	1. ¿Qué significa el acceso directo a las variables? De un ejemplo.
	    Significa leer o modificar directamente la variable de instancia dentro de los métodos, sin pasar por getters ni setters.
	
	    Class Person {
	        String name = "Pablo";
	
	        public void sayHello() {
	            System.out.println("Hola me llamo" + name); // Acceso Directo
	        }
	    }
	
	2. ¿Qué significa el acceso indirecto a las variables? De un ejemplo.
	    Significa leer o modificar a partir de un getter o un setter las variables de instancia dentro de los métodos.
	
	    Class Person {
	        String name = "Pablo";
	
	        public void sayHello() {
	            System.out.println("Hola me llamo" + name()); // Acceso Indirecto
	        }
	
	        public String name() {
	            return name;
	        }
	    }
	
	3. Qué ventajas y desventajas presenta cada estrategia referida a los getters y setters.
	
	- Acceso Directo
	    Ventajas:
	        + Más legible y simple.
	        + No hay sobrecarga con métodos innecesarios.
	    Desventajas:
	        - Menos flexible: para cambiar la lógica de acceso tenes que reescribir código en muchos lugares.
	        - Dificulta la extensión o modificación en subclases.
	
	- Acceso Indirecto (getters/setters).
	    Ventajas:
	        + Mayor flexibilidad: permite validaciones, encapsulamiento, etc.
	        + Facilita la herencia y el polimorfismo
	    Desventajas:
	        - Hace el código más verboso y menos fluido para leer.
	        - Aumenta la cantidad de métodos de la clase.
	
	
	-- Actividad de lectura 2.
	
	1. ¿En qué situación es conveniente utilizar el "CreationParameter Method"?
	
	Es conveniente usar el Creation Parameter Method (Constructor) cuando necesitamos inicializar todas las variables de instancia de un objeto en el momento de su creación, en lugar de ir configurándolas con múltiples setters. Así podemos asegurarnos de que:
	    - El objeto se cree en un estado válido.
	    - Se simplifica la construcción, evitando que haya estados intermedios incompletos.
	    - Se mejora la legibilidad y la comprensión del código (queda claro cuáles son los valores iniciales).
	
	
	-- Actividad de lectura 3.
	
	1. ¿Cómo se debe proporcionar acceso a variables que referencian a una colección?
	
	La forma en la que debemos dar acceso a variables que referencian a una colección es creando métodos específicos que permitan agregar, quitar o consultar elementos. Tambien se puede usar un método de enumeración (employeesDo en el ejemplo) para recorrer la colección de manera segura.
	
	
	-- Actividad de lectura 4.
	
	1. ¿Por qué son necesarios dos métodos para asignar el estado a una propiedad booleana?
	
	Porque tenes un único método con un párametro de tipo booleano expone detalles de implementación y quizas tampoco comunica bien la intención.
	En cambio utilizar dos métodos separados es más claro ya que expresa explícitamente el cambio de estado.
	
	        Mal                       Bien
	switch.on(aBoolean) | switch.on() and switch.off()
	 */
}