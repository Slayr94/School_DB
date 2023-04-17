package School.DB.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student_DB")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;
    @Column(name="name")
    private String name;

    @Column(name="sex")
    private String sex;

    @Column(name="age")
    private int age;
}
