package School.DB.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Subject {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="subject")
    private String subject;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id", referencedColumnName = "id")
    private Teacher teacher;

}
