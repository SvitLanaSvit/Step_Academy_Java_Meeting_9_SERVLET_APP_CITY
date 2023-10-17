package com.example.meeting_9_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "infoCityServlet", value = "/info-city-servlet")
public class InfoCityServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        City bielefeld = new City();
        bielefeld.setName("Bielefeld");
        bielefeld.setCountry("Germany");
        bielefeld.setCoatOfArms("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/DEU_Bielefeld_COA.svg/1755px-DEU_Bielefeld_COA.svg.png");
        bielefeld.setNumberOfResidents(341730);
        bielefeld.setDescription("Bielefeld is a city in the north-east of North Rhine-Westphalia, Germany. " +
                "It is known for its historical architecture, parks, and vibrant cultural scene.");

        request.setAttribute("city", bielefeld);

        request.getRequestDispatcher("/cityInfo.jsp").forward(request, response);
    }
}