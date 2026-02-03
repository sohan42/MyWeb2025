
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyCookie") //Annotation
public class MyCookie extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h2>Cookies Example</h2>");
        // Create a new cookie
        Cookie c1 = new Cookie("Name", "Raj"); //creating cookie
        c1.setMaxAge(60*60); // Cookie valid for 1 hour
        response.addCookie(c1); //Adds the specified cookie to the response
        
         // Read cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) { //for-each loop to read multiple cookies
            for (Cookie cookie : cookies) {
                out.println("<h3>Cookie Name: " + cookie.getName() +"<h3>");
                out.println("<h3>Cookie Value: " + cookie.getValue() +"<h3>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }
    }
}
