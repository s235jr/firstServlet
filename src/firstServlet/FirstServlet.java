package firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = "Formularze";
		String formName = "WYPOŻYCZALNIA SAMOCHODÓW";

		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>\r\n" 
				+ "<html lang=\"en\">\r\n" 
				+ "<head>\r\n" 
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>" + title + "</title>\r\n" + "	<link rel=\"stylesheet\" href=\"css/style.css\">\r\n"
				+ "</head>\r\n" 
				+ "<body>\r\n" 
				+ "<h1><center>" + formName + "</center></h1>\r\n");
		
		out.print("<form action = \"test\" method = \"GET\">\r\n"
				+ 		"Imie: <input type = \"text\" name = \"imie\"><br/><br/>\r\n"
				+		"Nazwisko: <input type = \"text\" name = \"nazwisko\" /><br/><br/>\r\n"
				+ 		"<input type = \"submit\" value = \"Wyslij\" />\r\n" 
				+ "</form><br/>\r\n");
		
		out.print("<form action = \"test\" method = \"POST\">\r\n"
				+ 		"Imie: <input type = \"text\" name = \"imie\"><br/><br/>\r\n"
				+ 		"Nazwisko: <input type = \"text\" name = \"nazwisko\" /><br/><br/>\r\n"
				+ 		"<input type = \"submit\" value = \"Wyslij\" />\r\n" 
				+ "</form><br/>\r\n");
		//RADIO
		out.print("<form action = \"test\" method = \"POST\" target = \"_self\">" 
				+ 		"<fieldset>\r\n"
				+ "			<legend>Wybierz typ</legend>\r\n" + "			<label>\r\n"
				+ "				<input type=\"radio\" name=\"classCar\">\r\n" + "				mini			\r\n"
				+ "			</label>\r\n" + "			<label>\r\n"
				+ "				<input type=\"radio\" name=\"classCar\">\r\n" + "				economy			\r\n"
				+ "			</label>\r\n" + "			<label>\r\n"
				+ "				<input type=\"radio\" name=\"classCar\">\r\n" + "				compact			\r\n"
				+ "			</label>\r\n" + "			<label>\r\n"
				+ "				<input type=\"radio\" name=\"classCar\">\r\n" + "				SUV				\r\n"
				+ "			</label>\r\n" + "			<label>\r\n"
				+ "				<input type=\"radio\" name=\"classCar\">\r\n" + "				VAN			\r\n"
				+ "			</label><br><br>\r\n" 
				+ "			<input type = \"submit\" value = \"Wyslij\" />"
				+ "		</fieldset>\r\n" + "\r\n" 
				+ "</form><br>");
		//CHECKBOX
		out.print("<form action = \"test\" method = \"POST\" target = \"_self\">"
				+ "		<fieldset>\r\n"
				+ "			<legend>Wyposazenie dodatkowe</legend>\r\n" 
				+ "			<label>\r\n"
				+ "				<input type=\"checkbox\" name=\"childseat\">\r\n" 
									+ "child seat	\r\n"
				+ "			</label>\r\n" 
				+ "			<label>\r\n"
				+ "				<input type=\"checkbox\" name=\"GPS\" checked>\r\n" 
									+ "GPS\r\n"
				+ "			</label>\r\n" 
				+ "			<label>s\r\n"
				+ "				<input type=\"checkbox\" name=\"DVDPlayer\">\r\n" 
									+ "DVD Player\r\n"
				+ "			</label><br><br>\r\n" 
				+ "			<input type = \"submit\" value = \"Wyslij\" />"
				+ "		</fieldset>\r\n" + "\r\n" 
				+ "</form><br>");
		
			out.print("<label>Rental start date\r\n" 
				+ "			<input type=\"date\" name=\"date\" placeholder=\"rrrr-mm-dd\">\r\n"
				+ "		</label></p>\r\n" 
				+ "		<p><label>\r\n" 
				+ "			Number of days\r\n"
				+ "			<input type=\"number\" name=\"numberDays\">\r\n" 
				+ "		</label></p>\r\n"
				+ "		<p><label>\r\n" 
				+ "			Your password\r\n"
				+ "			<input type=\"password\" name=\"password\">\r\n" 
				+ "		</label></p>\r\n"
				+ "			<input type=\"submit\" value=\"Order now!\">\r\n"
				+ "	</form><br>\r\n");
			
			out.print(request.getParameter("imie") + " " + request.getParameter("nazwisko"));
		
		out.print("</body></html><br>");
		
		
		System.out.println(request.getParameter("imie"));
		System.out.println(request.getParameter("nazwisko"));	
		System.out.println("childseat: " + request.getParameter("childseat"));
		System.out.println("GPS: " + request.getParameter("GPS"));
		System.out.println("DVDPlayer: " + request.getParameter("DVDPlayer"));
		System.out.println("Typ: " + request.getParameter("classCar"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
