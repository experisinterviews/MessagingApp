package com.experis.interview.p1.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="message")
public class Message {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "text", nullable=false)
    private String text;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "message", cascade = CascadeType.ALL)
    @JsonBackReference(value = "me-ti")
    private List<ChangeTimestamp> timestamps;

    public Message(Long id, String text, User user, List<ChangeTimestamp> timestamps) {
        super();
        this.id = id;
        this.text = text;
        this.user = user;
        this.timestamps = timestamps;
    }

    public Message() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ChangeTimestamp> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<ChangeTimestamp> timestamps) {
        this.timestamps = timestamps;
    }


}
