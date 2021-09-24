package processor;

import cheker.ISpellChecker;
import converter.DocConverter;

import java.util.*;

public class WordProcessor {

    private ISpellChecker spellChecker;

    private Map<String, DocConverter> docConverter = new HashMap<>();

    private String fileName;

    public WordProcessor(String fileName){
        this.fileName=fileName;
    }

    public void addDocConverter(DocConverter converter){
        docConverter.put(converter.getExtension(),converter);
    }
    public void convertDocTo(String ext){
        Set<String> strings = docConverter.keySet();
        if(!strings.contains(ext)){
            System.out.println(ext + "파일 형식을 지원하는 DocConverter가 없습니다.");
        }
        else{
            docConverter.get(ext).save(fileName);
        }
    }

    public void setSpellChecker(ISpellChecker iSpellChecker){
        this.spellChecker=iSpellChecker;
    }

    public void checkSpelling(){
        spellChecker.check();
    }
}
