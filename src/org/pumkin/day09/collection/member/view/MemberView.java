package org.pumkin.day09.collection.member.view;

import java.util.List;
import java.util.Scanner;

import org.pumkin.day09.collection.member.model.Member;
import org.pumkin.day09.collection.member.controller.MemberController;

public class MemberView {
	MemberController mController;

	public MemberView() {
		mController = new MemberController();
	}

	public void startProgram() {
		finish: while (true) {
			int choice = this.printMenu();
			switch (choice) {
			case 1:
				this.inputMember();
				break;
			case 2:
				this.modifyMember();
				break;
			case 3:
				this.removeMember();
				break;
			case 4:
				this.printOneMember();
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
//		===== 회원 관리 프로그램 =====
//		1. 회원 정보 등록
//		2. 회원 정보 수정
//		3. 회원 정보 삭제
//		4. 회원 정보 출력(이름)
//		5. 회원 전체 정보 출력
//		6. 프로그램 종료
//		선택 > 1
		Scanner sc = new Scanner(System.in);

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
//		===== 회원 정보 등록 =====
//		아이디 : khuser01
//		비밀번호 : pass01
//		이름 : 일용자
//		이메일 : khuser01@kh.com
//		전화번호 : 01012345678
//		정보를 저장중입니다 ...
//		저장 완료!
		Scanner sc = new Scanner(System.in);
		Member member = new Member();

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

		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);

		mController.addMember(member);
		System.out.println("정보를 저장중입니다 ...\n저장 완료!");
	}

	public void modifyMember() {
//		===== 회원 정보 수정 =====
//		아이디를 입력해주세요 : khuser01
//		수정할 정보를 입력해주세요
//		비밀번호 : pass11
//		이메일 : ilyj@naver.com
//		전화번호 : 01031313131
//		정보를 수정중입니다 ...
//		수정 완료!

//		===== 회원 정보 수정 ====
//		아이디를 입력해주세요 : khuser11
//		회원 정보가 존재하지 않습니다.
		Scanner sc = new Scanner(System.in);
		List<Member> members = mController.findMember();

		System.out.print("===== 회원 정보 수정 =====\n아이디를 입력해주세요 : ");
		String memberId = sc.next();
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getMemberId().equals(memberId)) {
				System.out.print("비밀번호 : ");
				members.get(i).setMemberPw(sc.next());
				System.out.print("이름 : ");
				members.get(i).setMemberName(sc.next());
				System.out.print("이메일 : ");
				members.get(i).setMemberEmail(sc.next());
				System.out.print("전화번호 : ");
				members.get(i).setMemberPhone(sc.next());
				System.out.println("정보를 수정중입니다 ...\n수정 완료!");
			} else {
				System.out.println("회원 정보가 존재하지 않습니다.");
			}
		}
	}

	public void removeMember() {
//		===== 회원 정보 삭제 =====
//		삭제할 회원의 아이디를 입력해주세요 : khuser01
//		정보를 삭제중입니다 ...
//		삭제 완료!

//		===== 회원 정보 삭제 =====
//		삭제할 회원의 아이디를 입력해주세요 : khuser11
//		회원 정보가 존재하지 않습니다.
		Scanner sc = new Scanner(System.in);
		List<Member> members = mController.findMember();

		System.out.print("===== 회원 정보 삭제 =====\n삭제할 회원의 아이디를 입력해주세요 : ");
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getMemberId().equals(sc.next())) {
				mController.deleteMember(members.get(i));
				System.out.println("정보를 삭제중입니다 ...\n삭제 완료!");
			} else {
				System.out.println("회원 정보가 존재하지 않습니다.");
			}
		}
	}

	public void printOneMember() {
//		===== 회원 정보 출력(아이디) =====
//		아이디를 입력해주세요 : khuser01
//		아이디 : khuser01, 이름 : 일용자, 이메일 : ilyj@naver.com, 폰번호 : 01031313131

		Scanner sc = new Scanner(System.in);
		List<Member> members = mController.findMember();

		System.out.print("===== 회원 정보 출력(아이디) =====\n아이디를 입력해주세요 : ");
		String memberId = sc.next();
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getMemberId().equals(memberId)) {
				System.out.println("아이디 : " + members.get(i).getMemberId() 
						+ ", 이름 : " + members.get(i).getMemberName()
						+ ", 이메일 : " + members.get(i).getMemberEmail() 
						+ ", 폰번호 : " + members.get(i).getMemberPhone());
			} else {
				System.out.println("회원 정보가 존재하지 않습니다.");
			}
		}
	}

	public void printAllMembers() {
//		===== 회원 전체 정보 출력 =====
//		아이디 : khuser01, 이름 : 일용자, 이메일 : ilyj@naver.com, 폰번호 : 01031313131
//		아이디 : khuser02, 이름 : 이용자, 이메일 : khuser02@kh.com, 폰번호 : 01031313131
//		아이디 : khuser03, 이름 : 삼용자, 이메일 : khuser03@kh.com, 폰번호 : 01031313131
//		아이디 : khuser04, 이름 : 사용자, 이메일 : khuser04@kh.com, 폰번호 : 01031313131
//		아이디 : khuser05, 이름 : 오용자, 이메일 : khuser05@kh.com, 폰번호 : 01031313131
//		아이디 : khuser06, 이름 : 육용자, 이메일 : khuser06@kh.com, 폰번호 : 01031313131
//		아이디 : khuser07, 이름 : 칠용자, 이메일 : khuser07@kh.com, 폰번호 : 01031313131

		List<Member> members = mController.findAllMember();
		System.out.println("===== 회원 전체 정보 출력 =====");
		for (int i = 0; i < members.size(); i++) {
			System.out.println("아이디 : " + members.get(i).getMemberId() 
					+ ", 이름 : " + members.get(i).getMemberName()
					+ ", 이메일 : " + members.get(i).getMemberEmail() 
					+ ", 폰번호 : " + members.get(i).getMemberPhone());
		}
	}
}
