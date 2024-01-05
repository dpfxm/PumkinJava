package org.pumkin.day09.collection.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.pumkin.day09.collection.member.model.Member;

public class MemberController {
//	Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
//	addMember, updateMember, deleteMember, findMember, findAllMember 
	
	// 저장소
	List<Member> members;
	
	public MemberController() {
		members = new ArrayList<Member>();
	}
	
	// 추가
	public void addMember(Member member) {
		members.add(member);
	}
	// 수정
	public void updateMember(Member member) {

	}
	// 삭제
	public void deleteMember(Member member) {
		members.remove(member);
	}
	// findMember 출력
	public List<Member> findMember() {
		return members;
	}
	// findAllMember 출력
	public List<Member> findAllMember() {
		return members;
	}
	
}
