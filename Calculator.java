import java.awt.Color;
import java.awt.Font;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
     JFrame frame;
     JLabel displayLabel;
     JButton sevenButton, eightButton, nineButton;
     JButton fiveButton, fourButton, sixButton;
     JButton oneButton, twoButton, threeButton;
     JButton dotButton, zeroButton, clearButton;
     JButton plusButton, multiButton, minusButton, equalButton, divButton;
     Boolean isOperatorClicked = false;
     String oldValue;
     int operator = 0;
     float result;

     public Calculator() {
          // frame size
          frame = new JFrame("Calculator");
          frame.setLayout(null);
          frame.setSize(480, 460);
          frame.setLocation(465, 150);
          frame.setResizable(false);

          // frame size finished
          // border creating
          Border border = BorderFactory.createLineBorder(Color.green, 1);
          Border borderButton = BorderFactory.createLineBorder(Color.white, 1);
          // border finished
          // Font size

          Font fontScreen = new Font("Arial", Font.PLAIN, 15);
          Font fontButton = new Font("Arial", Font.BOLD, 20);

          // Font size finish

          // JLabel starts -- calculator screen size start
          displayLabel = new JLabel();
          displayLabel.setBounds(40, 24, 390, 50);
          displayLabel.setBackground(Color.white);
          displayLabel.setFont(fontScreen);
          displayLabel.setOpaque(true);
          displayLabel.setBorder(border);
          displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
          displayLabel.setForeground(Color.black);
          frame.add(displayLabel);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.getContentPane().setBackground(Color.black);// backgrond color of frame

          // calculator screen size finished

          // JButton

          // first row start
          sevenButton = new JButton("7");
          sevenButton.setBounds(40, 100, 50, 50);
          frame.add(sevenButton);
          sevenButton.setForeground(Color.white);
          sevenButton.setBackground(Color.gray);
          sevenButton.setFont(fontButton);
          sevenButton.setBorder(borderButton);
          sevenButton.addActionListener(this);

          eightButton = new JButton("8");
          eightButton.setBounds(120, 100, 50, 50);
          frame.add(eightButton);
          eightButton.setForeground(Color.white);
          eightButton.setBackground(Color.gray);
          eightButton.setFont(fontButton);
          eightButton.setBorder(borderButton);
          eightButton.addActionListener(this);

          nineButton = new JButton("9");
          nineButton.setBounds(200, 100, 50, 50);
          frame.add(nineButton);
          nineButton.setForeground(Color.white);
          nineButton.setBackground(Color.gray);
          nineButton.setFont(fontButton);
          nineButton.setBorder(borderButton);
          nineButton.addActionListener(this);

          // first row finished

          // second row start

          fourButton = new JButton("4");
          fourButton.setBounds(40, 170, 50, 50);
          frame.add(fourButton);
          fourButton.setForeground(Color.white);
          fourButton.setBackground(Color.gray);
          fourButton.setFont(fontButton);
          fourButton.setBorder(borderButton);
          fourButton.addActionListener(this);

          fiveButton = new JButton("5");
          fiveButton.setBounds(120, 170, 50, 50);
          frame.add(fiveButton);
          fiveButton.setForeground(Color.white);
          fiveButton.setBackground(Color.gray);
          fiveButton.setFont(fontButton);
          fiveButton.setBorder(borderButton);
          fiveButton.addActionListener(this);

          sixButton = new JButton("6");
          sixButton.setBounds(200, 170, 50, 50);
          frame.add(sixButton);
          sixButton.setForeground(Color.white);
          sixButton.setBackground(Color.gray);
          sixButton.setFont(fontButton);
          sixButton.setBorder(borderButton);
          sixButton.addActionListener(this);

          // second row finish

          // third row start

          oneButton = new JButton("1");
          oneButton.setBounds(40, 240, 50, 50);
          frame.add(oneButton);
          oneButton.setForeground(Color.white);
          oneButton.setBackground(Color.gray);
          oneButton.setFont(fontButton);
          oneButton.setBorder(borderButton);
          oneButton.addActionListener(this);

          twoButton = new JButton("2");
          twoButton.setBounds(120, 240, 50, 50);
          frame.add(twoButton);
          twoButton.setForeground(Color.white);
          twoButton.setBackground(Color.gray);
          twoButton.setFont(fontButton);
          twoButton.setBorder(borderButton);
          twoButton.addActionListener(this);

          threeButton = new JButton("3");
          threeButton.setBounds(200, 240, 50, 50);
          frame.add(threeButton);
          threeButton.setForeground(Color.white);
          threeButton.setBackground(Color.gray);
          threeButton.setFont(fontButton);
          threeButton.setBorder(borderButton);
          threeButton.addActionListener(this);

          // third row finish

          // foruth row start

          dotButton = new JButton(".");
          dotButton.setBounds(40, 310, 50, 50);
          frame.add(dotButton);
          dotButton.setForeground(Color.white);
          dotButton.setBackground(Color.gray);
          dotButton.setFont(fontButton);
          dotButton.setBorder(borderButton);
          dotButton.addActionListener(this);

          zeroButton = new JButton("0");
          zeroButton.setBounds(120, 310, 50, 50);
          frame.add(zeroButton);
          zeroButton.setForeground(Color.white);
          zeroButton.setBackground(Color.gray);
          zeroButton.setFont(fontButton);
          zeroButton.setBorder(borderButton);
          zeroButton.addActionListener(this);

          clearButton = new JButton("C");
          clearButton.setBounds(200, 310, 50, 50);
          frame.add(clearButton);
          clearButton.setForeground(Color.white);
          clearButton.setBackground(Color.gray);
          clearButton.setFont(fontButton);
          clearButton.setBorder(borderButton);
          clearButton.addActionListener(this);

          // fourth row finish

          // operator
          // fifth row

          divButton = new JButton("/");
          divButton.setBounds(280, 100, 50, 50);
          frame.add(divButton);
          divButton.setForeground(Color.white);
          divButton.setBackground(Color.gray);
          divButton.setFont(fontButton);
          divButton.setBorder(borderButton);
          divButton.addActionListener(this);

          multiButton = new JButton("x");
          multiButton.setBounds(280, 170, 50, 50);
          frame.add(multiButton);
          multiButton.setForeground(Color.white);
          multiButton.setBackground(Color.gray);
          multiButton.setFont(fontButton);
          multiButton.setBorder(borderButton);
          multiButton.addActionListener(this);

          minusButton = new JButton("-");
          minusButton.setBounds(280, 240, 50, 50);
          frame.add(minusButton);
          minusButton.setForeground(Color.white);
          minusButton.setBackground(Color.gray);
          minusButton.setFont(fontButton);
          minusButton.setBorder(borderButton);
          minusButton.addActionListener(this);

          plusButton = new JButton("+");
          plusButton.setBounds(280, 310, 50, 50);
          frame.add(plusButton);
          plusButton.setForeground(Color.white);
          plusButton.setBackground(Color.gray);
          plusButton.setFont(fontButton);
          plusButton.setBorder(borderButton);
          plusButton.addActionListener(this);

          // fitth row finish

          // Equal button

          equalButton = new JButton("=");
          equalButton.setBounds(360, 100, 50, 262);
          frame.add(equalButton);
          equalButton.setForeground(Color.white);
          equalButton.setBackground(Color.gray);
          equalButton.setFont(fontButton);
          equalButton.setBorder(borderButton);
          equalButton.addActionListener(this);

          // Equal button

     }

     // main funtion starts...
     public static void main(String[] args) {
          new Calculator();
     }

     // Action Listener start
     @Override
     public void actionPerformed(ActionEvent e) {
          if (e.getSource() == sevenButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("7");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "7");

               }

          } else if (e.getSource() == eightButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("8");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "8");

               }

          } else if (e.getSource() == eightButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("9");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "9");

               }

          } else if (e.getSource() == fourButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("4");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "4");

               }
          } else if (e.getSource() == fiveButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("5");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "5");

               }
          } else if (e.getSource() == sixButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("6");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "6");

               }

          } else if (e.getSource() == oneButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("1");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "1");

               }

          } else if (e.getSource() == twoButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("2");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "2");

               }

          } else if (e.getSource() == threeButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("3");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "");

               }

          } else if (e.getSource() == dotButton) {
               if (isOperatorClicked) {
                    displayLabel.setText(".");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + ".");

               }

          } else if (e.getSource() == zeroButton) {
               if (isOperatorClicked) {
                    displayLabel.setText("0");
                    isOperatorClicked = false;
               } else {
                    displayLabel.setText(displayLabel.getText() + "0");

               }

          } else if (e.getSource() == clearButton) {
               displayLabel.setText("");
          }

          // need to check
          // operator

          else if (e.getSource() == plusButton) {
               isOperatorClicked = true;
               oldValue = displayLabel.getText();
               operator = 1;
          } else if (e.getSource() == clearButton) {
               isOperatorClicked = true;

          } else if (e.getSource() == minusButton) {
               isOperatorClicked = true;
               oldValue = displayLabel.getText();
               operator = 2;

          } else if (e.getSource() == divButton) {
               isOperatorClicked = true;
               oldValue = displayLabel.getText();
               operator = 3;

          } else if (e.getSource() == multiButton) {
               isOperatorClicked = true;
               oldValue = displayLabel.getText();
               operator = 4;

          } // equal button
          else if (e.getSource() == equalButton) {
               String newValue = displayLabel.getText();
               float oldValueF = Float.parseFloat(oldValue);
               float newValueF = Float.parseFloat(newValue);

               switch (operator) {
               case 1:
                    result = oldValueF + newValueF;
                    break;
               case 2:
                    result = oldValueF - newValueF;
                    break;
               case 3:
                    result = oldValueF / newValueF;
                    break;
               case 4:
                    result = oldValueF * newValueF;
                    break;

               }
               displayLabel.setText(result + "");

          }

     }

}
// Thank You for visting my project..