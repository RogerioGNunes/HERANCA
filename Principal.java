public class Principal{

public static void main(String args[]){

    Funcionario f=new Funcionario();

    f.setNome("Rogério");
    f.setCpf("123.456.789-01");
    f.setSalario(19231);
    f.setDepartamento("Tecnologia");
    
    System.out.println("O nome do funcionário é "+f.getNome());
    System.out.println("CPF número "+f.getCpf());
    System.out.println("Seu salário é de "+f.getSalario());
    System.out.println("Sua bonificação é de "+f.bonificacao());
    System.out.println("Atual funcionário do departamento de "+f.getDepartamento());


    }

}