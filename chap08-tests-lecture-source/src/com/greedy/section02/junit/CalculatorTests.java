package com.greedy.section02.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.greedy.section01.test.Calculator;

/*
 * 단위 테스트
 * 한가지 기능(함수)마다 일을 잘 수행하는 확인하여 특정 모듈이 의도된대로 정확히 작동하는지 검증하는 절차
 * --> 연관된 컴포넌트가 개발되지 않더라도 기능별 개발이 완료된 것을 증명할 수 있다.
 * 
 * Project의 properties - java build path - libraries - add library - junit(junit5)
 */

public class CalculatorTests {
	
	private Calculator calc = null;
	
	/*
	 * @Before : @Test가 작성된 메소드 호출 이전에 반복되는 준비작업을 위한 메소드에 작성
	 *           테스트 메소드를 실행하기 전에 먼저 자동으로 실행
	 * 
	 * @After : @Test가 작성된 메소드 호출 이후에 실행
	 */
	
	
	// 1. Calculator 인스턴스 생성이 잘되는지 테스트
	//@Test
	@Before
	public void setUp() {
		System.out.println("Calculator 인스턴스 생성");
		calc = new Calculator();
		//assertNotNull(calc);
		// assertNotNull(a) : a객체가 null인지 아닌지 확인
	}		
	
	/* 2. sumTwoNumber 메소드가 정상 기능하는지 테스트 */
	/* 2-1. 4와 5를 전달하면 합계가 9가 계산되는지 확인 */
	@Test
	public void testSumTwoNumber_4와_5를_전달하면_합계가_9가_계산되는지_확인() {
		System.out.println("2-1 테스트 동작");
		int result = calc.sumTwoNumber(4, 5);
		
		assertEquals(9, result);
	}
	
	/*2-2. 6과 7을 전달하면 합계가 13이 계산되는지 확인*/
	@Test
	//@Ignore
	public void testSumTwoNumber_6과_7을_전달하면_합계가_13이_계산되는지_확인() {
		System.out.println("2-2 테스트 동작");
		int result = calc.sumTwoNumber(6, 7);
		
		assertEquals(12, result,1); // 3번째 인자는 오차범위이다. (+-1)
	}
	
	/*3. 위 테스트 결과가 '모두 통과하면' 해당 클래스의 메소드는 신뢰성 있는 메소드 확인 */
	@After
	public void afterTest() {
		System.out.println("단위 테스트 완료");
	}
	
}
