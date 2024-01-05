package org.pumkin.day09.collection.member.model;

public class Member {
//	memberId
//	memberPw
//	memberName
//	memberEmail
//	memberPhone
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	
	public Member() {}
	
	public Member(String memberId
			, String memberPw
			, String memberName
			, String memberEmail
			, String memberPhone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}
	
	// memberId의 getter, setter
	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	// memberPw의 getter, setter
	public String getMemberPw() {
		return this.memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	// memberName의 getter, setter
	public String getMemberName() {
		return this.memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// memberEmail의 getter, setter
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	// memberPhone의 getter, setter
	public String getMemberPhone() {
		return this.memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
}
