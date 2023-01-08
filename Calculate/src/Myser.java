

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myser")
public class Myser extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>");
		pw.println("Calculator");
		pw.println("</title>");
		pw.println("<style>.java{}</style>");
		pw.println("</head>");
		pw.println("<body background='img/servlet.jpg'");
		
		

		
		
		
		
		
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String value=request.getParameter("con");
		switch(value){
			case "Addition":
				
				pw.print("<div class=java><center style='margin-top:15pc;background-color:White;width:120px;margin-left:44pc;font-family:Arial;'><b>Result</b><br>"+(num1+num2)+"</center></div>");
				break;
			case "Subtraction":
				pw.print("<div class=java><center style='margin-top:15pc;background-color:White;width:120px;margin-left:44pc;font-family:Arial;'><b>Result</b><br>"+(num1-num2)+"</center></div>");
				break;
			case "Division":
				pw.print("<div class=java><center style='margin-top:15pc;background-color:White;width:120px;margin-left:44pc;font-family:Arial;'><b>Result<b><br></center></div>");
		        pw.print("<div class=java><center style='margin-top:1pc;background-color:White;width:120px;margin-left:44pc;font-family:Arial;'><b>Qutiont</b><br>"+(num1/num2)+"</center></div>");	
				pw.print("<div class=java><center style='margin-top:1pc;background-color:White;width:120px;margin-left:44pc;font-family:Arial;'><b>Reminder</b><br>"+(num1%num2)+"</center></div>");	
				break;
				
			case "Multiplication":
				pw.print("<div class=java><center style='margin-top:15pc;background-color:White;width:120px;margin-left:44pc;font-family:Arial;'><b>Result</b><br>"+(num1*num2)+"</center></div>");	
				break;
			 default:
				 
		            
		           
		}
			
		
	pw.print("<center><br><br><a href=index.html  style='background-color: #4CAF50; border: none; color: white;padding: 15px 32px;text-align: center;text-decoration: none; display: inline-block;font-size: 16px;' >Back To Home</a></center>");
		
	pw.println("</body>");
	pw.println("</html>");
		


	}



}
