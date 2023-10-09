import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //int[] nums = {0, 1, 4, 5, 6, 7, 8, 9, 10};
        int[] nums = {2,54,34,2,5,78,6,3,143,1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(maxSort(nums)));
    }
    public static void mergeSort() {
        //Average-Case: O(n log(n))
    }

        public static void lineareSuche(int[] nums, int suche) {
        //Average-Case: O(log(n))
        //Worst-Case: O(log(n))
        //Best-Case: O(1)
        for (int i = 0; i<nums.length; i++) {
            if(nums[i]==suche) {
                System.out.println("Zahl bei Index " + i);
            }
        }
    }

    public static void binareSuche(int[] nums, int suche) {
        //Average-Case: O(n)
        //Worst-Case: O(n)
        //Best-Case: O(1)
        int links = 0;
        int rechts = nums.length-1;
        int zahl = -1;

        while (links<=rechts) {
            int mitte = links+(rechts-links)/2;
            if (nums[mitte]==suche) {
                zahl=mitte;
                break;
            } else if (suche<nums[mitte]) {
                rechts=mitte-1;
            } else {
                links=mitte+1;
            }
        }
        if (zahl==-1) {
            System.out.println("Zahl nicht vorhanden");
        } else {
            System.out.println("Zahl bei Index " + zahl);

        }

    }

    public static int[] minSort(int[] nums) {
        //Average-Case: O(n²)
        for (int i=0; i<nums.length; i++) {
            int min = i;                            //Definiere i als kleinste Stelle
            for (int j=i; j<nums.length; j++) {     //Wiederhole für alle Elemente, außer die Kleinsten
                if (nums[min]>nums[j]) {
                    min=j;                          //Definiere neue kleinste Stelle
                }
            }
                                                    //Tausche folgend die kleinste Zahl an die kleinste Stelle
            int cache=nums[i];
            nums[i]=nums[min];
            nums[min]=cache;
        }
        return nums;
    }

    public static int[] maxSort(int[] nums) {
        //Average-Case: O(n²)
        for (int i=nums.length-1; i>=0; i--) {
            int max=i;
            for (int j=i; j>=0; j--) {
                if (nums[max]<nums[j]) {
                    max=j;
                }
            }
            int cache=nums[i];
            nums[i]=nums[max];
            nums[max]=cache;
        }


        return nums;
    }

    public static int[] maxToMinSort(int[] nums) {
        //Average-Case: O(n²)
        for (int i=0; i<nums.length; i++) {
            int max=i;
            for (int j=i; j< nums.length; j++) {
                if (nums[max]<nums[j]) {
                    max=j;
                }
            }
            //Tausch
            int cache=nums[i];
            nums[i]=nums[max];
            nums[max]=cache;
        }
        return nums;
    }

    public static int[] bubbleSort(int[] nums) {
        //Average-Case: O(n²)
        for (int i=1; i<nums.length; i++) {
            for (int j=0; j<nums.length-i; j++) {
                if (nums[j]>nums[j+1]) {
                    int cache=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=cache;
                }
            }
        }
        return nums;
    }
}