package com.example.employee.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "full_names")
    private String fullNames;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;


    @Column(name = "location")
    private String location;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    public Employee(String fullNames, String email, String phoneNumber, String location, String password) {
        this.fullNames = fullNames;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.password = password;
    }

    public Employee(UUID id, String fullNames, String email, String phoneNumber, String location, String password) {
        this.id = id;
        this.fullNames = fullNames;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.password = password;
    }

    public Employee() {

    }

    public Employee(String fullNames, String email, String phoneNumber, String location) {
        this.fullNames = fullNames;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public Employee(UUID id, String fullNames, String email, String phoneNumber, String location) {
        this.id = id;
        this.fullNames = fullNames;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
}
