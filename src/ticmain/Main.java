package ticmain;

public class Main {

    private static int user;
    public static int[] table = {
        0, 0, 0,
        0, 0, 0,
        0, 0, 0,};

    /*
    格式
    0 1 2
    3 4 5
    6 7 8
     */
    //清空陣列(table)跟重置使用者順序(user)的值
    public static void resetact() {
        user = 2;
        for (int i = 0; i < 9; i++) {
            table[i] = 0;
        }
    }

//將按鈕狀態存入陣列(X = 2 O = 1)
    public static int btnpressedinit(int btncode, int btnstat) {
        if (btnstat == 0) {
            if (user == 1) {
                user = 2;
            } else {
                user = 1;
            }
            table[btncode] = user;
            for (int i = 0; i < 3; i++) {
                for (int j = 3 * i; j < (3 * i) + 3; j++) {
                    System.out.print(table[j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            System.out.println("=========");
            return user;
        } else {
            return 3;
        }
    }

    //將按鈕狀態轉換成數字
    public static int detbtnstat(String btntext) {
        switch (btntext) {
            case "":
                return 0;
            case "○":
                return 1;
            case "×":
                return 2;
            default:
                System.err.println("Err btn type.");
                return 3;
        }
    }
//程式進入點，列印相關資訊在主控台

    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Tic Tac Toe MiniGame");
        System.out.println("By Bob Pan");
        System.out.println("2019.07.29");
        System.out.println("====================");
        resetact();
        MainFrame.init();
    }

}
