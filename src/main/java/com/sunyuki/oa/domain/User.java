package com.sunyuki.oa.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sunyuki.oa.controller.validation.Validation1;

public class User {
    private Integer id;

    @Size(min=1,max=30,message="{user.name.length.error}",groups={Validation1.class})
    @NotNull(message="{user.name.isNotNull}")
    private String username;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}