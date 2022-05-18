package com.example.scoresheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.scoresheet.model.ScoreSheet;

@Repository
public interface ScoreSheetRepository extends JpaRepository<ScoreSheet, Long> {


}