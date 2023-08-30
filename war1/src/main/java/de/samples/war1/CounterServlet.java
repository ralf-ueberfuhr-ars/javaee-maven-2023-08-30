package de.samples.war1;

import de.samples.jar1.Counter;
import de.samples.jar2.Counter2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:9080/war1/count
@WebServlet("/count")
public class CounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Counter counter = Counter.getInstance();
        long count = counter.count();
        Counter2 counter2 = Counter2.getInstance();
        long count2 = counter2.count();
        // Antwortgenerierung
        resp.setContentType("text/plain");
        try (PrintWriter out = resp.getWriter()) {
            out.print("Counter: ");
            out.println(count);
            out.print("Counter2: ");
            out.println(count2);
        }
    }
}
