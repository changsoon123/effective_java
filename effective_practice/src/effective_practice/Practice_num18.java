package effective_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice_num18 {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 동안 오류가 발생했습니다: " + e.getMessage());
        }
		
	}

}
