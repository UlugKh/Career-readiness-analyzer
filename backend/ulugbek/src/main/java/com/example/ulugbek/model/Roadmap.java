package com.example.demo.roadmap;

import java.util.List;

public class Roadmap {

    private String role;
    private List<String> required;
    private List<String> important;
    private List<String> bonus;

    // getters & setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public List<String> getImportant() {
        return important;
    }

    public void setImportant(List<String> important) {
        this.important = important;
    }

    public List<String> getBonus() {
        return bonus;
    }

    public void setBonus(List<String> bonus) {
        this.bonus = bonus;
    }
}
