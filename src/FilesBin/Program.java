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
	
	/*Java fornece um mecanismo, serializa��o (serialization) que converte um qualquer objeto numa sequencia de Bits
	 * permitindo assim grav�-los um ficheiro bin�rio, incluindo os seus dados.
	 * O processo inverno chama-se deserialization e consiste em ler os bits do ficheiro e recriar o objeto em
	 * memoria, onde o poderemos usar normalmente.
	 * 
	 * Nota Importante :  O presente processo � a platform independent, ou seja, podemos serializar com o java e derializar
	 * com C#, ou qualquer plataforma (linguagem)
	 * 
	 * *Livrarias:
	 * 		java.io.FilesOutputStream  - para a abertura e manipula��o de files
	 * 		java.io.ObjectOutputStream - Cont�m os m�todos de serializa��o
	 * 		java.io.ObjectInputStream  - Cont�m os m�todos deSerializa��o
	 * 
	 * As observa��es seguintes t�m que ser acompanhadas da correspondente observa��o do c�digo
	 * A classe ObjectOutptStream tem o m�todo [void writeObject(Object X)]
	 * 	recebe um objeto qualquer, serializa-o e  escreve-o numa file bin�ria.
	 * 	Pode atirar uma exce��es: Se n�o encontrar o ficheiro - trows IOException
	 * 
	 * classe ObjectInputStream tem o m�todo  [Object readObject()]
	 * 	Faz a deSerializa��o a partir de um ficheiro e devolve um objeto do tipo Object que depois
	 * 	� necess�rio converter para o objeto pretendido atrav�s de um simples ca cast
	 * 	pode atrirar duas exce��es
	 * 		-Se n�o encontrar o ficheiro - trows IOException
	 * 		-Se n�o encontrar a calsse  - trows ClassNotFoundException
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
			System.out.println("Erro: Imposs�vel criar ou abrir o ficheiro:");
			i.printStackTrace(); //imprime o erro t�cnico
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
			System.out.println("Erro: Imposs�vel ler o ficheiro :");
			i.printStackTrace(); //imprime o erro t�cnico
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Objeto nao encontrado");
			return null;
		}
		
		
	}

}
