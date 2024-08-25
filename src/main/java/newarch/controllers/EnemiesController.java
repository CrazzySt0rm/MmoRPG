package newarch.controllers;

import lombok.AllArgsConstructor;
import newarch.dto.EnemiesDTO;
import newarch.models.Enemies;
import newarch.services.EnemiesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class EnemiesController {

    private final EnemiesService enemiesService;

    @PostMapping("/enemies")
    public ResponseEntity createEne(@RequestBody EnemiesDTO enemiesDTO) {
        return new ResponseEntity<>(enemiesService.createEnemies(enemiesDTO), HttpStatus.OK);
    }

    @GetMapping("/enemies")
    public ResponseEntity readAllEne() {
        return new ResponseEntity<>(enemiesService.readAllEnemies(), HttpStatus.OK);
    }

    @PutMapping("/enemies")
    public ResponseEntity updateEne(@RequestBody Enemies enemies) {
        return new ResponseEntity<>(enemiesService.updateEnemies(enemies), HttpStatus.OK);
    }

    @DeleteMapping("/enemies/{id}")
    public HttpStatus deleteEne(@PathVariable(value = "id") Long id) {
        enemiesService.deleteEnemies(id);
        return HttpStatus.OK;
    }
}
