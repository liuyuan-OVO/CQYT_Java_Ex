package LSL_EX_19;
import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:/test/1.txt";
        String destinationFile = "C:/test/2.txt";
        try {
            FileOutputStream fos = new FileOutputStream(sourceFile);
            String content = "����Javaʵ��γ̣�ʵ������ΪI/O���������";
            fos.write(content.getBytes());
            fos.close();
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos2 = new FileOutputStream(destinationFile);
            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos2.write(buffer, 0, bytesRead);
            }
            fis.close();
            fos2.close();
            System.out.println("�Ѹ���");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
