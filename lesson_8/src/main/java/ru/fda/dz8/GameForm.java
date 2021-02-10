package ru.fda.dz8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameForm extends JFrame {
    Random rand = new Random();
    boolean flag;
    int counter;
    int attempt = 3;

    public GameForm() {
        this.setBounds(300, 300, 450, 400);
        this.setTitle("Угадайка");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        int x = rand.nextInt(10);
        System.out.println(x);

        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(0, 200));
        this.add(textArea, BorderLayout.NORTH);
        textArea.append("Отгадайте число от 0 до 9\n");

        JPanel panelCenter = new JPanel(new GridLayout(2, 5, 2, 2));
        this.add(panelCenter, BorderLayout.CENTER);

        for (int i = 0; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            panelCenter.add(button);

            final int index = i;

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (counter < attempt) {
                        if (flag != true) {
                            textArea.append("Ваш ответ: " + index + '\n');
                            if (x == index) {
                                textArea.append("Вы победили!!!\n");
                                flag = true;
                            } else if (index < x) {
                                textArea.append("Ваше число меньше загаданного!\n");
                                counter++;
                            } else {
                                textArea.append("Ваше число больше загаданного!\n");
                                counter++;
                            }
                        }
                    } else {
                        textArea.append("Вы проиграли(\n");
                    }
                }
            });
        }

        JPanel panelSouth = new JPanel(new GridLayout(1, 2));
        this.add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setPreferredSize(new Dimension(0, 30));
        JButton buttonGame = new JButton("Играть");
        buttonGame.setBackground(Color.GREEN);
        buttonGame.setFont(new Font("Arial", Font.BOLD, 16));
        panelSouth.add(buttonGame);
        buttonGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new GameForm();
            }
        });

        JButton buttonClose = new JButton("Закрыть");
        buttonClose.setBackground(Color.red);
        buttonClose.setFont(new Font("Arial", Font.BOLD, 16));
        panelSouth.add(buttonClose);
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameForm();
    }

}
