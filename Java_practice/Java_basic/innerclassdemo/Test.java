package Java_basic.innerclassdemo;

import javax.swing.*;

public class Test {

    public static void main(String[] args) {

        // 1.
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // Creating an instance of the inner class
        inner.display(); // Calling the method of the inner class

        // 2.
        People.Heart heart = new People().new Heart();
        heart.show(); // Calling the show method of the inner class Heart

        // 3.
        JFrame frame = new JFrame("Inner Class Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Click Me");
        panel.add(button);

        // button.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(frame, "Button clicked!");
        //     }
        // });

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Button clicked using lambda!");
        });

        frame.setVisible(true);
        
    }
}

class People {

    private int heartRate = 70;

    public class Heart {

        private int heartRate = 100;

        public void show() {
            int heartRate = 200;
            System.out.println("Heart Rate: " + heartRate); // Local variable
            System.out.println("Heart Rate: " + this.heartRate); // Inner class variable
            System.out.println("Heart Rate: " + People.this.heartRate); // Outer class
        }
    }
}
