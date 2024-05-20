package com.busanit501.workspace.connectTest;

import com.busanit501.workspace.lunch.dao.lunchDAO;
import com.busanit501.workspace.lunch.domain.lunchVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class lunchDAOTest {

    private lunchDAO LunchDAO;

    @BeforeEach

    public  void ready() {
        LunchDAO = new lunchDAO();
    }

    @Test
    public void getSelectAll() throws Exception{
        List<lunchVO> sampless = lunchDAO.selectAll();
        System.out.println("sampless : " + sampless);
        sampless.forEach(vo -> System.out.println("각각 출력해보기 : " + vo));
    }

    @Test
    public void getSelectOne() throws Exception{
        lunchVO LunchVO = lunchDAO.selectOne(5L);
        System.out.println("LunchVO : " + LunchVO);
    }
    @Test
    public void insert() throws Exception{
        lunchVO LunchVO = lunchVO.builder()
                .MenuTitle("새우탕")
                .MenuRegDate(LocalDate.of(2024,5,20))
                .build();

        LunchDAO.insert(LunchVO);
    }

    @Test
    public void update() throws Exception{
        lunchVO LunchVO = lunchVO.builder()
                .menuNo(2L)
                .MenuTitle("설렁탕")
                .MenuRegDate(LocalDate.of(2024,5,20))
                .build();

        LunchDAO.update(LunchVO);
    }
    @Test
    public void delete() throws Exception{
        LunchDAO.delete(1L);
    }

}
