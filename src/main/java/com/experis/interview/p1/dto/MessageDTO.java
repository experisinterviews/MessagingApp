package com.experis.interview.p1.dto;

public class MessageDTO {

    private String text;

    public MessageDTO(String text) {
        super();
        this.text = text;
    }

    public MessageDTO() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

