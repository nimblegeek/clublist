package com.nimblegeek.application.repositories;

import com.nimblegeek.application.entities.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Club, Long> {}
