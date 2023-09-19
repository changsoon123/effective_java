package effective_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice_num17 {

	public static void main(String[] args) {

		
		BufferedReader reader = null;
        try {
            // 어떤 작업을 시도
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // 어떤 예외가 발생할 수 있음
        } catch (IOException e) {
            System.err.println("파일을 읽는 동안 오류가 발생했습니다: " + e.getMessage());
        } finally {
            // 어떤 경우에도 실행되는 마무리 작업
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("파일을 닫는 동안 오류가 발생했습니다: " + e.getMessage());
            }
        }
	}

}
