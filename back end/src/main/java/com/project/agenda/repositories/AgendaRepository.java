package com.project.agenda.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.agenda.models.Person;

public interface AgendaRepository extends JpaRepository<Person, UUID>{
	
	Person findPersonByName(String name);
	
}
