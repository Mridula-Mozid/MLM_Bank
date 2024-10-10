package mlm_bank;

import java.util.ArrayList;

public class MiniStatement {
    static ArrayList<String> miniStatement = new ArrayList<>();

    public void viewMiniStatement() {
        for (int i = 0; i < miniStatement.size(); i++) {
            String transaction = miniStatement.get(i);
            System.out.println(transaction);
        }
    }
}
