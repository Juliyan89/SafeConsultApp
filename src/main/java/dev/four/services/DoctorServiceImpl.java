package dev.four.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.four.dtos.LoginDTO;
import dev.four.entities.Appointment;
import dev.four.entities.Doctor;
import dev.four.entities.Patient;
import dev.four.repositories.DoctorRepository;

@Component
@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorRepository drepo;


	@Override
	public Doctor getDoctorByNumber(int number) {
		return drepo.findById(number).get();
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return (List<Doctor>) drepo.findAll();
	}




}
