program {
    var persona1 = new Persona(nombre = "Juan", fechaNacimiento = 1990)
    var persona2 = new Persona(nombre = "Ana", fechaNacimiento = 2000)
    var mascota1 = new Mascota(nombre = "Firulais", raza = "Labrador")
    var mascota2 = new Mascota(nombre = "Mishi", raza = "Siames")

    var lista = [persona1, persona2, mascota1, mascota2]

    lista.forEach{objeto => console.println(objeto.getNombre())}
}

/*
	4.
	No es necesario distinguir entre Persona y Mascota para imprimir el nombre, porque ambas clases  implementan el mismo método getNombre().
	Este mecanismo se llama Polimorfismo.
*/

/*
	5.
	En Java, para que tanto mascotas como personas respondan al mensaje getNombre() deberiamos hacer que ambas sean subclase de una superclase en común,
	O utilizar herencia multiple con interfaces en el caso de que alguna de las clases persona o mascota ya sea subclase de una superclase.
*/