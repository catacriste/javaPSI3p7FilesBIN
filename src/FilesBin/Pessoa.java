package FilesBin;

public class Pessoa implements java.io.Serializable{ //Implementa na class Pessoa os m�todos da class Serializable que permitem 
	//Serializar todos os objetos da class Pessoa
	//Fazer as fun��es que utilizam os metodos de serializa��o e deserializa��o
	

    //Atributos ---------------------------
    //Sempre Privados
    private String nome;
    private String apelido;
    private String dataNascimento;
    private String morada;
    private int telefone;
    private long bi;
    private long nif;
    private long niss;

    private char sexo;
    //Construtores-------------------------
    //Nome do  construtor � sempre o nome da classe, os mesmos n�o devolvem nada
    // Pode haver v�rios desde que com assinaturas(tipo ou numero de paramentos existentes) diferentes
 
    public Pessoa(String name, String lastName)
    {
        nome = name;
        apelido = lastName;
    }
   
    
   public String dizOla()
    {
        return "Ol� eu sou  : " + nome + " " + apelido;

    }

    public String dizOla(String nome)
    {
        return "Ol� eu sou:" + nome + " " + apelido;

    }

    public String dizOlaAPessoa(Pessoa p)
    {
        return "Eu : " + nome + " " + apelido;

    }

    public String dizOlaAmigo(String nomeAmigo)
    {
        
        return "Ol� " + nomeAmigo + " Eu Sou " + nome + " " + apelido;

    }

    public String dizOlaAmigo(String... nomesAmigos)  // Tr�s pontos � o equivalente ao params do C#,
                                                            //de dados, desde que sejam todos do mesmo tipo independentemente de ser em lista de String ou array
    {
//        StringBuilder sb = new StringBuilder();
//        for (String s : nomesAmigos)
//        {
//            sb.append(s + ", ");
//        }
//		return  dizOlaAmigo(sb.toString());
        return dizOlaAmigo(String.join(", ", nomesAmigos));

    }



    public void dizOlaAmigo(Pessoa pr)
    {
        System.out.println("Ol� " + pr.getName() + " " + pr.getLastName() + " " + " Eu sou " + this.nome + " " + this.apelido );

    }
    // Devolvem algo ( Neste caso strings)
    //podem ser void e podem n�o conter parametros
    //Se tiverem retorno tem que seguir devidamente antes da vari�vel a palavra "Return"
    //S� pode retornar um dado caso o tipo de dado que est� definido no Construtor
    //M�todos-------------------------------

    // Sets
    

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }


    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }

    public void setBi(long bi)
    {
        this.bi = bi;
    }

    public void setNif(long nif)
    {
        this.nif = nif;
    }

    public void setNiss(long niss)
    {
        this.niss = niss;
    }

    // Gets
    public long getNiss()
    {
        return niss;
    }

    public long getNif()
    {
        return nif;
    }

    public long getBi()
    {
        return bi;
    }

    public int getTelefone()
    {
        return telefone;
    }

    public char getSexo()
    {
        return sexo;
    } 

    public String getMorada()
    {
        return morada;
    }

    public String getName()
    {
        return nome;
    }

    public String getLastName()
    {
        return apelido;
    }

    public String getDataN()
    {
        return dataNascimento;
    }



    //t�m return type. neste caso s�o strings
    //podem ser void e podem n�o ter par�metros de
    //entrada. se tiverem return type, t�m que ter
    //a key word RETURN no fim do m�todo, ou seja,
    //t�m que devolver um e um s� dado, do tipo que
    //est� definido no re
}
