package com.example.demo.estructura;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pila")
public class pilacontrolador {

    private final pila pilaService;

    public pilacontrolador(pila pilaService) {
        this.pilaService = pilaService;
    }

    @PostMapping("/agregar")
    public ResponseEntity<String> agregar(@RequestBody estudiante est) {
        pilaService.agregar(est);
        return ResponseEntity.ok("estudiante agrregad");
    }

    @DeleteMapping("/quitar")
    public ResponseEntity<?> quitar() {
        try {
            return ResponseEntity.ok(pilaService.quitar());
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/mostrar")
    public ResponseEntity<estudiante[]> mostrar() {
        return ResponseEntity.ok(pilaService.mostrar());
    }

    @GetMapping("/size")
    public ResponseEntity<Integer> size() {
        return ResponseEntity.ok(pilaService.size());
    }
}