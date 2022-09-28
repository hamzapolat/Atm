package com.hamza.atm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity //varlık
@Data
@Table(name="USER_INFO")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ıd otomasyonu için kullanılır
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="USER_NAME", length=50, nullable=false, unique=false)
    private String userName;

    @Column(name="PASSWORD", length=50, nullable=false, unique=false)
    private String password;

    @Column(name="MAIL", length=50, nullable=false, unique=false)
    private String mail;

}
