package com.filtermap.librarydemo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.filtermap.annotations.Filter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @JsonIgnore
    private Integer id;

    @NotNull
    private String title;

    @NotNull
    private Integer published;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "information_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Information information;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
}
