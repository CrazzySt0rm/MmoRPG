package newarch.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "enemies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Enemies {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String attackType;
    private int power;
    private int defence;
}
