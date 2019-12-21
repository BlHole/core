package com.huaxu.core.middleware.spring.transactional.bean;

public class User {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Integer role;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return role 
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 
     * @param role 
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}