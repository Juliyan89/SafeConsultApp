package dev.four.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.four.dtos.LoginDTO;
import dev.four.entities.Appointment;
import dev.four.entities.Doctor;
import dev.four.entities.Patient;
import dev.four.services.DoctorService;

@Component
@RestController
@CrossOrigin("*")
public class DoctorController {
	
	@Autowired
	DoctorService dserv;
	
	
	@RequestMapping(value = "/doctors/{number}", method = RequestMethod.GET)
	public Doctor getDoctorById(@PathVariable int id) {
		return this.dserv.getDoctorByNumber(id);
	}
	
	
	@RequestMapping(value = "/doctors", method = RequestMethod.GET)
	public List<Doctor> getAllDoctors(){
		return this.dserv.getAllDoctors();
	}
	
	

}
