package com.busanit501.workspace.todo.deo;

import com.busanit501.workspace.todo.domain.TodoVO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {

    public List<TodoVO> selectAll() throws  Exception {
        String sql = "select * from tbl_todo";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet resultSet = pstmt.executeQuery();

        List<TodoVO> samples = new ArrayList<TodoVO>();

        while (resultSet.next()) {
                    TodoVO todoVOBuilder = TodoVO.builder()
                    .tno(resultSet.getLong("tno"))
                    .title(resultSet.getString("title"))
                    .dueDate(resultSet.getDate("dueDate").toLocalDate())
                    .finished(resultSet.getBoolean("finished"))
                    .build();
            samples.add(todoVOBuilder);


        }

        return samples;
    }

    // 쓰기 insert
    public void insert(TodoVO vo) throws  Exception {
        String sql = "insert into tbl_todo(title, dueDate, finished) values(?, ?, ?)";

        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getTitle());
        pstmt.setDate(2, Date.valueOf(vo.getDueDate()));
        pstmt.setBoolean(3, vo.isFinished());

        pstmt.executeUpdate();
    }

    // 수정 update
    public  void update(TodoVO vo) throws  Exception {
        String sql = "update tbl_todo set finished = ?, title = ?, dueDate = ? where tno = ?";

        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getTitle());
        pstmt.setDate(2, Date.valueOf(vo.getDueDate()));
        pstmt.setBoolean(3, vo.isFinished());
        pstmt.setLong(4, vo.getTno());

        pstmt.executeUpdate();

    }
    // 삭제 delete

    public void delete(long vo) throws  Exception {
        String sql = "delete from tbl_todo where tno = ?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setLong(1,vo);
        pstmt.executeUpdate();
    }


    public  String getTime2() throws Exception{

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = connection.prepareStatement("select now()");
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        String now = rs.getString(1);
        return now;
    }
    public String getTime() {
//        Connection conn = ConnectionUtil.INSTANCE.getConnection();

        String now = null;

        try (Connection connection = ConnectionUtil.INSTANCE.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("select now()");
             ResultSet rs = pstmt.executeQuery();
        ) {
            rs.next();
            now = rs.getString(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return now;
    }
}
