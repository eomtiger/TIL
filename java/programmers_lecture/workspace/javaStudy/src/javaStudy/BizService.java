package javaStudy;

public class BizService {
	public void bizMethod(int i) throws BizException{
		System.out.println("비즈니스 메소드 시작");
		
		if(i < 0) {
			throw new BizException("매개변수 i는 0 이상");
		}
	}
}
