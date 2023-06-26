import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        MaskFormatter mascaraCpf = null;
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        JFormattedTextField cpf = new JFormattedTextField(mascaraCpf);

        MaskFormatter mascaraTel = new MaskFormatter("##.#-########");
        JFormattedTextField tel = new JFormattedTextField(mascaraTel);


        JOptionPane.showMessageDialog(null, "Entre com os Dados do cliente:");
        String name = JOptionPane.showInputDialog("Nome: ");
        cpf.setValue(null);
        JOptionPane.showMessageDialog(null, cpf, "CPF: ", JOptionPane.QUESTION_MESSAGE);
        String entradaCpf = cpf.getText();
        JOptionPane.showMessageDialog(null, tel, "TElefone: ", JOptionPane.QUESTION_MESSAGE);
        String entradaTel = tel.getText();
        JOptionPane.showMessageDialog(null, "Entre com os Dados do carro:");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String placa = JOptionPane.showInputDialog("Placa: ");
        String ano = JOptionPane.showInputDialog("ANo: ");
        String dataLoc = JOptionPane.showInputDialog("Data Locação: ");
        String dataEnt = JOptionPane.showInputDialog("Data Entrega: ");
        JOptionPane.showMessageDialog(null, "Aluguel realizado com sucesso! ");



    }
}