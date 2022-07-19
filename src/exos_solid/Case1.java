package exos_solid;

public class Case1 {
    public static void main(String[] args) {

    }
}


// 1. Commencer par critiquer le code écrit en mettant en avant les problèmes
// répétition de code : deux méthodes qui font la même chose
// code ouvert à la modification ( if else....)
// 2. Proposer une solution(dire ce que vous avez changé et les raisons du changement)
// une seule fonction
// des moyens de communication qui implémentent une méthode: pouvoir aller chercher la méthode sans connaître la classe

abstract interface IMedium {
    void message();
}

class email implements IMedium {

    @Override
    public void message() {
        System.out.println("write email related logic");
    }
}

class mobile implements IMedium {

    @Override
    public void message() {
        System.out.println("write SMS related logic");
    }
}

class whatsapp implements IMedium {

    @Override
    public void message() {
        System.out.println("write Whatsapp related logic");
    }
}

class BankServiceMessages {
    private IMedium medium;

    public void sendOTPOrTransactionReport(IMedium medium) {
        medium.message();
    }
}

class BankService{

    //    Effectuer un dépôt
    public double deposit(double amount,String accountNo){
        return 0;
    }

    //    Retirer de l'argent
    public double withdraw(double amount,String accountNo){
//        withdraw amount
        return 0;
    }

    //    Imprimer le relevé de compte Bancaire
    public void bankStatement(){

    }

    //    Envoyer une notification de OTP pour chaque type d'opération bancaire
//    Par email ou mobile ou whatsapp
    public void sendOTP(String medium){
        if(medium.equals("email")){
            // write email related logic
        }else if(medium.equals("mobile")){
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

    //    Envoyer une notification en guise de rapport pour chaque
//    Par email ou mobile ou whatsapp
    public void sendTransactionReport(String medium){
        if(medium.equals("email")){
            // write email related logic
        }else if(medium.equals("mobile")){
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

}
