package models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course", schema = "hogwarts", uniqueConstraints = {
        @UniqueConstraint(name = "teacher_id", columnNames = {"teacher_id"})
})
public class Course {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @ManyToMany
    @JoinTable(name = "enrollment",
            joinColumns = @JoinColumn(name = "course_enrollment"),
            inverseJoinColumns = @JoinColumn(name = "person_enrollment"))
    private Set<Person> people = new LinkedHashSet<>();

}