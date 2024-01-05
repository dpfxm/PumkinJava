package org.pumkin.day10.oop.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.pumkin.day10.oop.member.model.vo.Member;

public class MemberController {
	// 저장소
	List<Member> memberList;

	public MemberController() {
		memberList = new ArrayList<Member>();
	}

	// 회원 정보 등록
	public void addMember(Member member) {
		memberList.add(member);
	}

	// 회원 정보 수정
	public void modifyMember(String memberId, Member updateMember) {
		for (int i = 0; i < memberList.size(); i++) {
//			원래 저장되어있던 데이터
			Member member = memberList.get(i);
//			입력한 id와 같은지 비교하고 만약 같으면
			if (memberId.equals(member.getMemberId())) {
//				입력받은 데이터로 수정
				member.setMemberPw(updateMember.getMemberPw());
				member.setMemberEmail(updateMember.getMemberEmail());
				member.setMemberPhone(updateMember.getMemberPhone());
//				수정된 데이터로 저장
				memberList.set(i, member);
			}
		}
	}

	// 회원 정보 삭제
	public void deleteMember(String memberId) {
		for (int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (memberId.equals(member.getMemberId())) {
				memberList.remove(i);
				break;
			}
		}
	}

	// 회원 정보 출력
	public List<Member> printOneMember() {
		return memberList;
	}

	public Member printOneById(String memberId) {
		for (Member member : memberList) {
			if (memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}

	// 전체 회원 정보 출력
	public List<Member> printAllMembers() {
		// TODO Auto-generated method stub
		return memberList;
	}

}