package converter;

public class DocxDocConverter extends DocConverter{
    public DocxDocConverter(String extension) {
        super(extension);
    }

    @Override
    public void save(String fileName) {
        String saveFileName = fileName.concat(".").concat(getExtension());
        System.out.println(saveFileName+"로 변환해서 저장합니다.");
    }
}
