package com.example.meeting_9_servlet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import  java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PointOfInterest {
    private String name;
    private String description;
    private List<String> imageUrls = new ArrayList<>();
    private String externalResourceLink;
}