import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class PizzaTestController 
{
	
	@RequestMapping("/getData")
	public ArrayList<Pizza> getData()
	{
		ArrayList<Pizza> pizzasList = new  ArrayList<Pizza>();
		
		pizzasList.add(new Pizza("Backery Special Pizza: $", 90));
		pizzasList.add(new Pizza("Beef Lovers Pizza: $", 45));
		pizzasList.add(new Pizza("Cheez Lovers Pizza: $", 115));
		pizzasList.add(new Pizza("Chicken lovers Pizza: $", 60));
		
		return pizzasList;
	}
}

