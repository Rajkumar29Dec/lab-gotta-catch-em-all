package controller;
import model.*;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlpatterns = { "/pokemon" })
public class pokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public pokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void dopost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getparameter("card1");  //for Bulbasaur
		String value2 = request.getparameter("card2");  //for Charizard
		String value3 = request.getparameter("card3");  //for Dragonite
		String value4 = request.getparameter("card4");  // for Mew
		String value5 = request.getparameter("card5");  //for pikachu

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur bul=new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/poison-type pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter pokémon in the Kanto region.",
					"pOISON","IVYSAUR","64");
			msg = "<center>" + bul.getpokemonName()+ "  #" + bul.getpokemonNumber();
			request.setAttribute("message2",bul.getpokemonNumber());
			request.setAttribute("character1", bul.getCharacteristics());
			request.setAttribute("type1",bul.getType());
			request.setAttribute("evolution1",bul.getEvolution());
			request.setAttribute("baseExp1", bul.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard cha= new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240"); 
			msg = "<center>" + cha.getpokemonName() + "  #" +  cha.getpokemonNumber();
			request.setAttribute("message2", cha.getpokemonNumber());
			request.setAttribute("character2",cha.getCharacteristics());
			request.setAttribute("type2",cha.getType());
			request.setAttribute("evolution2", cha.getEvolution());
			request.setAttribute("baseExp2",cha.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			 Dragonite drag=new  Dragonite(" Dragonite",149,"Dragonite is capable of flying faster than the speed of sound.It is a kindhearted pokémon with human-like intelligence. It shows signs of altruism.", "DRAGON","DRATINI","270"); 
			  msg = "<center>" + drag.getpokemonName() + "  #" +  drag.getpokemonNumber();
				request.setAttribute("message3",drag.getpokemonNumber());
				request.setAttribute("character3", drag.getCharacteristics());
				request.setAttribute("type3",drag.getType());
				request.setAttribute("evolution3",drag.getEvolution());
				request.setAttribute("baseExp3", drag.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew m=new Mew("Mew",151,"Mew is a psychic-type Mythical pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"pSYCHIC","NONE","64");
			msg = "<center>" + m.getpokemonName() + "  #" +  m.getpokemonNumber();
			request.setAttribute("message4",m.getpokemonNumber());
			request.setAttribute("character4",m.getCharacteristics());
			request.setAttribute("type4",m.getType());
			request.setAttribute("evolution4", m.getEvolution());
			request.setAttribute("baseExp4", m.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for pikachu class and use getters to retrieve the values	
/*getter*/
			pikachu pika=new pikachu("pikachu",25,"pikachu is an Electric-type pokémon, which was introduced in Generation I. Over the years, pikachu has become so popular that it serves as the pokémon franchise mascot.",
					"ELECTRIC","RAICHU","112");
			msg = "<center>" + pika.getpokemonName() + "  #" +  pika.getpokemonNumber();
			request.setAttribute("message5",pika.getpokemonNumber());
			request.setAttribute("character5",pika.getCharacteristics());
			request.setAttribute("type5",pika.getType());
			request.setAttribute("evolution5",pika.getEvolution());
			request.setAttribute("baseExp5", pika.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}