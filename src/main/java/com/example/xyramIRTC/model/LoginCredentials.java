package com.example.xyramIRTC.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class LoginCredentials {

    @Id
    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password", nullable = false)
    private String password;

}
