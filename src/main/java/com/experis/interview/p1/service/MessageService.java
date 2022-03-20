package com.experis.interview.p1.service;

import java.util.List;
import java.util.Optional;

import com.experis.interview.p1.model.Message;
import com.experis.interview.p1.model.User;
import com.experis.interview.p1.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    public Optional<Message> findByIdAndUser(Long id, User user){
        //Replace the line bellow to find and return message by user and id
        return null;
    }

    public List<Message> findAll() {
        //Replace the line bellow to find and return all messages
        return null;
    }

    public Message save(Message message) {
        //Replace the line bellow to save a message and return that saved message
        return null;
    }

    public void deleteById(Long id) {
        //Add your code to delete a message by id


    }

}
