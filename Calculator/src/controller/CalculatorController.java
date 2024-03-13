package controller;

import model.CalculatorModel;
import view.CalculatorView;
import view.Menu;

public class CalculatorController extends Menu {

    private CalculatorModel model;
    private CalculatorView view;
    private static String[] mc = {"Addition Matrix", "Subtraction Matrix", "Multiplication Matrix", "Quit"};

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        super("Calculator Program", mc);
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                additionMatrix();System.err.flush();break;
            case 2:
                subtractionMatrix();System.err.flush();break;
            case 3:
                multiplicationMatrix(); System.err.flush();break;
            case 4:System.exit(0);
        }
    }

    public void additionMatrix() {
        view.displayMessage("-------- Addition --------");
        int i = 1;
        int[][] n = getMatrix(i++);
        int[][] m = getMatrix(i);
        int[][] result;
        try{
            result = model.additionMatrix(n, m);
        } catch (Exception ex){
            view.displayRedMessage(ex.getMessage());
            System.err.flush();
            return;
        }
        view.displayMessage("-------- Result --------");
        view.displayMatrix(n);
        view.displayMessage("+");
        view.displayMatrix(m);
        view.displayMessage("=");
        view.displayMatrix(result);
    }

    public void subtractionMatrix() {
        view.displayMessage("------- Subtraction -------");
        int i = 1;
        int[][] n = getMatrix(i++);
        int[][] m = getMatrix(i);
        int[][] result;
        try{
            result = model.subtractionMatrix(n, m);
        } catch (Exception ex){
            view.displayRedMessage(ex.getMessage());
            System.err.flush();
            return;
        }
        view.displayMessage("-------- Result --------");
        view.displayMatrix(n);
        view.displayMessage("-");
        view.displayMatrix(m);
        view.displayMessage("=");
        view.displayMatrix(result);
    }

    public void multiplicationMatrix() {
        view.displayMessage("----- Multiplication -----");
        int i = 1;
        int[][] n = getMatrix(i++);
        int[][] m = getMatrix(i);
        int[][] result;
        try{
            result = model.multiplicationMatrix(n, m);
        } catch (Exception ex){
            view.displayRedMessage(ex.getMessage());
            System.err.flush();
            return;
        }
        view.displayMessage("-------- Result --------");
        view.displayMatrix(n);
        view.displayMessage("*");
        view.displayMatrix(m);
        view.displayMessage("=");
        view.displayMatrix(result);
    }

    public int[][] getMatrix(int i) {
        String row, column;
        int n, m;

        while (true) {
            try {
                row = view.getString("Enter Row Matrix " + i);
                if (model.checkRowColumn(row)) {
                    n = Integer.parseInt(row);
                    break;
                }
            } catch (Exception ex) {
                view.displayRedMessage(ex.getMessage());
                System.err.flush();
            }
        }
        System.err.flush();
        while (true) {
            try {
                column = view.getString("Enter Column Matrix " + i);
                if (model.checkRowColumn(column)) {
                    m = Integer.parseInt(column);
                    break;
                }
            } catch (Exception ex) {
                view.displayRedMessage(ex.getMessage());
                System.err.flush();
            }
        }
        System.err.flush();
        int[][] matrix = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                String value;
                while (true) {
                    try {
                        value = view.getString("Enter Matrix" + i + "[" +(j+1)+"]" + "[" +(k+1) + "]");
                        if (model.checkValue(value)) {
                            matrix[j][k] = Integer.parseInt(value);
                            break;
                        }
                    } catch (Exception ex) {
                        view.displayRedMessage(ex.getMessage());
                        System.err.flush();
                    }
                }
                System.err.flush();
            }
        }
        return matrix;
    }

}
