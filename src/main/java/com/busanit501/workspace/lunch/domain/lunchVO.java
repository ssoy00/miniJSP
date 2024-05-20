package com.busanit501.workspace.lunch.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder

public class lunchVO {
    private Long menuNo;
    private String MenuTitle;
    private LocalDate MenuRegDate;
}
