package model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(name = "category", length = 20, nullable = false)
    private String category;


}
