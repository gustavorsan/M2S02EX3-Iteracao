import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //declarações
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
        String msg = "";
        String extratoOrdem = "";
        int indexInverso;
        String extratoInverso = "";
        float saldo = 0;
        String msgSaldo = "";

        //iteração
        for(int i = 0; i < extrato.length; i++){
            //define o extrato na ordem
            extratoOrdem = extratoOrdem.concat(extrato[i]+"; ");
            //define o extrato na ordem inversa
            indexInverso = extrato.length - (i+1);
            extratoInverso = extratoInverso.concat(extrato[indexInverso]+"; ");
            //alimenta o saldo
            saldo += extrato[i];
        }
        //define a mensagem do saldo
        msgSaldo = saldo > 0 ? "saldo positivo" : "saldo negativo";

        //alimenta a mensagem final
        //substring remove o ultimo caracter de uma string
        msg = msg.concat("Extrato na ordem: "+extratoOrdem.substring(0,extratoOrdem.length()-1));
        msg = msg.concat("\nExtrato na inverso: "+extratoInverso.substring(0,extratoInverso.length()-1));
        //mensagem saldo
        msg = msg.concat("\nSaldo: "+saldo+" "+msgSaldo);




        JOptionPane.showMessageDialog(null, msg);
    }
}