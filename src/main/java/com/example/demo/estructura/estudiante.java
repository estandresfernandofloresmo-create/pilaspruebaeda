package com.example.demo.estructura;

public class estudiante {
    
        private String nombre;
        private String matricula ; 
        private int edad;
    
        public estudiante(String nombre,String matricula , int edad){
            this.nombre = nombre ;
            this.matricula = matricula;
            this.edad = edad;
        }
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
    
        public String getMatricula() { return matricula; }
        public void setMatricula(String matricula) { this.matricula = matricula; }
    
        public int getEdad() { return edad; }
        public void setEdad(int edad) { this.edad = edad; }
    
}
