package effective.study.chapter02.item03.field;

import java.io.*;

public class ElvisSerialization {

    public static void main(String[] args) throws FileNotFoundException {
        //저장
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //읽기
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))){
            Elvis elvis3 = (Elvis) in.readObject();
            System.out.println(elvis3 == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
