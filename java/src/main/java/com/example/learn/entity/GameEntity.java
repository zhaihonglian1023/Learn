package com.example.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameEntity implements Serializable {
    private String chineseName;
    private String moduleType;
    private int weights;
    private String hyperlinks;
    private String coverImageSmall;
    private String gameType;
    private String gameStatus;
    private int os;
    private String version;
    private Double uvValue;
    private Double ecpm;
    private Long advTimes;
    private Long id;
    private String abbreviation;
    private String coverImageMedium;
    private String coverImageBig;
}
