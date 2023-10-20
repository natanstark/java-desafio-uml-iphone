package desafioClassesIphone.iphone;

import java.util.InputMismatchException;
import java.util.Scanner;

import desafioClassesIphone.navegadorInternet.NavegadorInternet;
import desafioClassesIphone.reprodutorMusical.ReprodutorMusical;
import desafioClassesIphone.telefone.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone{
	
	public static void main(String[] args) {
		
		try {
		
		
		//cria objeto iphone
	    Iphone iphone = new Iphone();
	        
	        
	        while (true) {
	            System.out.println("Qual operação você deseja fazer?");
	            System.out.println("1 - Fazer uma chamada");
	            System.out.println("2 - Atender uma chamada");
	            System.out.println("3 - Tocar música");
	            System.out.println("4 - Abrir nova aba");
	            System.out.println("5 - Pesquisar no Google");
	            System.out.println("6 - Sair");
	            
	          //cria scanner do terminal
	    		Scanner terminalInput = new Scanner(System.in);
	    		
	            int escolha = terminalInput.nextInt();
	            
	            

	            switch (escolha) {
	                case 1:
	                    System.out.println(iphone.fazerChamada());
	                    break;
	                case 2:
	                    System.out.println(iphone.atenderChamada());
	                    break;
	                case 3:
	                    System.out.println(iphone.tocarMusica());
	                    break;
	                case 4:
	                    System.out.println(iphone.novaAba());
	                    break;
	                case 5:
	                    System.out.println(iphone.pesquisar());
	                    break;
	                case 6:
	                    System.out.println("Saindo...");
	                    terminalInput.close();
	                    return;
	                default:
	                    System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 6.");
	            }
	        }
	        
		} catch (InputMismatchException e){
			System.out.println("Neste campo utilize apenas digitos");
		}
            
	        
     
		
	}
		

	//métodos implementados
	
		public String fazerChamada() {
			return "Fazendo chamada...";
			
		}

		
		public String atenderChamada() {
			return "Atendendo chamada...";
			
		}

		
		public String tocarMusica() {
			return "Tocando música...";			
		}

		
		public String novaAba() {
			return "Abrindo nova aba...";
			
		}

		
		public String pesquisar() {
			return "Pesquisando no Google...";
		}
	}
		
		