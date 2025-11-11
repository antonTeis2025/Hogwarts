package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @Column( name = "id" ) private int id;

    @Column( name = "first_name" ) private String first_name;
    @Column( name = "last_name" ) private String last_name;
    @Column( name = "house_id" ) private int house_id;

    public Person(int id, String first_name, String last_name, int house_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.house_id = house_id;
    }
}
