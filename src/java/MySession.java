
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/MySession") //Annotation
public class MySession extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession(true);
        
        out.print("<B>");
        
        //Display date and time of last access
        Date d = (Date)session.getAttribute("date");
        if(d!=null){
            out.print("Last access: "+d+"<br>");
        }
        
        //Display current date and time
        d = new Date();
        session.setAttribute("date", d);
        out.println("Current date: "+d);
    }
}