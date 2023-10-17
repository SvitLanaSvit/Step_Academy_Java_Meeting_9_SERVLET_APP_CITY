package com.example.meeting_9_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "historyCityServlet", value="/history-city")
public class HistoryCityServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String history = "Bielefeld, located in the North Rhine-Westphalia region of Germany, has a history that dates back to the 9th century. " +
                "It was a center for linen and textile production during the Middle Ages and gained significance as a trading hub.\n\n" +
                "The city boasts a rich architectural heritage with well-preserved medieval buildings, including Sparrenburg Castle, " +
                "a fortress that offers panoramic views of the city. Bielefeld also played a crucial role in the Protestant Reformation.\n\n" +
                "In the 19th century, Bielefeld's industrial sector thrived, particularly in the textile industry. " +
                "It became known as the 'City of Linen' due to its linen production. Today, Bielefeld is recognized for its " +
                "contributions to the printing and publishing industry, as well as its vibrant cultural scene and beautiful parks.";

        String image1URL = "https://www.nrw-tourismus.de/images/eeoez_o0b_8-/altstadt-bielefeld.jpg";
        String image2URL = "https://www.milserkrug.de/sites/default/files/galerie/stadtansicht_johannisberg.jpg";

        String link1URL = "https://en.wikipedia.org/wiki/Bielefeld";
        String link2URL = "https://www.bielefeld.de/en/";

        request.setAttribute("history", history);
        request.setAttribute("image1URL", image1URL);
        request.setAttribute("image2URL", image2URL);
        request.setAttribute("link1URL", link1URL);
        request.setAttribute("link2URL", link2URL);

        request.getRequestDispatcher("/cityHistory.jsp").forward(request, response);
    }
}
