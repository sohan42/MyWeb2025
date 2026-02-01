
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*Create a servlet that computes and displays the factorial of an input
number entered from a page when the button from that page is pressed by the user.*/

@WebServlet("/Factorial") //Annotation
public class Factorial extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<form method='POST' action='/MyWeb2025/Factorial'>");
        out.println("Enter a number: <input type='number' name='number'/><br><br>");
        out.println("<input type='submit' name='Factorial'/><br><br>");
        out.println("</from>");
    }
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String num = request.getParameter("number");
            int n = Integer.parseInt(num);
              for(int i=n-1;i>=1;i--){
                n*=i;
              }
            out.println("<h3>Factorial of "+num+" :"+n+"</h3>");
    }
}
