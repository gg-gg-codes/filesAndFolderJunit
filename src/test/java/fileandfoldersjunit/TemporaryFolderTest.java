package fileandfoldersjunit;

import java.io.*;

import junit.framework.Assert;
 
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
 
public class TemporaryFolderTest {
    
   @Rule
   public TemporaryFolder tempFolder = new TemporaryFolder();
   
   @Test
   public void testWrite() throws IOException {
     // Create a temporary file.
     final File tempFile = tempFolder.newFile("tempFile.txt");
   
     // Write something to it.
     FileUtils.writeStringToFile(tempFile, "hello world");
   
     // Read it from temp file
     final String s = FileUtils.readFileToString(tempFile);
   
     // Verify the content
     Assert.assertEquals("hello world", s);
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
       System.out.println("");
       //Note: File is guaranteed to be deleted after the test finishes.
   }
 }