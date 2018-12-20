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

import project.nc.model.Casopis;
import project.nc.model.Porudzbina;
import project.nc.repository.CasopisRepository;
import project.nc.service.PorudzbinaService;

@RestController
@RequestMapping("/casopis")
@CrossOrigin(origins = "http://localhost:4201")
public class CasopisController {

	@Autowired
	PorudzbinaService ps;
	
	@Autowired
	CasopisRepository casopisRep;

	// sacuvaj porudzbinu za evidenciju, prosledi u KP da i on sacuva i vrati link
	// ka KP frontu
	@GetMapping("/sacuvajPorudzbinu/{id}")
	public String sacuvajPorudzbinu(@PathVariable("id") Long id) {
		Porudzbina porudzbina = ps.sacuvajPorudzbinu(id);
		final String putanja = "http://localhost:9091/placanje/sacuvajPorudzbinu";
		RestTemplate restTemplate = new RestTemplate();
		String url = restTemplate.postForObject(putanja, porudzbina, String.class);
		return "{\"url\":\""+ url + "\"}";
	}
	
	@GetMapping("/getAllCasopisi")
	@ResponseBody
	public List<Casopis> getAllCasopisi(){
		return casopisRep.findAll();
	}

}