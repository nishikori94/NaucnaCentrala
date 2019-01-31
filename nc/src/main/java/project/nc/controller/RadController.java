package project.nc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import project.nc.model.Porudzbina;
import project.nc.model.Rad;
import project.nc.repository.RadRepository;
import project.nc.service.PorudzbinaService;

@RestController
@RequestMapping("/rad")
@CrossOrigin(origins = "https://localhost:4201")
public class RadController {
	
	@Autowired
	private RadRepository radRep;
	
	@Autowired
	private PorudzbinaService ps;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/getRadoviByCasopisId/{casopisId}")
	@ResponseBody
	public List<Rad> getAllRadovi(@PathVariable("casopisId") Long casopisId){
		return radRep.findAllByCasopisId(casopisId);
	}
	
	@GetMapping("/sacuvajPorudzbinu/{id}")
	public String sacuvajPorudzbinu(@PathVariable("id") Long id) {
		Porudzbina porudzbina = ps.sacuvajPorudzbinuRada(id);
		final String putanja = "https://localhost:9091/porudzbina/sacuvajPorudzbinu";
		String url = restTemplate.postForObject(putanja, porudzbina, String.class);
		return "{\"url\":\""+ url + "\"}";
	}

}
