package com.experis.interview.p1.service;

import java.util.List;
import java.util.Optional;

import com.experis.interview.p1.model.ChangeTimestamp;
import com.experis.interview.p1.repository.ChangeTimestampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ChangeTimestampService {

    @Autowired
    ChangeTimestampRepository changeTimestampRepository;

    public Optional<ChangeTimestamp> findById(Long id) {
        return changeTimestampRepository.findById(id);
    }

    public List<ChangeTimestamp> findAll() {
        return changeTimestampRepository.findAll();
    }

    public ChangeTimestamp save(ChangeTimestamp changeTimestamp) {
        return changeTimestampRepository.save(changeTimestamp);
    }

    public void deleteById(Long id) {
        changeTimestampRepository.deleteById(id);
    }

}

