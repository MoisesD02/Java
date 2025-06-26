package Laboratorio6;

import javax.swing.*;
import java.awt.*;

public class arbolPanel extends JPanel {
    private Nodo raiz;

    public arbolPanel(Nodo raiz) {
        this.raiz = raiz;
        Dimension tamañoArbol = calcularTamañoArbol(raiz);
        setPreferredSize(tamañoArbol);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (raiz != null) {
            int anchoTotal = calcularAnchoSubarbol(raiz);
            dibujarArbol(g, raiz, getWidth() / 2, 30, anchoTotal / 4); 
        }
    }

    private void dibujarArbol(Graphics g, Nodo nodo, int x, int y, int espacioHijo) {
        if (nodo == null) return;

        FontMetrics metrics = g.getFontMetrics();
        String texto = nodo.getDato().toString();
        int anchoTexto = metrics.stringWidth(texto);
        int altoTexto = metrics.getHeight();
        int anchoNodo = Math.max(30, anchoTexto + 10);
        int altoNodo = Math.max(30, altoTexto + 10);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(x - anchoNodo / 2, y - altoNodo / 2, anchoNodo, altoNodo);
        g.setColor(Color.WHITE);
        g.drawString(texto, x - anchoTexto / 2, y + altoTexto / 4);

        if (nodo.getIzq() != null) {
            int xIzq = x - espacioHijo; 
            g.setColor(Color.BLACK);
            g.drawLine(x, y + altoNodo / 2, xIzq, y + altoNodo / 2 + 50);
            dibujarArbol(g, nodo.getIzq(), xIzq, y + altoNodo / 2 + 50, espacioHijo / 2);
        }
        if (nodo.getDer() != null) {
            int xDer = x + espacioHijo;
            g.setColor(Color.BLACK);
            g.drawLine(x, y + altoNodo / 2, xDer, y + altoNodo / 2 + 50);
            dibujarArbol(g, nodo.getDer(), xDer, y + altoNodo / 2 + 50, espacioHijo / 2);
        }
    }

    private int calcularAnchoSubarbol(Nodo nodo) {
        if (nodo == null) return 0;

        int anchoIzq = calcularAnchoSubarbol(nodo.getIzq());
        int anchoDer = calcularAnchoSubarbol(nodo.getDer());

        return Math.max(50, anchoIzq + anchoDer + 50);
    }

    private Dimension calcularTamañoArbol(Nodo nodo) {
        if (nodo == null) return new Dimension(0, 0);

        Dimension izq = calcularTamañoArbol(nodo.getIzq());
        Dimension der = calcularTamañoArbol(nodo.getDer());

        int altura = Math.max(izq.height, der.height) + 80;

        int ancho = calcularAnchoSubarbol(nodo);

        return new Dimension(ancho, altura);
    }
}
