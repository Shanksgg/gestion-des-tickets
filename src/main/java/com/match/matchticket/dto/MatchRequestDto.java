package com.match.matchticket.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchRequestDto {

    private Date date;
    private String location;
    private String team1;
    private String team2;
}
