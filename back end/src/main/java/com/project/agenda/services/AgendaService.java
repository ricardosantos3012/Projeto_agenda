package com.project.agenda.services;

import org.springframework.stereotype.Service;

import com.project.agenda.dtos.AgendaRecordDto;
import com.project.agenda.models.Person;
import com.project.agenda.repositories.AgendaRepository;
import jakarta.transaction.Transactional;

@Service
public class AgendaService {
	
	private final AgendaRepository agendaRepository;
	
	public AgendaService(AgendaRepository agendaRepository) {
		this.agendaRepository = agendaRepository;
	}
	
	@Transactional
	public Person savePerson(AgendaRecordDto agendaRecordDto) {
		Person person = new Person();
		
		person.setName(agendaRecordDto.name());
		person.setTelephone(agendaRecordDto.telephone());
		person.setPublicPlace(agendaRecordDto.publicPlace());
		person.setNeighborhood(agendaRecordDto.neighborhood());
		person.setLocality(agendaRecordDto.locality());
		person.setUf(agendaRecordDto.uf());
		person.setZipCode(agendaRecordDto.zipCode());
		
		return agendaRepository.save(person);
	}
	
}
