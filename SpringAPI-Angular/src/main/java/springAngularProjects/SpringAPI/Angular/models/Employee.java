package springAngularProjects.SpringAPI.Angular.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeNumber;

    public Employee() {
    }

    public Employee(Long id, String name, String email, String jobTitle, String phoneNumber, String imageUrl, String employeeNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.employeeNumber = employeeNumber;
    }

}
