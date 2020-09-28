package dev.four.services;

import java.util.List;

import dev.four.dtos.LoginDTO;
import dev.four.entities.Doctor;
import dev.four.entities.Patient;

public interface DoctorService {
	
	Doctor getDoctorByNumber(int number);
	List<Doctor> getAllDoctors();

}
