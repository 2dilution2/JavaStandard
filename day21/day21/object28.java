package day21
	// 내부클래스의 제어자와 접근성 예제3
class outer {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int Iiv = outerIv;	// 외부클래스의 private멤버도 접근이 가능하다.
		int Iiv2 = outerCv;
	}

	static class StaticInner {
	// 스태틱클래스는 외부클래스의 인스턴스멤버에 접근할 수없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final intLv = 0;	// JDK1.8 부터 final생략 가능
		
		class LocalInner {
			int liv = outerIlv;
			int liv2 = outerCv;
// 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근이 가능하다.
//			int liv3 = outerlv;		에러  JDK1.8 부터 에러 아님
			int liv4 = outerLv;
		}
	}
}