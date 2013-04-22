import java.awt.*;
/**
 * @author HyperToxic
 *
 */
public class ChatClient extends Frame{
	TextField tf = new TextField();
	TextArea ta = new TextArea();

	public static void main(String[] args) {
	
		new ChatClient().launchFrame();
	}
	
	public void launchFrame()
	{
		setLocation(400,300);
		setSize(300,300);
		add(tf,BorderLayout.SOUTH);
		add(ta,BorderLayout.NORTH);
		this.pack();
		setTitle("¡ƒÃÏ–°≥Ã–Ú£®by guohao:)");
		setVisible(true);
	}

}
