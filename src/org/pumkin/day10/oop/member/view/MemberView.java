package org.pumkin.day10.oop.member.view;

import java.util.List;
import java.util.Scanner;

import org.pumkin.day10.oop.member.controller.MemberController;
import org.pumkin.day10.oop.member.model.vo.Member;

public class MemberView {
	MemberController mController;
	
	public MemberView() {
		mController = new MemberController(); // 필수!
	}
	
	public void startProgram() {
		finish :
			while (true) {
			int choice = this.printMenu();
			String memberId = "";
//			1. 등록 -> 5. 출력 -> 4. 검색출력 -> 3. 삭제 -> 2. 수정
			switch (choice) {
			case 1:
				this.inputMember();
				break;
			case 2:
				memberId = this.inputMemberId();
				this.modifyMember(memberId);
				break;
			case 3:
				memberId = this.inputMemberId();
				if (this.printOneMember(memberId) < 0) {
					break;
				}
				try {
					mController.deleteMember(memberId);
					this.displayMessage("정보를 삭제중입니다...");
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				this.displayMessage("삭제 완료!");
				break;
			case 4:
				memberId = this.inputMemberId();
				this.printOneMember(memberId);
				break;
			case 5:
				this.printAllMembers();
				break;
			case 6:
				System.out.println("\n프로그램이 종료되었습니다.");
				break finish;
			default:
				System.out.println("1 ~ 6 사이의 정수를 입력해주세요.\n");
				break;
			}
		}
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("===== 회원 관리 프로그램 =====");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(아이디)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inputMember() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		
//		생성자를 만들 시 사라짐
//		member.setMemberId(memberId);
//		member.setMemberPw(memberPw);
//		member.setMemberName(memberName);
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
		
		Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
		System.out.println("정보를 저장중입니다 ...");
		try {
			mController.addMember(member);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		System.out.println("저장 완료!");
	}

	public void modifyMember(String memberId) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 회원 정보 수정 =====");
		System.out.println("수정할 정보를 입력해주세요");
		System.out.print("비밀번호  : ");
		String memberPw = sc.next();
		System.out.print("이메일  : ");
		String memberEmail = sc.next();
		System.out.print("전화번호  : ");
		String memberPhone = sc.next();
		
		Member member = new Member(memberPw, memberEmail, memberPhone);
		System.out.println("정보를 수정중입니다 ...");
		try {
			mController.modifyMember(memberId, member);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("수정 완료!");
	}
	
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력해주세요 : ");
		String memberId = sc.next();
		return memberId;
	}

	public int printOneMember(String memberId) {
		Scanner sc = new Scanner(System.in);
		System.out.print("===== 회원 정보 출력(아이디) =====");
		Member member = mController.printOneById(memberId);

		 if(member==null) {
	            System.out.println("\n존재하지 않는 정보입니다");
	            return -1;
	        } else {
				System.out.println("\n아이디 : " + member.getMemberId()
						+ ", 이름 : " + member.getMemberName()
						+ ", 이메일 : " + member.getMemberEmail()
						+ ", 폰번호 : " + member.getMemberPhone());
				return 1;
		}
	}
	
	public void printAllMembers() {
		List<Member> members = mController.printAllMembers();
		
		System.out.println("===== 회원 전체 정보 출력 =====");
		for (Member member : members) {
			System.out.println("아이디 : " + member.getMemberId()
					+ ", 이름 : " + member.getMemberName()
					+ ", 이메일 : " + member.getMemberEmail()
					+ ", 폰번호 : " + member.getMemberPhone());
		}
	}
	
	private void displayMessage(String msg) {
		System.out.println(msg);
	}
}