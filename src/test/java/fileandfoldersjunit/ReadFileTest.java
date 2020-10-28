package fileandfoldersjunit;

import java.io.*;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ReadFileTest {


    @Test
    public void testWrite() throws IOException {
        // Create a temporary file.

        ClassLoader classLoader= getClass().getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("test10.txt");
        InputStreamReader isReader = new InputStreamReader(resourceAsStream);
        //Creating a BufferedReader object
        BufferedReader reader = new BufferedReader(isReader);
        StringBuffer sb = new StringBuffer();
        String str;
        while((str = reader.readLine())!= null){
            sb.append(str);
        }
        //todo read your file and do your stuff here
        System.out.println("");
        //Note: File is guaranteed to be deleted after the test finishes.
    }
}
