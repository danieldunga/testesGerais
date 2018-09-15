package ordenacao;

import java.util.Arrays;
import java.util.Date;

public class TesteOrdena {
	private OrdenaVO[] vo;

	public TesteOrdena(){
		vo = new OrdenaVO[5];
		
		vo[0] = new OrdenaVO();
		vo[0].setNumero(2);
		vo[0].setTexto("Dois");
		vo[0].setData(new Date(72,2,2));
		
		vo[1] = new OrdenaVO();
		vo[1].setNumero(4);
		vo[1].setTexto("Quatro");
		vo[1].setData(new Date(74,4,4));
		
		vo[2] = new OrdenaVO();
		vo[2].setNumero(1);
		vo[2].setTexto("Um");
		vo[2].setData(new Date(72,2,10));
		
		vo[3] = new OrdenaVO();
		vo[3].setNumero(3);
		vo[3].setTexto("Três");
		vo[3].setData(new Date(73,3,3));
		
		vo[4] = new OrdenaVO();
		vo[4].setNumero(5);
		vo[4].setTexto("Cinco");
		vo[4].setData(new Date(75,5,5));
		
		for (int i = 0; i < vo.length; i++) {
			vo[i].setOrdem(OrdenaVO.ASC);
		}
		
		for (int i = 0; i < vo.length; i++) {
			vo[i].setCampo(OrdenaVO.DATA);
		}
		
		Arrays.sort(vo);
		
		for (int i = 0; i < vo.length; i++) {
			System.out.println(vo[i].getNumero()+"\t"+vo[i].getTexto()+"\t"+vo[i].getData().getDate()+"/"+vo[i].getData().getMonth()+"/"+vo[i].getData().getYear());
		}
	}
	
	public static void main(String[] args) {
		new TesteOrdena();
	}
}
