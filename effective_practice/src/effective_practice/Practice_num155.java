package effective_practice;

public class Practice_num155 {

	private final int width;
    private final int height;

    // 생성자를 통해 초기화
    public Practice_num155(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // getWidth 메서드는 가로 크기 반환
    public int getWidth() {
        return width;
    }

    // getHeight 메서드는 세로 크기 반환
    public int getHeight() {
        return height;
    }
	
	public static void main(String[] args) {

		// 불변적인 Dimension 객체 생성
		Practice_num155 dimension = new Practice_num155(100, 200);

        // getWidth와 getHeight를 통해 크기를 얻어옴
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        // 크기 출력
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
		
	}

}
