class Persona {
    var nombre
    var fechaNacimiento
    
    method getNombre() {
    	return nombre
    }
    
    method getFechaNacimiento() {
    	return fechaNacimiento
    }
    
    method edad() {
        return 2025 - fechaNacimiento
    }

    method menorQue(persona) {
        return self.edad() < persona.edad()
    }
}