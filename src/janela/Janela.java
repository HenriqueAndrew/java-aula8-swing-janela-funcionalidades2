// //Aula 8 - Adicionando Funcionalidades a Menus utilizando Interface ActionListener
package janela;

import java.awt.FlowLayout; 
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Janela implements ActionListener {

private JMenuBar barMenu= new JMenuBar();
private JMenu menuGeral= new JMenu("Menu Geral");
private JMenu subMenuArq= new JMenu("Arquivo");
private JMenuItem ItemMenuAbr= new JMenuItem("abrir");
private JFrame janPrincipal= new JFrame("Colocando Menus e SubMenus");
private JTextField texto= new JTextField(30);
    
    public Janela(){
        janPrincipal.setSize(400,400);
        ItemMenuAbr.setMnemonic('a');
        subMenuArq.setMnemonic('A');
        subMenuArq.add(ItemMenuAbr);//addo ITEM de menu ABR ao SUBMENU ARQ
        menuGeral.setMnemonic('M');
        menuGeral.add(subMenuArq); //addSUBMENU ARQ (item ABR) ao MENU menuGeral
        barMenu.add(menuGeral); //addMENU menuGerala BARRA DE MENU barMenu
        janPrincipal.setJMenuBar(barMenu); //addBARRA DE MENU barMenuao JFramejanPrincipal
        janPrincipal.setLayout(new FlowLayout());
        janPrincipal.setVisible(true);
        ItemMenuAbr.addActionListener(this); //invocando o metodo ActionPerformed
    }
    
    public void actionPerformed(ActionEvent ativa){
        Object obj= ativa.getSource();
        
        if(obj.equals(ItemMenuAbr)){
        JOptionPane.showMessageDialog(janPrincipal,"Clicou no menu abrir");
        texto.setText("Não é dificil");
        janPrincipal.add(texto);
        janPrincipal.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Janela();
    }    
}
