package project.nc.autorizacija;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import project.nc.model.Korisnik;
import project.nc.model.Privilege;
import project.nc.model.Role;
import project.nc.repository.KorisnikRepository;

public class AutorizacijaInterceptor implements HandlerInterceptor{

	@Autowired
	KorisnikRepository korisnikRep;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
		if (k == null)
			return false;
		else {
			Iterator<Role> iterator = k.roles.iterator();

			while (iterator.hasNext()) {
				Iterator<Privilege> it = iterator.next().privileges.iterator();
				while (it.hasNext())
					if (it.next().name.equals(((HandlerMethod)handler).getMethod().getAnnotation(AutorizacijaAnnotation.class).imeMetode()))
						return true;
			}
			return false;
		}
	}
}
