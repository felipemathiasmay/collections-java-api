package Sets.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Adiciona um convidado ao conjunto.
    public void adicionarConvidado(String name, int codInvite){
        this.convidadoSet.add(new Convidado(name, codInvite));
    }

    //Remove um convidado do conjunto com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codInvite){
        Convidado toRemove = null;

        for(Convidado convidado : convidadoSet){
            if(convidado.getCodInvite() == codInvite){
                toRemove = convidado;
                break;
            }
        }
        convidadoSet.remove(toRemove);
        System.out.println("Convidado removido: " + toRemove);
    }

    //Conta o número total de convidados no Set.
    public int contarConvidados(){
        return convidadoSet.size();
    }

    //Exibe todos os convidados do conjunto.
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
