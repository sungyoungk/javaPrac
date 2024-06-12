package javaPrac.io.object;
import java.io.*;
import java.nio.file.attribute.UserPrincipalNotFoundException;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator + "Users" + separator + "sungyoung" + separator + "Desktop" + separator + "serial.obj";

        SerialDTO dto = new SerialDTO("godOfJava", 1, true, 100);
         // manager.saveObject(fullPath, dto);  // /Users/sungyoung/Desktop
         manager.loadObject(fullPath);


    }

    public void saveObject(String fullPath, SerialDTO dto) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fullPath); // 1. FileOutputStream 객체 생성
            oos = new ObjectOutputStream(fos); // 2. 객체를 저장하기 위해서 oos 생성 및 1에서 생성한 객체 매개변수로 넘김. 이렇게 하면 파일에 저장됨
            oos.writeObject(dto); //3. writeObject 매소드 사용하여 매개변수로 넘어온 객체 저장
            System.out.println("save completed");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
        public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

            try {
                fis = new FileInputStream(fullPath);
                ois = new ObjectInputStream(fis);

                Object obj = ois.readObject();
                SerialDTO dto = (SerialDTO)obj;
                System.out.println(dto);


            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (ois != null) {
                    try {
                        fis.close();
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

}
