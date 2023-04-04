public class name {
    public static void main (String args[]) {
        int n = 7;

        for (int i=1; i<=n; i++) {

            // D
            for (int j=1; j<=n; j++) {
                if (j==1 ||(i==1&&j<=6) ||(i==7&&j<=6 )||(j==7&& (i>=2&&i<=6)) ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // E
            for (int j=1; j<=n; j++) {
                if(j==1 || (i==1 && j<=7) || (i==n/2+1 && j<=5) || (i==7 && j<=7)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // B
            for (int j=1; j<=n; j++) {
                if (j==1 || (i==1 && j<=6) || (i==7 && j<=6) || (i==2 && j==7) || (i==3 && j== 7) || (i==4 && j== 6) || (i==5 && j==7) || (i==6 && j==7) || (i==4 && j<=5)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // O
            for (int j=1; j<=n; j++) {
                if (j==1 || (i==1 && (j>=2 && j<=6)) || (i==7 && (j>=2 && j<=6)) || j==7) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // P
            for (int j=1; j<=n; j++) {
                if(j==1 || i==1 || i==4 || (i<=4 && j==7)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // R
            for (int j=1; j<=n; j++) {
                if (j==1 || i==1 || i==4 || (i<=4 && j==7) || (i==5 && j==5) || (i==6 && j==6) || (i==7 && j==7)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // I
            for (int j=1; j<=n; j++) {
                if (i==1 || i==7 || j==4) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }

            // Y
            for (int j=1; j<=n; j++) {
                if ((i==1 && j==1) || (i==2 && j==2) || (i==3 && j==3) || (i==4 && j==4) || (i==1 && j==7) || (i==2 && j==6) || (i==3 && j==5) || (j==4 && i>=5)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=0; j<=n-5; j++) {
                System.out.print("  ");
            }

            // O
            for (int j=1; j<=n; j++) {
                if (j==1 || (i==1 && (j>=2 && j<=6)) || (i==7 && (j>=2 && j<=6)) || j==7) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1; j<=n-5; j++) {
                System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
