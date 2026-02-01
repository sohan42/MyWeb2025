
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyForm") //Annotation
public class MyForm extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h1>Student's Form</h1>");
        out.println("<form method='POST' action='/MyWeb2025/MyForm'>");
        out.println("Name: <input type='text' name='name'/><br><br>");
        out.println("Age: <input type='text' name='age'/><br><br>");
        out.println("Address: <input type='text' name='address'/><br><br>");
        out.println("Contact: <input type='number' name='contact'/><br><br>");
        out.println("<input type='submit' name='Submit'/><br><br>");
        out.println("</from>");
    }
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String address = request.getParameter("address");
            String contact = request.getParameter("contact");
            out.println("<h1>Student's Details</h1>");
            out.println("<h3>Name: "+name+"</h3>");
            out.println("<h3>Age: "+age+"</h3>");
            out.println("<h3>Address: "+address+"</h3>");
            out.println("<h3>Contact: "+contact+"</h3>");
    }
}
/*Create a servlet that computes and displays the factorial of an input
number entered from a page when the button from that page is pressed by the user.*/

/*Create a servlet that compares between two numbers
entered from a page and diplay greater among them, 
when the button from that page is pressed by the user.*/
