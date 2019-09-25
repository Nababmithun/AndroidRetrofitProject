package com.androidlime.androidretrofittutorial.model;

/**
 * Created by Mithun on 7/31/2019.
 */
public class User {

    private String name;
    private String university;

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param university
     * @param name
     */
    public User(String name, String university) {
        super();
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}
