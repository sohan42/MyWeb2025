
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet1") //Annotation
public class Servlet1 extends HttpServlet{
        @Override
        public void init() throws ServletException{
            System.out.println("Servlet is being initialized");
        }
        @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            // Handle GET request
           response.setContentType("text/html");
           response.getWriter().println("<h3>Servlet Example</h3>");
           System.out.println("Handling GET request");
        }
         @Override
        public void destroy(){
            // Cleanup code
            System.out.println("Servlet is being destroyed");
        }
}
