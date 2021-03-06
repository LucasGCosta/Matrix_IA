package br.com.matrix.subAlgoritmo.OperadorBooleano;

import java.util.ArrayList;
import java.util.List;

import br.com.matrix.subAlgoritmo.MetaInfo.MetaInfo;
import br.com.matrix.subAlgoritmo.MetaInfo.MetaInfoAssinatura;
import br.com.matrix.subAlgoritmo.MetaInfo.Quantidade;
import br.com.matrix.subAlgoritmo.MetaInfo.Tipo;


/**
 * Operador booleano de soma exclusica. <br>
 * <code>
 * 	(arg0[0] && !arg0[1]) || (!arg0[0] && arg0[1])
 * </code>
 * 
 * @author GustavoHenrique
 *
 */
public class OuExclusivoBooleano extends OperadorBooleano {

    public OuExclusivoBooleano() {
	super(getParam());

    }

    @Override
    public void executar() {
	paramEntrada.get(0).executar();
	paramEntrada.get(1).executar();
	result = !((Boolean)paramEntrada.get(0).retornar()).equals((Boolean)paramEntrada.get(1).retornar());
    }

    private static List<MetaInfoAssinatura> getParam() {
	List<MetaInfoAssinatura> l = new ArrayList<MetaInfoAssinatura>(1);
	l.add(MetaInfo.fabricarAssinatura(Tipo.TP_BOOLEANO, Quantidade.fabricarQt(2, 2)));
	return l;
    }
}
