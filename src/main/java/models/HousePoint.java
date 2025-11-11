package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "house_points", schema = "hogwarts", indexes = {
        @Index(name = "giver", columnList = "giver"),
        @Index(name = "receiver", columnList = "receiver")
})
public class HousePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "giver")
    private Person giver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver")
    private Person receiver;

    @Column(name = "points")
    private Integer points;

}