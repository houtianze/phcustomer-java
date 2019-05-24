package com.houtianze.phcustomer.repository;

import com.houtianze.phcustomer.model.Note;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// @CrossOrigin(origins = {"*"})
@RepositoryRestResource
public interface NoteRepository extends PagingAndSortingRepository<Note, Long> {}