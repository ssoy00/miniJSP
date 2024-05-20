package com.busanit501.workspace.menu;

import java.time.LocalDate;

public class MenuDTO {
    private Long MenuNo;
    private String MenuTitle;
    private LocalDate dueDate;

    public Long getMenuNo() {
        return MenuNo;
    }

    public void setMenuNo(Long menuNo) {
        MenuNo = menuNo;
    }

    public String getMenuTitle() {
        return MenuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        MenuTitle = menuTitle;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "MenuNo=" + MenuNo +
                ", MenuTitle='" + MenuTitle + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
