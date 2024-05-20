package com.busanit501.workspace.member;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum memberService {
    INSTANCE;

    public List<memberDTO> getList() {
        List<memberDTO> listSamp = IntStream.range(0,10).mapToObj(i -> {
            memberDTO dto = new memberDTO();
            dto.setMemberNo((long)i);
            dto.setMemberTitle("Sample Menu Title " + i);
            dto.setMemberDate(LocalDate.now());
            return dto;
        }).collect(Collectors.toList());
        return listSamp;
    }

}
