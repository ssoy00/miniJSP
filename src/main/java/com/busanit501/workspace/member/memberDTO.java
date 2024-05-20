package com.busanit501.workspace.member;

import java.time.LocalDate;

public class memberDTO {
  // 인스턴스 멤버.
  private Long memberNo;
  private String memberTitle;
  private LocalDate memberDate;

  public Long getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(Long memberNo) {
    this.memberNo = memberNo;
  }

  public String getMemberTitle() {
    return memberTitle;
  }

  public void setMemberTitle(String memberTitle) {
    this.memberTitle = memberTitle;
  }

  public LocalDate getMemberDate() {
    return memberDate;
  }

  public void setMemberDate(LocalDate memberDate) {
    this.memberDate = memberDate;
  }

  @Override
  public String toString() {
    return "memberDTO{" +
            "memberNo=" + memberNo +
            ", memberTitle='" + memberTitle + '\'' +
            ", memberDate=" + memberDate +
            '}';
  }


}







