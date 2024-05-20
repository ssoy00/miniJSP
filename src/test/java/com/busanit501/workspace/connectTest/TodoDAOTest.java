package com.busanit501.workspace.connectTest;

import com.busanit501.workspace.todo.deo.TodoDAO;
import com.busanit501.workspace.todo.domain.TodoVO;
import lombok.Builder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TodoDAOTest {

    private TodoDAO todoDAO;

    @BeforeEach

    public void ready() {
        todoDAO = new TodoDAO();

    }

    @Test
    public void getTimeTest() throws Exception{
        todoDAO = new TodoDAO();
//        String time = todoDAO.getTime();
        String time = todoDAO.getTime2();
        System.out.println("time: " + time);
    }
    @Test
    public void getSelectAll() throws Exception {
        List<TodoVO> samples = todoDAO.selectAll();

        System.out.println("samples : " + samples);

        samples.forEach(vo ->System.out.println("각각 출력해보기 : " + vo) );
    }

@Test
    public void insert() throws Exception{
        TodoVO vo = TodoVO.builder()
                .tno(2L)
//                .title("오늘 점심 뭐 먹지")
                .dueDate(LocalDate.now())
                .finished(false)
                .build();

    todoDAO.update(vo);
}
@Test
    public void delete() throws Exception{
     todoDAO.delete(1L);
}
}
