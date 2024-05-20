package com.busanit501.workspace.lunch.dto;

import java.time.LocalDate;

public class lunchDTO {
    private Long menuNo;
    private String MenuTitle;
    private LocalDate MenuRegDate;

    public Long getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(Long menuNo) {
        this.menuNo = menuNo;
    }

    public String getMenuTitle() {
        return MenuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        MenuTitle = menuTitle;
    }

    public LocalDate getMenuRegDate() {
        return MenuRegDate;
    }

    public void setMenuRegDate(LocalDate menuRegDate) {
        MenuRegDate = menuRegDate;
    }

    @Override
    public String toString() {
        return "lunchDTO{" +
                "menuNo=" + menuNo +
                ", MenuTitle='" + MenuTitle + '\'' +
                ", MenuRegDate=" + MenuRegDate +
                '}';
    }
}
