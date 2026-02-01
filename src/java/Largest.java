
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*Create a servlet that compares between two numbers, entered from a page and diplay greater among them, 
when the button from that page is pressed by the user.*/

@WebServlet("/Largest") //Annotation
public class Largest extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<form method='POST' action='/MyWeb2025/Largest'>");
        out.println("Number1: <input type='number' name='num1'/><br><br>");
        out.println("Number2: <input type='number' name='num2'/><br><br>");
        out.println("<input type='submit' value='Largest'/><br><br>");
        out.println("</from>");
    }
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int largest;
            if(n1>n2){
                largest = n1;
            }
            else{
                largest = n2;
            }
            out.println("<h3>Largest is: "+largest+"</h3>");
    }
}

