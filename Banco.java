public class Banco {
    public static void main(String[] args){
        // dinero en la cuenta
        final int moneyBank = 1000;
        //dinero que se retira cada semana 
        final int moneyWithdraw = 200;
        // dinero que se retira al mes
        int monthlyWithdrawal = moneyWithdraw * 4;
        System.out.println("dinero que se retira al mes: " + monthlyWithdrawal);
        // dinero que a final del mes queda en la cuenta
        int leftoverMoney = moneyBank - monthlyWithdrawal ;
        System.out.println("dinero que queda en la cuenta a final de mes: "  + leftoverMoney);
    }
}
