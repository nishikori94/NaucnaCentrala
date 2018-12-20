package project.nc.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.nc.model.Casopis;
import project.nc.model.Porudzbina;
import project.nc.repository.CasopisRepository;
import project.nc.repository.PorudzbinaRepository;
import project.nc.service.PorudzbinaService;

@Service
public class PorudzbinaServiceImpl implements PorudzbinaService {

	@Autowired
	CasopisRepository casopisRep;
	
	@Autowired
	PorudzbinaRepository porudzbinaRep;
	
	@Override
	public Porudzbina sacuvajPorudzbinu(Long id) {
		// TODO Auto-generated method stub
		Optional<Casopis> casopisOpt = casopisRep.findById(id);
		Casopis casopis = casopisOpt.get();
		String formattedDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Porudzbina porudzbina = new Porudzbina(casopis.getMerchantId(), casopis.getMerchantPassword(), casopis.getCena(), formattedDate, casopis.getValuta());
		porudzbinaRep.save(porudzbina);
		return porudzbina;
	}

}
