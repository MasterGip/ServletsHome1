package ru.kfu.itis;

/**
 * Created by mg on 24.09.14.
 */
public abstract class Tools {

    private static String formateDouble(double d){
        int help = (int)(d * 100);
        return String.valueOf((double)help/100);
    }

    public static String[] solveAQuadraticEquationWithFactors(int a, int b, int c){

        double diskriminant = b*b - 4*a*c;
        String[] returning = new String[2];
        if(a == 0 && b==0){
            returning = new String[1];
            if (c==0){

                returning[0] = "Любое число";
            }else{
                returning[0] = "Не существует";
            }
        }else {

            if (diskriminant > 0) {
                returning[0] = formateDouble((-b + Math.sqrt(diskriminant)) / (2 * a));
                returning[1] = formateDouble((-b - Math.sqrt(diskriminant)) / (2 * a));
            } else {
                if (diskriminant < 0) {
                    returning[0] = String.valueOf(-b / (2 * a)) + " + " +
                            formateDouble(Math.sqrt(-diskriminant) / (2 * a)) + "i";
                    returning[1] = String.valueOf(-b / (2 * a)) + " - " +
                            formateDouble(Math.sqrt(-diskriminant) / (2 * a)) + "i";
                } else {
                    returning = new String[1];
                    returning[0] = String.valueOf(-b / (2.0 * a));
                }
            }
        }
        return returning;
    }
}
