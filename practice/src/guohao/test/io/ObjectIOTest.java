package guohao.test.io;



import java.io.*;

class ObjectIOTest {
	public static void main(String[] args) throws IOException {
		try {
			T t = new T();
			t.name = "guohao";
			FileOutputStream fo = new FileOutputStream(
					"D:/codes/java/practice/mess/ObjectIO.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fo);

			oos.writeObject(t);
			oos.flush();
			oos.close();

			// ∂¡»°
			FileInputStream fi = new FileInputStream(
					"D:/codes/java/practice/mess/ObjectIO.dat");
			ObjectInputStream ois = new ObjectInputStream(fi);
			T tRead = (T) ois.readObject();
			System.out.println(tRead.age + tRead.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class T implements Serializable {
	int age = 100;
	String name = "guoziyi";
}