package pri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registro
 */
@WebServlet("/registro")
public class registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter salida=response.getWriter();
		salida.println("<html><body>");
		//salida.println("Nombre introducido " + request.getParameter("nombre"));
		//salida.println("<br><br>");
		//salida.println("Apellido introducido " + request.getParameter("apellido"));
		
	
        int nk = Integer.parseInt(request.getParameter("nombrek"));
        int c = 1;
        int p = 2;
        int d = 2;
        
        salida.println("LOS NUMEROS "+ nk + " PRIMOS SON: <br><br>");
        
        while (c <= nk) {
           if (p % d == 0) {
              if (p == d) {
            	  salida.print(p + ", ");
                 c++;
              }
              d = 2;
              p++;
           }
           else
              d++;
        }
		
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
