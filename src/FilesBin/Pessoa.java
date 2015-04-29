package FilesBin;

public class Pessoa implements java.io.Serializable{ //Implementa na class Pessoa os métodos da class Serializable que permitem 
	//Serializar todos os objetos da class Pessoa
	//Fazer as funções que utilizam os metodos de serialização e deserialização
	

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
    //Nome do  construtor é sempre o nome da classe, os mesmos não devolvem nada
    // Pode haver vários desde que com assinaturas(tipo ou numero de paramentos existentes) diferentes
 
    public Pessoa(String name, String lastName)
    {
        nome = name;
        apelido = lastName;
    }
   
    
   public String dizOla()
    {
        return "Olá eu sou  : " + nome + " " + apelido;

    }

    public String dizOla(String nome)
    {
        return "Olá eu sou:" + nome + " " + apelido;

    }

    public String dizOlaAPessoa(Pessoa p)
    {
        return "Eu : " + nome + " " + apelido;

    }

    public String dizOlaAmigo(String nomeAmigo)
    {
        
        return "Olá " + nomeAmigo + " Eu Sou " + nome + " " + apelido;

    }

    public String dizOlaAmigo(String... nomesAmigos)  // TrÊs pontos é o equivalente ao params do C#,
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
        System.out.println("Olá " + pr.getName() + " " + pr.getLastName() + " " + " Eu sou " + this.nome + " " + this.apelido );

    }
    // Devolvem algo ( Neste caso strings)
    //podem ser void e podem não conter parametros
    //Se tiverem retorno tem que seguir devidamente antes da variável a palavra "Return"
    //Só pode retornar um dado caso o tipo de dado que está definido no Construtor
    //Métodos-------------------------------

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



    //têm return type. neste caso são strings
    //podem ser void e podem não ter parâmetros de
    //entrada. se tiverem return type, têm que ter
    //a key word RETURN no fim do método, ou seja,
    //têm que devolver um e um só dado, do tipo que
    //está definido no re
}
