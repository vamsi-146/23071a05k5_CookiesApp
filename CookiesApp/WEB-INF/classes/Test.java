
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Test extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

    
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String sessionId = req.getParameter("sessionId");
        String role = req.getParameter("role");

        // Create 
        Cookie userCookie = new Cookie("username", username);
        Cookie emailCookie = new Cookie("email", email);
        Cookie sessionCookie = new Cookie("sessionId", sessionId);
        Cookie roleCookie = new Cookie("role", role);

        // Add cookies 
        res.addCookie(userCookie);
        res.addCookie(emailCookie);
        res.addCookie(sessionCookie);
        res.addCookie(roleCookie);

        //Display
        
        out.println("<html><head><title>Cookies Table</title></head><body>");
        out.println("<h2>Cookies Created:</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>Cookie Name</th><th>Cookie Value</th></tr>");
        out.println("<tr><td>Username</td><td>" + username + "</td></tr>");
        out.println("<tr><td>Email</td><td>" + email + "</td></tr>");
        out.println("<tr><td>Session ID</td><td>" + sessionId + "</td></tr>");
        out.println("<tr><td>Role</td><td>" + role + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}

