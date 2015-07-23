package json.app.interview;




import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

	@Autowired
	DAO dao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		
	//	model.addObject("db",dao.findAll());

		return model;

	}
	
	
	@RequestMapping(value="/helloajax",method=RequestMethod.POST)
	public @ResponseBody String helloajax ()
	{
		return "Hello ajax";
	}
	@RequestMapping(value="/listjson2",method=RequestMethod.GET)
	public @ResponseBody List<TabelaTestowa> listJson(HttpServletRequest request)
	{
		String l=String.valueOf(request.getParameter("kolumna"));
		if(l.equals("kolumna4"))
		{
		return dao.ColumnFourRepeat(l);
		}
		
		else
		return dao.ColumnUnique(l);
	}
	
	@RequestMapping(value="/listjson",method=RequestMethod.GET)
	public @ResponseBody List<TabelaTestowa> listJson2(HttpServletRequest request)
	{

		String l=String.valueOf(request.getParameter("kolumna"));
		if(l.equals("kolumna4"))
		{
		return dao.ColumnFourUnique(l);
		}
		
		else
		return dao.ColumnRepeat(l);
	}
	
}
