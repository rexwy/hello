import javax.swing.*;
import java.util.concurrent.*;
public class one {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		final JLabel label = new JLabel("a label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				label.setText("see");
			}
		});
	}

}
