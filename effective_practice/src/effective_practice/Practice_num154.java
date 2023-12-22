package effective_practice;

import java.awt.Component;
import java.awt.Dimension;

public class Practice_num154 extends Component {

	private Dimension size;  // 가변적인 Dimension 인스턴스

    // 생성자 등에서 size를 초기화하는 코드가 있다고 가정

    public Dimension getSize() {
        // 방어적으로 복사하여 새로운 Dimension 인스턴스 반환
        return new Dimension(size);
    }
	
	public static void main(String[] args) {

		
	}

}
