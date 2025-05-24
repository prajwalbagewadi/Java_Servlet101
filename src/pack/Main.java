package pack;
import java.io.PrintWriter; //for PrintWriter
import jakarta.servlet.http.HttpServlet; //for HttpServlet,
import jakarta.servlet.http.HttpServletRequest; //for HttpServletRequest, 
import jakarta.servlet.http.HttpServletResponse; //for HttpServletResponse
import jakarta.servlet.ServletException; //for ServletException
/*
 * A Servlet is a Java class that runs on a web server 
 * and handles HTTP requests/responses. 
 * It's used to build dynamic web applications.
 * Servlets are part of the Java EE (Jakarta EE) specification 
 * and run in a Servlet container like Apache Tomcat.
 * 
 * add jar file:
 * 1.install apache tomcat
 * 2.click on Project BuildPath
 * 3.go to C:\Program Files\Apache Software Foundation\Tomcat 10.1\lib\servlet-api.jar
 * 4.apply -> import jakarta.servlet.http.*
 * */
/*
 * A Servlet is a Java class that runs on a web server 
 * and handles HTTP requests/responses. 
 * It's used to build dynamic web applications.
 * Jakarta Servlets are part of Jakarta EE 
 * and run in a Servlet container like Tomcat 10+.
 */
//Extend BaseClass
public class Main extends HttpServlet{
	// This method handles GET requests 
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException{
		//HttpServletRequest req	This object contains information from the client (browser), such as form data, headers, parameters, etc.
		//HttpServletResponse res	This object is used to send data back to the client, like HTML, text, or files.	
		
	}
}
/*
* | **Part**                    | **Meaning**                                                                |
* | --------------------------- | -------------------------------------------------------------------------- |
* | `HttpServlet`               | Base class for all HTTP Servlets                                           |
* | `doGet()`                   | Handles **GET** requests (like when a user opens a URL in a browser)       |
* | `doPost()`                  | Handles **POST** requests (like form submissions)                          |
* | `HttpServletRequest`        | Represents the **request** sent by the client (browser)                    |
* | `HttpServletResponse`       | Represents the **response** that the server sends back to the client       |
* | `PrintWriter out`           | Used to **send text or HTML** content to the client's browser              |
* | `response.setContentType()` | Tells the browser what type of content to expect (e.g., `"text/html"`)     |
* | `@WebServlet("/url")`       | Annotation to **map a URL** to a servlet class (used instead of `web.xml`) |
 * 
 */
 