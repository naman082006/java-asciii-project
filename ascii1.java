import java.util.*;

class ascii1
{
    public static void main(String args[])
    {
        String s[][]={
                {" XXX  XXXX   XXX  XXXX  XXXXX XXXXX  XXX  X   X XXXXX XXXXX X   X X     XX XX X   X  XXX  XXXX   XXX  XXXX  XXXXX XXXXX X   X X   X X   X X   X X   X XXXXX "},
                {"X   X X   X X   X X   X X     X     X   X X   X   X     X   X  X  X     XX XX XX  X X   X X   X X   X X   X X       X   X   X X   X X   X  X X   X X     X  "},
                {"X   X XXXX  X     X   X XXXX  XXXX  X     XXXXX   X     X   XX    X     X X X X X X X   X XXXX  X   X XXXX  XXXXX   X   X   X X   X X X X   X     X     X   "},
                {"XXXXX X   X X   X X   X X     X     X X X X   X   X   X X   X X   X     X   X X  XX X   X X     X  XX X  X      X   X   X   X X   X XX XX  X X   X     X    "},
                {"X   X XXXX   XXX  XXXX  XXXXX X     X X X X   X XXXXX  XX   X   X XXXXX X   X X   X  XXX  X      XXX  X   X XXXXX   X    XXX    X   X   X X   X X     XXXXX "}
            };
            String num[][] = {
            {" XX   XX   XX   XX     X XXXX XXXX XXXX  XX  XXXX "},
            {"X  X XXX  X  X X  X   XX X    X       X X  X X  X "},
            {"X  X  XX    X    X   X X XXXX XXXX   X   XX  XXXX "},
            {"X  X  XX   X   X  X XXXX    X X  X  X   X  X    X "},
            {" XX  XXXX XXXX  XX     X XXXX XXXX X     XX  XXXX "}
        };
        String sym[][] = {
            {"XX       X X     X  X     XX         X   XX      XXXX    XXXX "},
            {"XX       X X     X  X   XXXXXX  XX  X   X  X    XX   X  X    X"},
            {"XX              XXXXXX  X XX    XX X     XX         XX  X XX X"},
            {"XX               X  X   XXXXXX    X XX   XX X      XX   X X XX"},
            {"XX              XXXXXX    XX X   X  XX  X  X      XX    X XXXX"},
            {"                 X  X   XXXXXX  X        XX X           X     "},
            {"XX               X  X     XX                      XX     XXX  "}
        };
        System.out.print("\tWelcome to ASCII Project\n\n");
        System.out.print("1. Show Letter\t\t");
        System.out.print("2. Show Word\n");
        System.out.print("3. Show Range\t\t");
        System.out.print("4. Show Numbers\n");
        System.out.print("5. Show Symbol\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Choice -- ");
        int n = input.nextInt();
        if(n == 1){
            do{
                showLetter(s);
            }while(printagain() == 1);
        } else if(n == 2){
            do{
                showWord(s);
            }while(printagain() == 1);
        } else if(n == 3){
            do{
                showAlphaRange(s);
            }while(printagain() == 1);
        } else if(n == 4){
            do{
                showNumbers(num);
            }while(printagain() == 1);
        } else if(n == 5){
             do{
                 showSymbol(sym);
             }while(printagain() == 1);
        }
    }
    public static void showLetter(String s[][]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Letter (a-z) -- ");
        String s1 = input.next();
        System.out.println();
        char c[];
        int p = Character.toUpperCase(s1.charAt(0)) - 64;
        int cnt = 6 * (p - 1);
        for(int i = 0; i < 5; i++){
            c = String.valueOf(s[i][0]).toCharArray();
            for(int j = cnt; j < cnt + 6; j++){
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
    public static void showWord(String s[][]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String -- ");
        String s1 = input.next();
        System.out.println();
        char c[];
        int i, j , cnt, p, k;
        for (i = 0; i < 5; i++){
            for(k = 0; k < s1.length(); k++){
                p = Character.toUpperCase(s1.charAt(k)) - 64;
                cnt = 6 * (p - 1);
                c = String.valueOf(s[i][0]).toCharArray();
                for (j = cnt; j < cnt + 6; j++){
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }
    public static void showAlphaRange(String s[][]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range (a-z) -- ");
        String s1 = input.next();
        System.out.println();
        char c[];
        int i, j;
        for (i = 0; i < 5; i++){
            int start = Character.toUpperCase(s1.charAt(0)) - 64;
            int end = Character.toUpperCase(s1.charAt(2)) - 64;
            if(end < start){
                System.out.println("Invalid range...");
                System.out.println("Try again...");
                showAlphaRange(s);
                break;
            }
            c = String.valueOf(s[i][0]).toCharArray();
            for (j = (6 * (start - 1)); j < (6 * (end - 1) + 6); j++){
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
    public static void showNumbers(String num[][]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number -- ");
        String s1 = input.next();
        System.out.println();
        char c[];
        int i, j , cnt, p, k;
        for (i = 0; i < 5; i++){
            for(k = 0; k < s1.length(); k++){
                p = s1.charAt(k) - 47;
                cnt = 5 * (p - 1);
                c = String.valueOf(num[i][0]).toCharArray();
                for (j = cnt; j < cnt + 5; j++){
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }
    public static int printagain(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nDo you want to continue? (yes/no): ");
        String choice = input.next();
        if(choice.equalsIgnoreCase("yes")){
            return 1;
        } else{
            return 0;
        }
    }
    public static void showSymbol(String sym[][]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Symbol -- ");
        char c1 = input.next().charAt(0);
        System.out.println();
        char c[];
        int p = 0;
        switch (c1) {
            case '!':        
                p = 1;
                break;        
            case '"':
                p = 2;
                break;
            case '#':
                p = 3;
                break;
            case '$':
                p = 4;
                break;
            case '%':
                p = 5;
                break;
            case '&':
                p = 6;
                break;
            case '?':
                p = 7;
                break;
            case '@':
                p = 8;
                break;
            default:
                System.out.println("Invalid range...");
                System.out.println("Try again...");
                showSymbol(sym);
        }
        int cnt = 8 * (p - 1);
        for(int i = 0; i < 7; i++){
            c = String.valueOf(sym[i][0]).toCharArray();
            for(int j = cnt; j < cnt + 6; j++){
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
}