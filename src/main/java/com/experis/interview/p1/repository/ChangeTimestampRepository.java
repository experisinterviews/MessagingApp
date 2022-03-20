package com.experis.interview.p1.repository;

import com.experis.interview.p1.model.ChangeTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChangeTimestampRepository extends JpaRepository<ChangeTimestamp, Long> {

}