public class Acai {
	int tamanho;
	double valor;
	boolean acrescimo;

	public Acai(int tamanho, boolean acrescimo) {
		this.tamanho = tamanho;
		this.acrescimo = acrescimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	boolean setAcrescimoFinal(String acrescimoResposta){
		if (acrescimoResposta.equals("S")){
			this.acrescimo = true;

		}
		else {
			this.acrescimo = false;


		}
		return acrescimo;
	}

	public boolean getAcrescimo(){
		return acrescimo;

	}


	double valorAcai(){
		int tamanhoAcai = getTamanho();

		boolean temAcrescimo = getAcrescimo();
		if (temAcrescimo){
			valor += 2;
	}
		if (tamanhoAcai==1){
			valor += 8.00;
		} else if (tamanhoAcai==2) {
			valor += 10.00;

		} else if (tamanhoAcai==3) {
			valor += 12;

		}
		return valor;
	}

}
