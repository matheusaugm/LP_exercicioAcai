import javax.swing.*;

public class PontoAcai {
	public static void main(String[] args) {
		int tamanhoAcai = Integer.parseInt(JOptionPane.showInputDialog("1. Informe o tamanho do Acaí desejado\n1.Tamanho = 300 => Valor R$ 8,00\n2.Tamanho = 500 => Valor R$ 10,00\n3.Tamanho = 700 => Valor R$ 12,00"));
		Acai acaizao = new Acai(tamanhoAcai, false);
		String temAcrescimo = JOptionPane.showInputDialog("Haverá acrescimo de sorvete? S- Sim N- Não").toUpperCase();
		acaizao.setAcrescimoFinal(temAcrescimo);
		double valorFinalAcai = acaizao.valorAcai();
		JOptionPane.showMessageDialog(null,"O seu acaí ficou no valor de: R$"+valorFinalAcai);
	}
}
