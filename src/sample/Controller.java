package sample;
import java.util.ArrayList;
public class Controller {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Renan Quirino");
        pessoa.setCep("000.000.00");
        System.out.println(pessoa.obterInformacoes());


        ArrayList<String> informacoes = new ArrayList();
        informacoes.add("Renan");
        informacoes.add("000.000.00");
        informacoes.add("1454");
        informacoes.add("ap 502");
        informacoes.add("novo centro");
        informacoes.add("maringá");
        informacoes.add("paraná");
        informacoes.add("99916-0000");

        informacoes.set(0, "Renan Quirino");
        informacoes.remove(7);
        System.out.println(informacoes);
        informacoes.stream().forEach((item)->{
            System.out.println(item);
        });
        Macaco macaco = new Macaco();
        macaco.andar();
        macaco.comerBanana();
    }
}
