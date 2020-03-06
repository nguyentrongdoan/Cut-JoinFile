package IO;

import java.io.*;

public class JoinFile {
    public static boolean joinFile(String source) throws FileNotFoundException, IOException{
        /**
         * cat chuoi tu duong dan lay duoc ten file khi chua cat
         */
        String sourceFile = source.substring(0, source.lastIndexOf('.'));
        File file = new File(sourceFile);
        InputStream is;
        int count = 1;
        /**
         * noi de luu file noi
         */

        OutputStream os = new FileOutputStream(file);
        // Duyet danh sach file dua vao bien count.
        while (true){
            String path = file + "." + count;
            File eachFile = new File(path);
            // sau khi co duoc danh sach file thi chi viec mo luong doc va ghi tat ca cac file doc dc lan luot vao file dich.
            if (eachFile.exists()){
                is = new FileInputStream(eachFile);
                int i = 0;
                byte[] arr = new byte[1024];
                while ((i = is.read(arr)) != -1){
                    os.write(arr, 0, i);
                }
                os.flush();
                is.close();
                count++;
                break;
            }else {
                System.out.println("file ko ton tai");
                break;
            }
        }
        os.close();
        return false;
    }
}
