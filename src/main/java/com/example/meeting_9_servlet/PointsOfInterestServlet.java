package com.example.meeting_9_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "pointsOfInterestServlet", value = "/points-of-interest")
public class PointsOfInterestServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PointOfInterest> pointsOfInterestList = new ArrayList<>();

        PointOfInterest poi1 = new PointOfInterest();
        poi1.setName("Kirschblüte in Bielefeld");
        poi1.setDescription("Experience the beautiful cherry blossoms in Bielefeld during spring.");
        poi1.setImageUrls(List.of("https://live.staticflickr.com/65535/47673450711_cf6060d850_b.jpg"));
        poi1.setExternalResourceLink("https://www.nw.de/lokal/bielefeld/mitte/21747706_Unglaublich-schoen-Bielefelds-bekannteste-Allee-ist-wieder-erblueht.html");

        PointOfInterest poi2 = new PointOfInterest();
        poi2.setName("Sparrenberg Castle");
        poi2.setDescription("Explore the historic Sparrenberg Castle in Bielefeld, which offers panoramic views of the city.");
        poi2.setImageUrls(List.of("https://www.nrw-tourismus.de/images/w8h62ed1_xc-/die-sparrenburg-gilt-als-wahrzeichen-von-bielefeld.jpg", "https://www.bielefeld.jetzt/sites/default/files/styles/large/public/bilder/tour/Bielefeld-Sparrenburg-blau.jpg"));
        poi2.setExternalResourceLink("https://www.bielefeld.jetzt/sparrenburg");

        pointsOfInterestList.add(poi1);
        pointsOfInterestList.add(poi2);

        request.setAttribute("pointsOfInterest", pointsOfInterestList);
        request.getRequestDispatcher("/pointOfInterest.jsp").forward(request, response);
    }
}
