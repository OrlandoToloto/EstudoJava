package Testes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex98_Listas {
//esse programa tem alguns erros, ele n aparece a linha 40 result caso queira testar apague os anteriores
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("nando");
		list.add("Maria");
		list.add("Fernanda");
		list.add("Marcos");
		list.add("Kvoth");

		list.add(2, "thamirys");// adiciona elemento na lista

		System.out.println(list.size()); // fala o tamanho da lista

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		list.remove(1);// remove elemento da lista, aqui poderia ter colocado tbm Maria diretamente q
		// tbm seria removido
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // será removido todos os elementos q iniciarem com a letra M
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		System.out.println("Index of nando: " + list.indexOf("nando")); // revela a posição do elemento
		System.out.println("Index of zumbi: " + list.indexOf("zumbi")); // quando se pede um elemento n existente ele
																		// retorna -1
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		// ele ira escrever os nomes q começão com a letra M
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'n').findFirst().orElse(null);
		// encontra um elemento de acordo com o predicado
		System.out.println(name);
	}
}
