package com.example.meeting_9_servlet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City {
    private String name;
    private String country;
    private String coatOfArms;
    private int numberOfResidents;
    private String description;
}
