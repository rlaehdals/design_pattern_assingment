package display;

import java.io.*;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {

    ArrayList<String> list = new ArrayList<>();
    public LoadHudDisplays(String displayFileName)throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(displayFileName));
        String str;
        while((str=bf.readLine())!=null){
            list.add(str);
        }
    }

    @Override
    public ArrayList<String> load() {
        return list;
    }
}
