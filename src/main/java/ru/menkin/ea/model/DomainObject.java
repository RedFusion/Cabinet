package ru.menkin.ea.model;

import javax.persistence.*;
import java.io.*;

@MappedSuperclass
public class DomainObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
