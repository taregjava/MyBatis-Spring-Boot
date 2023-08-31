package com.halfacode.mybatis.model;

public class User {

    private Integer id;
    private String name;
    private String email;
    private int experience;
    private String domain;

    public User() {
    }

    public User(Integer id, String name, String email, int experience, String domain) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.domain = domain;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
