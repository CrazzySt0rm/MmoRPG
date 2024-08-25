package newarch.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import newarch.dto.EnemiesDTO;
import newarch.models.Enemies;
import newarch.repository.EnemiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EnemiesService {

    private final EnemiesRepository enemiesRepository;

    public Enemies createEnemies(EnemiesDTO enemiesDTO) {
        return enemiesRepository.save(Enemies.builder()
                .name(enemiesDTO.getName())
                .attackType(enemiesDTO.getAttackType())
                .power(enemiesDTO.getPower())
                .defence(enemiesDTO.getDefence())
                .build());
    }

    public List<Enemies> readAllEnemies() {
        return enemiesRepository.findAll();
    }

    public Enemies updateEnemies(Enemies enemies) {
        return enemiesRepository.save(enemies);
    }

    public void deleteEnemies(Long id) {
        enemiesRepository.deleteById(id);
    }
}
