package pp10.pkg6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Pp106 extends javax.swing.JPanel {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
        JFrame frame = new JFrame();
        frame.add(new Pp106());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        }
        });
    }
    
    private int[] numbers = new int[50];
    private int min = 20;
    private int max = 100;
    private boolean shuffle = false;
    public static final int ITERATION_SLEEP = 100;

    public Pp106() {
        loadArray();
        addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            if (shuffle)
            loadArray();
            selectionSort(numbers);
            shuffle = true;
        }
        });
    }

    public Dimension getPreferredSize() {
        return new Dimension(300, 100);
    }

    private void loadArray() {
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = min + (int) (Math.random() * ((max - min) + 1));
    }
    }

    public void selectionSort(final int[] x) {
        new Thread(new Runnable() {
            public void run() {
            for (int i = 0; i < x.length - 1; i++) {
            int minIndex = i; // Index of smallest remaining value.
            for (int j = i + 1; j < x.length; j++) {
            if (x[minIndex] > x[j]) {
            minIndex = j; // Remember index of new minimum
        }
    }
    if (minIndex != i) {
        // ... Exchange current element with smallest remaining.
        int temp = x[i];
        x[i] = x[minIndex];
        x[minIndex] = temp;
    }
    repaint();
    try {
    Thread.sleep(1000);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }   
    }
    }).start();
    }

    private void drawPass(Graphics g) {
    int rectWidth = 1;

    int width = getWidth() - 1;
    int height = getHeight() - 1;
    int colSpan = Math.round((float)width / (float)numbers.length);
    int x = 0;

    for (int num : numbers) {
    int colHeight = (int) ((float) height * ((float) num / (float) 100));
    g.fillRect(x, height - colHeight, rectWidth, colHeight);
    x += colSpan;
    }
    }

    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawPass(g);
    }
}