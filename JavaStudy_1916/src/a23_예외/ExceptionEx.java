package a23_예외;

import java.io.IOException;
import java.nio.channels.IllegalSelectorException;
import java.security.AccessControlException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.w3c.dom.events.EventException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
class Message {
	private String name;
}

public class ExceptionEx {
	
	public void test() throws IOException, IndexOutOfBoundsException {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		
		try {
			ex.test();
		} catch (IndexOutOfBoundsException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			if(1 == 1) {
				throw new NullPointerException("값이 비었어요.");
			}
		}catch (Exception e) {
			System.out.println("빈값 오류 처리");
		}
		
		try {
			if(1 == 1) {
				CustomException customException = new CustomException("오류가 났어요.");
			}
		}catch (Exception e) {
			System.out.println("커스텀 오류 처리");
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Message> messageList = new ArrayList<Message>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i + 1);
			if(i % 2 == 0) {
				messageList.add(new Message("test"));
			}else {
				messageList.add(null);
			}
			
		}
		
		try {
			for(int i = 0; i < 10; i++) {			
				System.out.println(list.get(i));
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println(messageList.get(i).getName());
			}
			
		}catch(IndexOutOfBoundsException boundsException) {
			boundsException.printStackTrace();
		}catch(NullPointerException nullPointerException){
			nullPointerException.printStackTrace();
		}catch(Exception exception){
			exception.printStackTrace();
		}finally {
			System.out.println("문서 저장");
		}
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
