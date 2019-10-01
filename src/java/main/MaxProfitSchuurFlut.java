
import java.util.*;

public class MaxProfitSchuurFlut {
    public static final int SELLING_PRICE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int count = 0;
            int z = scanner.nextInt();
            if (z == 0) break;
            count++;

            Schuur[] schuurs = new Schuur[z];
            for (int i = 0; i < schuurs.length; i++) {
                int length = scanner.nextInt();
                Schuur s = new Schuur(length);
                for (int j = 0; j < length; j++) {
                    s.getFluts()[j] = scanner.nextInt();
                }
                s.processProfit(SELLING_PRICE);
                schuurs[i] = s;
            }

            List<Schuur> selectedSchuurs = new ArrayList<>();
            int maxProfit = 0;
            for (Schuur s : schuurs) {
                if (s.getMaxprofit() > 0) {
                    maxProfit += s.getMaxprofit();
                    selectedSchuurs.add(s);
                }
            }

            System.out.println("schuurs " + count);
            System.out.println("Maximum profit is " + maxProfit + ".");
            List<Integer> indexs = new ArrayList<>();
            int c = 0;
            for (Schuur schuur : selectedSchuurs) {
                List<Integer> temp = new ArrayList<>();
                c++;
                if (c == 1) {
                    for (int i = 0; i < schuur.getMaxprofitindexes().size(); i++) {
                        temp.add((Integer) schuur.getMaxprofitindexes().get(i));
                    }
                } else {
                    for (int i = 0; i < schuur.getMaxprofitindexes().size(); i++) {
                        for (int j = 0; j < indexs.size(); j++) {
                            temp.add((Integer) schuur.getMaxprofitindexes().get(i) + (Integer) indexs.get(j));
                        }
                    }
                }

                indexs.clear();
                indexs.addAll(temp);
            }

            Set<Integer> numbers = new HashSet<>(indexs);
            System.out.print("Number of fluts to buy:");
            for (Integer i : numbers) {
                System.out.print(" " + i);
            }
            System.out.println();

            count++;
        }
    }
}

class Schuur {
    private int maxprofit;
    private int[] fluts;
    private int[] profitArray;
    private ArrayList maxprofitindexes = new ArrayList();

    public Schuur(int length) {
        this.fluts = new int[length];
        this.profitArray = new int[length];
    }

    // getter and setters
    public int getMaxprofit() {
        return maxprofit;
    }

    public void setMaxprofit(int maxprofit) {
        this.maxprofit = maxprofit;
    }

    public int[] getFluts() {
        return fluts;
    }

    public void setFluts(int[] fluts) {
        this.fluts = fluts;
    }


    public int[] getProfitArray() {
        return profitArray;
    }

    public void setProfitArray(int[] profitArray) {
        this.profitArray = profitArray;
    }

    public ArrayList getMaxprofitindexes() {
        return maxprofitindexes;
    }

    public void setMaxprofitindexes(ArrayList maxprofitindexes) {
        this.maxprofitindexes = maxprofitindexes;
    }

    //necessary methods
    public void processProfit(int sellingPrice) {
        if (this.fluts.length > 0) {
            this.maxprofit = sellingPrice - this.fluts[0];
            this.profitArray[0] = this.maxprofit;
        }

        // calculate max profit and profit array
        for (int i = 1; i < this.fluts.length; i++) {
            this.profitArray[i] = profitArray[i - 1] + sellingPrice - this.fluts[i];
            if (this.profitArray[i] > this.maxprofit) {
                this.maxprofit = this.profitArray[i];
            }
        }

        // find index with max profit
        for (int i = 0; i < this.profitArray.length; i++) {
            if (this.profitArray[i] == this.maxprofit) {
                this.maxprofitindexes.add(i + 1);
            }
        }

    }
}
