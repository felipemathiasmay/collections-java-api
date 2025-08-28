package Sets.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.Objects;

public class Convidado {

    private String name;
    private int codInvite;

    public Convidado() {
    }

    public Convidado(String name, int codInvite) {
        this.name = name;
        this.codInvite = codInvite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodInvite() {
        return codInvite;
    }

    public void setCodInvite(int codInvite) {
        this.codInvite = codInvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codInvite=" + codInvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codInvite == convidado.codInvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codInvite);
    }
}

