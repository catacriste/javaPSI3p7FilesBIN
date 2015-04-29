package FilesBin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {

	/**
	 * @param args
	 */
	
	/*Java fornece um mecanismo, serialização (serialization) que converte um qualquer objeto numa sequencia de Bits
	 * permitindo assim gravá-los um ficheiro binário, incluindo os seus dados.
	 * O processo inverno chama-se deserialization e consiste em ler os bits do ficheiro e recriar o objeto em
	 * memoria, onde o poderemos usar normalmente.
	 * 
	 * Nota Importante :  O presente processo é a platform independent, ou seja, podemos serializar com o java e derializar
	 * com C#, ou qualquer plataforma (linguagem)
	 * 
	 * *Livrarias:
	 * 		java.io.FilesOutputStream  - para a abertura e manipulação de files
	 * 		java.io.ObjectOutputStream - Contém os métodos de serialização
	 * 		java.io.ObjectInputStream  - Contém os métodos deSerialização
	 * 
	 * As observações seguintes têm que ser acompanhadas da correspondente observação do código
	 * A classe ObjectOutptStream tem o método [void writeObject(Object X)]
	 * 	recebe um objeto qualquer, serializa-o e  escreve-o numa file binária.
	 * 	Pode atirar uma exceções: Se não encontrar o ficheiro - trows IOException
	 * 
	 * classe ObjectInputStream tem o método  [Object readObject()]
	 * 	Faz a deSerialização a partir de um ficheiro e devolve um objeto do tipo Object que depois
	 * 	é necessário converter para o objeto pretendido através de um simples ca cast
	 * 	pode atrirar duas exceções
	 * 		-Se não encontrar o ficheiro - trows IOException
	 * 		-Se não encontrar a calsse  - trows ClassNotFoundException
	 * 
	 *
	 */
	 /*
	 */
	public static void main(String[] args) {
		
		String fileAndLocation = "C:\\Users\\a46485\\Desktop\\backup.bin";
		Pessoa p1 = new Pessoa("Catalin", "Criste");
		serializador(fileAndLocation, p1);
		
		Pessoa p2 = (Pessoa)desSerializar(fileAndLocation);
		// TODO Auto-generated method stub

	}
	
	public static void serializador(String fileLocation, Object obj)
	{
		try 
		{
			FileOutputStream fileOut = new FileOutputStream(fileLocation);
			ObjectOutputStream serialize = new ObjectOutputStream(fileOut);
			
			serialize.writeObject(obj);
			serialize.close();
			fileOut.close();
			System.out.println("Serializado para " + fileLocation);
			
		}catch (IOException i) 
		{
			System.out.println("Erro: Impossível criar ou abrir o ficheiro:");
			i.printStackTrace(); //imprime o erro técnico
		}
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	public static Object desSerializar(String fileLocation)
	{
		try 
		{
			FileInputStream fileIn = new FileInputStream(fileLocation);
			ObjectInputStream deSerialize = new ObjectInputStream(fileIn);
			Object obj = deSerialize.readObject();
			
			deSerialize.close();
			fileIn.close();
			
			return obj;
			
		}
		catch (IOException i) 
		{
			System.out.println("Erro: Impossível ler o ficheiro :");
			i.printStackTrace(); //imprime o erro técnico
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Objeto nao encontrado");
			return null;
		}
		
		
	}

}
