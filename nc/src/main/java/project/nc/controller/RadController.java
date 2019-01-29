package project.nc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import project.nc.model.Rad;
import project.nc.repository.RadRepository;

@RestController
@RequestMapping("/rad")
@CrossOrigin(origins = "https://localhost:4201")
public class RadController {
	
	@Autowired
	private RadRepository radRep;
	
	@GetMapping("/getRadoviByCasopisId/{casopisId}")
	@ResponseBody
	public List<Rad> getAllRadovi(@PathVariable("casopisId") Long casopisId){
		return radRep.findAllByCasopisId(casopisId);
	}

}
