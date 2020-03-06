package IO;

import java.io.*;

public class Split {
    public boolean splitFile(String source, String dest, int numberFile) throws FileNotFoundException, IOException{
        /**
         * xac dinh duong dan file
         */
        File sourceFile = new File(source);
        /**
         *  kiem tra file co ton tai ko
         */
        if (sourceFile.exists() && sourceFile.isFile()) {
            //lay size file nguon va size file cat dc
            long sizeFile = sourceFile.length();
            long sizeSplitFile = (sizeFile / numberFile);
            /**
             * mo luong doc file ghi file, neu file bang size file cat da dc tinh o tren thi dung vaf cat tiep file.
             */
            InputStream is = new FileInputStream(sourceFile);
            byte[] arr = new byte[1000];
            for (int i = 1; i <= numberFile; i++) {
                int j = 0;
                long a = 0;
                OutputStream os = new FileOutputStream(dest + sourceFile.getName() + "." + i);
                while ((j = is.read(arr)) != -1) {
                    os.write(arr, 0, j);
                    a += j;
                    if (a >= sizeSplitFile) {
                        break;
                    }
                }
                os.flush();
                os.close();
            }
            is.close();
            return true;
        }else {
            System.out.println("file khong ton tai");
            return false;
        }
    }
}
