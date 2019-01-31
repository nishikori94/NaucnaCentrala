package project.nc.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.nc.model.Casopis;
import project.nc.model.Porudzbina;
import project.nc.model.Rad;
import project.nc.repository.CasopisRepository;
import project.nc.repository.PorudzbinaRepository;
import project.nc.repository.RadRepository;
import project.nc.service.PorudzbinaService;

@Service
public class PorudzbinaServiceImpl implements PorudzbinaService {

	@Autowired
	private CasopisRepository casopisRep;
	
	@Autowired
	private RadRepository radRep;
	
	@Autowired
	private PorudzbinaRepository porudzbinaRep;
	
	@Override
	public Porudzbina sacuvajPorudzbinu(Long id) {
		Casopis casopis = casopisRep.findById(id).get();
		Date date = new Date();
		Porudzbina porudzbina = new Porudzbina(casopis.getMerchantId(), casopis.getMerchantPassword(), casopis.getCena(), date, casopis.getValuta());
		porudzbinaRep.save(porudzbina);
		return porudzbina;
	}
	
	@Override
	public Porudzbina sacuvajPorudzbinuRada(Long id) {
		Rad rad = radRep.findById(id).get();
		Casopis casopis = rad.getCasopis();
		Date date = new Date();
		Porudzbina porudzbina = new Porudzbina(casopis.getMerchantId(), casopis.getMerchantPassword(), casopis.getCena(), date, casopis.getValuta());
		porudzbinaRep.save(porudzbina);
		return porudzbina;
	}

}
