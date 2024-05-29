package com.ejercicios.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Productos {
    private JFrame frame;
    private JTextField productoField;
    private JButton agregarButton;
    private JTextArea displayArea;
    private Map<Integer, String> lista_productos = new HashMap<Integer, String>();
    private Map<Integer, Integer> precio_productos = new HashMap<Integer, Integer>();
    private final int[] presupuesto = {0};
    private boolean enStock = false;

    public Productos() {
        frame = new JFrame("Agregar Producto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        productoField = new JTextField(20);
        agregarButton = new JButton("Agregar");

        topPanel.add(new JLabel("Producto:"));
        topPanel.add(productoField);
        topPanel.add(agregarButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        lista_productos.put(50,"Cemento");
        lista_productos.put(47, "Arena");
        lista_productos.put(129, "Durlock");
        lista_productos.put(702, "Viga de hierro");
        lista_productos.put(703, "Viga de madera");
        lista_productos.put(99, "Hierro 8mm");
        lista_productos.put(132, "Caño estructural 6mts");

        precio_productos.put(50,20000);
        precio_productos.put(47, 18000);
        precio_productos.put(129, 5000);
        precio_productos.put(702, 12000);
        precio_productos.put(703, 8000);
        precio_productos.put(99, 7000);
        precio_productos.put(132, 17000);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProducto();
            }
        });

        frame.setVisible(true);
    }

    private void agregarProducto() {
        String producto = productoField.getText();
        if (!producto.isEmpty()) {
            enStock = false;
            lista_productos.forEach((k, v) -> {
                if (producto.equalsIgnoreCase(v)) {
                    displayArea.append("Producto agregado: " + producto + " " + precio_productos.get(k) + "\n");
                    presupuesto[0] += precio_productos.get(k);
                    enStock = true;
                }
            });
            if (producto.equalsIgnoreCase("final")) {
                displayArea.append("Presupuesto final: " + presupuesto[0]);  
                enStock = true;                
            }
            if (!enStock) {
                JOptionPane.showMessageDialog(frame, "El producto no esta en stock.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            productoField.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese un producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Productos();
            }
        });
    }
}
