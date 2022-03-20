package com.experis.interview.p1.repository;

import com.experis.interview.p1.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

    //Add your code here to find message by id and user



}

