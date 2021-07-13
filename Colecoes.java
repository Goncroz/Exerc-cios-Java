package Lucas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) 
	{
		List<String> meuEstoque = new ArrayList<String>();
		
		meuEstoque.add("fordKa");
		meuEstoque.add("ranger");
		meuEstoque.add("fiesta");
		meuEstoque.add("ecoSport");
		meuEstoque.add("focus");
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\n(1) Deseja adicionar um modelo de carro ao estoque");
			System.out.println("\n(2) Deseja remover um modelo de carro do estoque");
			System.out.println("\n(3) Deseja atualizar o estoque");
			System.out.println("\n(4) Deseja ver todos os produtos do estoque");
			System.out.println("\n(0) Encerrar o programa");
			
			
			System.out.println("\n***************************************************");
			System.out.println("\nDigite sua opção:");
			System.out.println("\n***************************************************");
			op = leia.nextInt();
			
			switch (op)
			{
				case 1:
					leia.nextLine();
					System.out.println("Digite o modelo que quer adicionar ao estoque: ");
					String carro1 = leia.nextLine();
					meuEstoque.add(carro1);
					break;
					
				case 2:
					leia.nextLine();
					System.out.println("Digite o modelo que quer remover do estoque: ");
					String carro2 = leia.nextLine();
					if(meuEstoque.contains(carro2))
					{
						meuEstoque.remove(carro2);
					}
					else
					{
						System.out.println("\nEste modelo ainda não existe em nosso estoque");
					}
					System.out.println(meuEstoque);
					break;
					
				case 3:
					leia.nextLine();
					System.out.println("\n Digite qual modelo deseja atualizar");
					String carro3 = leia.nextLine();
					System.out.println("\nDigite o modelo que entrará no lugar de "+carro3);
					String carro6 = leia.nextLine();
					if(meuEstoque.contains(carro3))
					{
						meuEstoque.remove(carro3);
						meuEstoque.add(carro6);
					}
					else
					{
						System.out.println("\nEste modelo ainda não existe em nosso estoque");
					}
					System.out.println(meuEstoque);
					break;
				case 4:
					leia.nextLine();
					System.out.println("\nOs modelos em estoque são:");
					System.out.println(meuEstoque);
					break;
					default:
					System.out.println("\nPrograma Finalizado");
			}
			
			
		}
		while (op != 0);
	}
}
		
