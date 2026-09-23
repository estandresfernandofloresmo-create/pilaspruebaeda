package com.example.demo.estructura;
import org.springframework.stereotype.Service;



@Service 
public class pila {
    private estudiante[] arreglo ;
    private int tope ;
    private int capacidad;

public pila (){
    this.capacidad = 30;
    this.tope = -1 ;
    this.arreglo = new estudiante[capacidad];
    
    agregar(new estudiante("Carlos Perez", "A001", 20));
        agregar(new estudiante("Maria Gomez", "A002", 22));
}

public void agregar(estudiante estudiante){
    if(tope == capacidad -1){
        throw new IllegalStateException("se lleno :v");
    }
    tope ++;
    arreglo[tope] = estudiante;
}

public estudiante quitar(){
    if(tope == -1){
        throw new IllegalStateException("la pila esta vacia xd");
    }
    estudiante elemento = arreglo [tope];
    arreglo[tope] = null;
    tope --;
    return elemento;
}

public int size(){
    return tope + 1;
}

public estudiante[] mostrar(){
    estudiante[] elementosactuales = new estudiante[size()];
    for (int i = 0 ; i <= tope ; i ++ ){
        elementosactuales[i] = arreglo[i];
    }
    return elementosactuales;
}

}

