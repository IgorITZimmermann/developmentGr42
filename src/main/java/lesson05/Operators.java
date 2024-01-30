package lesson05;

public class Operators {

    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 10;

        //Оператор равенства ==
        boolean isEqual = (numberOne == numberTwo);
        System.out.println(isEqual);

        int numberThree = 50;
        int numberFour = 60;
        //Оператор неравенства !=
        System.out.println(numberThree != numberFour);

        //Оператор больше >
        System.out.println(numberThree > numberFour);

        //Оператор меньше <
        System.out.println(numberThree < numberFour);

        //Оператор больше или равно >=
        System.out.println(numberOne >= numberTwo);

        //Оператор меньше или равно <=
        System.out.println(numberOne <= numberTwo);

        String nameOne = "Mustermann";
        String nameTwo = "Mustermann";
        boolean isEqualNameOneNameTwo = nameOne.equals(nameTwo);
        System.out.println(isEqualNameOneNameTwo);


        /*
        AND &&
        false && false --> false
        false && true  --> false
        true && false --> false
        true && true --> true
         */

        /*
        OR ||
        false || false --> false
        false || true --> true
        true || false --> true
        true || true --> true
         */


        int age = 20;
        int salary = 10000;
        boolean hasPass = true;

        boolean hasCredit;
        //Bank1
        if (age >= 21 && salary > 2000)
        {
            System.out.println("Positiv");
            hasCredit = true;
        }
        else {
            System.out.println("Negativ");
            hasCredit = false;
        }

        System.out.println("Credit:" + hasCredit);

        //Bank2
        if (age >= 21 || salary > 3000) {
            hasCredit = true;
        } else {
            hasCredit = false;
        }
        System.out.println("Credit 2: " + hasCredit);


        int numberA = 40;
        int numberB = 20;
        boolean checkResult = false;
        if(numberA > 10 || numberB > 15){ //false || true --> true
            checkResult = true;
        }
        if(numberA > 10 && numberB > 15){//false && true --> false
            checkResult = false;
        }

        System.out.println("checkResult-->" + checkResult);

        double accountBalance = 2000000;
        boolean accountActive = false;
        double amountToWithdraw = 6000.0;
        boolean transactionSuccess;
            // false                                            || true
        if(accountActive && accountBalance >= amountToWithdraw  || accountBalance >= 1000000 ){
            accountBalance = accountBalance - amountToWithdraw;
            transactionSuccess = true;
            System.out.println("Transaction: " + transactionSuccess + " Balance: " + accountBalance);
        }
        else {
            transactionSuccess = false;
            System.out.println("ERROR!!!" +  transactionSuccess);
            System.out.println("Transaction: " + transactionSuccess + " Balance: " + accountBalance);
        }
        System.out.println(transactionSuccess);

    }
}
