import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class ExpenseTrackerController {
    @FXML
    private TableView<Expense> expenseTable;
    @FXML
    private TableColumn<Expense, Double> amountColumn;
    @FXML
    private TableColumn<Expense, String> categoryColumn;
    @FXML
    private TableColumn<Expense, String> dateColumn;

    public void initialize() {
        // Set up the table columns
        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty().asObject());
        categoryColumn.setCellValueFactory(cellData -> cellData.getValue().categoryProperty());
        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());

        // Load expense data from file
        loadExpenseData();
    }

    @FXML
    private void addExpense() {
        // Show a dialog to enter expense details
        // Retrieve amount, category, and date from the dialog

        double amount = 100.0; // Example value
        String category = "Food"; // Example value
        String date = LocalDate.now().toString(); // Current date

        Expense expense = new Expense(amount, category, date);
        expenseTable.getItems().add(expense);

        // Save expense data to file
        saveExpenseData();
    }

    private void loadExpenseData() {
        // Read expense data from file and populate the table
        // Example code to load expenses from a CSV file
        try (BufferedReader reader = new BufferedReader(new FileReader("expenses.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                double amount = Double.parseDouble(data[0]);
                String category = data[1];
                String date = data[2];
                Expense expense = new Expense(amount, category, date);
                expenseTable.getItems().add(expense);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveExpenseData() {
        // Save expense data to file
        // Example code to save expenses to a CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.csv"))) {
            for (Expense expense : expenseTable.getItems()) {
                writer.write(expense.getAmount() + "," + expense.getCategory() + "," + expense.getDate());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

