package ;

public class RandomFunctions {

    public int createAndGetTradeId(){
    System.out.println("trade 123 created");
    return 123;
    }

    public int createAndGetTransferId(){
        System.out.println("transfer 456 created");
        return 456;
    }

    public String createCounterParty(){
        System.out.println("Counterparty Cedric created");
        return "Cedric";
    }

    public Double doubleAmount(Double originalAmount){
        System.out.println("doubling "+originalAmount+" = "+originalAmount*2);
        return originalAmount*2;
    }



}
