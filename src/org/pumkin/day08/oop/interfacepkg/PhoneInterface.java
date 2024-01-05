package org.pumkin.day08.oop.interfacepkg;

public interface PhoneInterface {
//	public String name; The blank final field name may not have been initialized
//	일반 필드 사용불가
//	public void sendCall() {}; The blank final field name may not have been initialized
//	일반 메소드 사용불가

//	인터페이스는 상수형 필드만 가능
	public static final int TIME_OUT = 1113;

//	인터페이스는 추상메소드 필수
	abstract public void printLogo();

//	abstract, public은 생략 가능
	void sendCall();

	public default void showLogo() {
//		디폴트 메소드 ( 기능 추가 )
//		하위 호환성을 위해서 작성함
//		인터페이스의 보완을 위해 사용됨
	}
}
