package com.experis.interview.p1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "change_timestamp")
public class ChangeTimestamp {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "timestamp", nullable=false)
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "message_id")
    private Message message;

    public ChangeTimestamp(Long id, Date timestamp) {
        super();
        this.id = id;
        this.timestamp = timestamp;
    }

    public ChangeTimestamp(Date timestamp) {
        super();
        this.timestamp = timestamp;
    }

    public ChangeTimestamp() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @JsonIgnore
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}

