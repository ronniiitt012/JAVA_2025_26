import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servimp extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello Simple Hello Code Servlet</h1>");
        out.println("</body></html>");
    }
}
