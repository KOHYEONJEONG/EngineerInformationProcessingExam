import java.util.Optional;

class MyVO {
    private String data;

    public MyVO(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class Example {
    public Optional<MyVO> findMyVO() {
        // 어떤 로직을 통해 MyVO를 찾거나 생성하는 코드
        // 예제에서는 간단하게 빈 값을 반환합니다.
        return Optional.empty();
    }

    public static void main(String[] args) {
        Example example = new Example();
        Optional<MyVO> optionalMyVO = example.findMyVO();

        // Optional에서 MyVO를 가져오고 데이터를 출력합니다.
        optionalMyVO.ifPresent(myVO -> System.out.println("Data: " + myVO.getData()));

        // 만약 MyVO가 존재하지 않으면 대체값을 제공할 수 있습니다.
        MyVO defaultValue = new MyVO("Default Data");
        MyVO myVO = optionalMyVO.orElse(defaultValue);

        System.out.println("Data: " + myVO.getData());
    }
}
