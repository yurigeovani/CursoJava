package cursojava.basico.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Yuri");
//		contato.setEndereco("Messejana");
//		contato.setTelefone("85 9999 9999");
		
		//relacionamento tem um endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua I");
		end.setNumero("S/N");
		end.setComplemento("SEM COMP");
		end.setCidade("Fortaleza");
		end.setEstado("CE");
		end.setCep(60000000);
		
		contato.setEndereco(end);
		
		//relacionamento tem um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("85");
		telefone.setNumero("9999 9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("85");
		telefone2.setNumero("1234 4321");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		
//		contato.setTelefone(telefone);
		
//		if(contato != null && contato.getTelefone() != null) {
//			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
//			
//		}
		
		//Teste saída no console
		System.out.println(contato.getNome());
//		System.out.println(contato.getEndereco().getCidade());
//		System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco()!=null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if(contato != null && contato.getTelefones()!=null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		
		
	}

}
