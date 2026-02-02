import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/Login") //Annotation
public class Login extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Login</title>");
        out.println("<link rel='stylesheet' text='text/css' href='css/style.css'>");
        out.println("</head><body>");
        out.println("<form method='POST' action='/MyWeb2025/Login'>");
        out.println("Username: <input type='text' name='username' required> <br>");
        out.println("Password: <input type='Password' name='password' required> <br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String un = request.getParameter("username");
            String ps = request.getParameter("password");
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
                String sql = "SELECT *FROM login WHERE username=? AND password=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1,un);
                stmt.setString(2,ps);
                ResultSet rs = stmt.executeQuery();
                
                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>Login Result</title>");
                out.println("<link rel='stylesheet' text='text/css' href='css/style.css'>");
                out.println("</head><body>");
                if(rs.next()){
                    out.println("<h2>Login Successful</h2>");
                }else{
                    out.println("<h2>Invalid Username/Password</h2>");
                    out.println("<a href='Login'>Back to login</h2>");
                }
                out.println("</body></hmtl>");
                conn.close();
            }
            catch(Exception e){
                e.printStackTrace();
                out.println("<h2>Database error...</h2>");
            }
    }
}