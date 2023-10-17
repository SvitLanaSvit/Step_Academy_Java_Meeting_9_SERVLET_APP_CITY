package com.example.meeting_9_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "hotelsServlet", value = "/hotels")
public class HotelsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PointOfInterest> pointOfInterestList = new ArrayList<>();

        PointOfInterest restaurant = new PointOfInterest();
        restaurant.setName("Böttes Steinofen");
        restaurant.setDescription("Enjoy fine dining at Restaurant Böttes Steinofen with a variety of international cuisines.");
        restaurant.setImageUrls(List.of("https://media-cdn.tripadvisor.com/media/photo-p/17/cd/3c/1d/die-beste-pizza-im-kreis.jpg"));
        restaurant.setExternalResourceLink("https://www.tripadvisor.de/Restaurant_Review-g1371888-d14176821-Reviews-Bottes_Holzsteinofen-Verl_North_Rhine_Westphalia.html");

        PointOfInterest hotel = new PointOfInterest();
        hotel.setName("Charly's House Bielefeld");
        hotel.setDescription("Stay at Hotel Charly's House Bielefeld, a luxury hotel with excellent amenities and service.");
        hotel.setImageUrls(List.of("https://www.hotel.de/de/media/image/08/7e/g0/LEGERE_EXPRESS_Bielefeld-Bielefeld-Aussenansicht-1-865920.jpg",
            "https://foto.hrsstatic.com/fotos/0/3/1200/600/80/FFFFFF/http%3A%2F%2Ffoto-origin.hrsstatic.com%2Ffoto%2F8%2F6%2F5%2F9%2F865920%2F865920_z33_27099576.jpg/aU5L71RkgtQsHJYPkDvAKw%3D%3D/1200%2C923/6/LEGERE_EXPRESS_Bielefeld-Bielefeld-Doppelzimmer_Standard-2-865920.jpg"));
        hotel.setExternalResourceLink("https://www.hotel.de/de/charlys-house-bed---breakfast/hotel-567217/");

        pointOfInterestList.add(restaurant);
        pointOfInterestList.add(hotel);

        request.setAttribute("pointsOfInterest", pointOfInterestList);
        request.getRequestDispatcher("/hotel.jsp").forward(request, response);
    }
}
