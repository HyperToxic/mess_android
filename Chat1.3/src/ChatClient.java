import java.awt.*;
import java.awt.event.*;

/**
 * @author HyperToxic
 *  ��ӹر��¼���Ӧ
 */
public class ChatClient extends Frame {
	TextField tf = new TextField();
	TextArea ta = new TextArea();

	public static void main(String[] args) {

		new ChatClient().launchFrame();
	}

	public void launchFrame() {
		setLocation(400, 300);
		setSize(300, 300);
		add(tf, BorderLayout.SOUTH);
		add(ta, BorderLayout.NORTH);
		this.pack();
		setTitle("����С����by guohao:)");
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

}
