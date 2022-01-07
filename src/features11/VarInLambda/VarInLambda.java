package features11.VarInLambda;

import java.util.List;

public class VarInLambda {

    public static void main(String[] args) {

        List<Integer> lista = List.of(1,2,3,4);

        //Um benefício da uniformidade é que os modificadores, notadamente anotações,
        // podem ser aplicados a variáveis locais e formais de lambda sem perder a brevidade:
        lista.forEach(
                (var e) -> System.out.println(e)
        );

    }
}
