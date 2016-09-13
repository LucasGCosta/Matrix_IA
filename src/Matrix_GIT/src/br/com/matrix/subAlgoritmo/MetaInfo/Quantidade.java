package br.com.matrix.subAlgoritmo.MetaInfo;

/**
 * Encapsulador de quantidade, define um alcance com um minimo e um m�ximo
 * 
 * @author GustavoHenrique
 *
 */
public interface Quantidade {
    
    /**
     * 
     * @return a quantidade m�nima definida nessa inst�ncia.
     */
    public Integer getMin();
    
    /**
     * 
     * @return a quantidade m�xima definida nessa inst�ncia.
     */
    public Integer getMax();
    
    /**
     *  
     * @param min a quantidade m�nima definida na nova inst�ncia.
     * @param max a quantidade m�xima definida na nova inst�ncia.
     * @return uma nova inst�ncia de quantidade.
     */
    public static Quantidade fabricarQt(Integer min, Integer max){
	return new Quantidade() {
	    
	    @Override
	    public Integer getMin() {
		return min;
	    }
	    
	    @Override
	    public Integer getMax() {
		return max;
	    }
	};
    }
}
