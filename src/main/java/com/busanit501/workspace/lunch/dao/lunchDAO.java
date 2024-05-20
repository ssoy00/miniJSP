package com.busanit501.workspace.lunch.dao;

import com.busanit501.workspace.lunch.domain.lunchVO;
import com.busanit501.workspace.todo.deo.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class lunchDAO {

    private Long menuNo;

    public static List<lunchVO> selectAll() throws Exception {
        String sql = "select * from lunchmenu";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        List<lunchVO> sampless = new ArrayList<lunchVO>();

        while (rs.next()) {
            lunchVO lunchVOBuilder = lunchVO.builder()
                    .menuNo(rs.getLong("menuNo"))
                    .MenuTitle(rs.getString("MenuTitle"))
                    .MenuRegDate(rs.getDate("MenuRegDate").toLocalDate())
                    .build();
            sampless.add(lunchVOBuilder);

        }
        return sampless;
    }

    public static lunchVO selectOne(Long menuNo) throws Exception {
        String sql = "select * from lunchmenu where menuNo = ?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, menuNo);

        @Cleanup ResultSet rs = pstmt.executeQuery();
        rs.next();

        lunchVO LunchVO = lunchVO.builder()
                .menuNo(rs.getLong("menuNo"))
                .MenuTitle(rs.getString("MenuTitle"))
                .MenuRegDate(rs.getDate("MenuRegDate").toLocalDate())
                .build();

        return LunchVO;
    }
    public void insert(lunchVO LunchVO) throws Exception {
        String sql = "insert into lunchmenu (MenuTitle, MenuRegDate) values (?,?);";

        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, LunchVO.getMenuTitle());
        pstmt.setDate(2, Date.valueOf(LunchVO.getMenuRegDate()));

        pstmt.executeUpdate();
    }
    public void update(lunchVO LunchVO) throws Exception {
        String sql = "update lunchmenu set MenuTitle = ?, MenuRegDate = ? where menuNo = ?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, LunchVO.getMenuTitle());
        pstmt.setDate(2, Date.valueOf(LunchVO.getMenuRegDate()));
        pstmt.setLong(3, LunchVO.getMenuNo());
        pstmt.executeUpdate();
    }
    public void delete(long LunchVO) throws Exception {
        String sql = "delete from lunchmenu where menuNo = ?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setLong(1, LunchVO);
        pstmt.executeUpdate();
    }

    }

