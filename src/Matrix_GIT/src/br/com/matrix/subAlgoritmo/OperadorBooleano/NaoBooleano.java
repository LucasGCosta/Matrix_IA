package br.com.matrix.subAlgoritmo.OperadorBooleano;

import java.util.ArrayList;
import java.util.List;

import br.com.matrix.subAlgoritmo.MetaInfo.MetaInfo;
import br.com.matrix.subAlgoritmo.MetaInfo.MetaInfoAssinatura;
import br.com.matrix.subAlgoritmo.MetaInfo.Quantidade;
import br.com.matrix.subAlgoritmo.MetaInfo.Tipo;

/**
 * Operador booleano nega��o.
 * <br>
 * <code>!arg0</code>
 * 
 * @author GustavoHenrique
 *
 */
public class NaoBooleano extends OperadorBooleano {
    
    public NaoBooleano() {
	super(getParam());
	
    }

    @Override
    public void executar() {
	paramEntrada.get(0).executar();
	result = !(Boolean) paramEntrada.get(0).retornar();
    }
    
    private static List<MetaInfoAssinatura> getParam(){
	List<MetaInfoAssinatura> l = new ArrayList<MetaInfoAssinatura>(1);    
	l.add(MetaInfo.fabricarAssinatura(Tipo.TP_BOOLEANO, Quantidade.fabricarQt(1, 1)));
	return l;
    }
}
