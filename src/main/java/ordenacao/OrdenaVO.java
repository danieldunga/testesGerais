package ordenacao;

import java.util.Date;

public class OrdenaVO implements Comparable {

	
	//Constantes
		public final static int ASC = 0;
		public final static int DESC = 1;
		public final static int NUMERO = 0;
		public final static int TEXTO = 1;
		public final static int DATA = 2;
		
		
		private final static int MAIOR = 1;
		private final static int MENOR = -1;
		private static int CAMPO = 0;
		private static int ORDEM = 0;
		
		//Atributos
		private int numero;
		private String texto;
		private Date data;
		
		
		
		/**
		 * @return Returns the data.
		 */
		public Date getData() {
			return data;
		}
		/**
		 * @param data The data to set.
		 */
		public void setData(Date data) {
			this.data = data;
		}
		/**
		 * @return Returns the numero.
		 */
		public int getNumero() {
			return numero;
		}
		/**
		 * @param numero The numero to set.
		 */
		public void setNumero(int numero) {
			this.numero = numero;
		}
		/**
		 * @return Returns the texto.
		 */
		public String getTexto() {
			return texto;
		}
		/**
		 * @param texto The texto to set.
		 */
		public void setTexto(String texto) {
			this.texto = texto;
		}
		
		

		public int compareTo(Object o) {
			int retorno = 0;
			
			if(o != null){
				if (o instanceof OrdenaVO){
					OrdenaVO obj = (OrdenaVO) o;
					
					if(CAMPO == NUMERO){
						if (this.numero > obj.getNumero()){
							retorno =MAIOR;
						}else{
							retorno = MENOR;
						}
					}else if (CAMPO == TEXTO){
						retorno = this.texto.compareToIgnoreCase(obj.getTexto());
					} else if (CAMPO == DATA){
						retorno = this.data.compareTo(obj.getData());
					}
					
				}
			}

			if (ORDEM == ASC){
				return retorno;
			} else {
				return -retorno;	
			}
		}
		
		public void setOrdem (int ordem){
			if(ordem >= 0 && ordem<= 1){
				ORDEM = ordem;
			}
			
		}
		
		public void setCampo (int campo){
			if(campo >= 0 && campo <=2){
				CAMPO = campo;
			}
		}
		
		private int ordena(int campo){
			int retorno = 0;
			
			
			
			return retorno;
		}

}
