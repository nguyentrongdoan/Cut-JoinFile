package IO;

import java.io.IOException;

public class SplitAndJoinFile {
    public static void main(String[] args) throws IOException {
        Split sp = new Split();
        sp.splitFile("D:\\music\\Tang-Anh-Cho-Co-Ay-Huong-Giang.mp3", "D:\\music\\",6 );
//        JoinFile cs = new JoinFile();
//        JoinFile.joinFile("D:\\music\\Tang-Anh-Cho-Co-Ay-Huong-Giang.mp3.1");
    }
}
