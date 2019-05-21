package com.houtianze.phcustomer.repository;

import com.houtianze.phcustomer.model.Note;

import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {}