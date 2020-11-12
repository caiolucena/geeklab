package main;

import java.util.ArrayList;
import java.util.Random;

import app.App;
import controller.UserController;
import database.InMemoryConnection;
import database.InMemoryDatabase;
import examples.EagerSingleton;
import examples.LazyAndSafeSingleton;
import examples.LazySingleton;
import examples.StaticBlockSingleton;
import model.User;
import repository.UserRepository;
import service.UserService;

public class Main {

	public static void main(String[] args) {
//		testExamples();
		
		awesomeCrud();
		
//		isReallySingleton();
		
	}
	
	public static void testExamples() {
		
		System.out.println("Lazy Singleton in a nushell.");
		LazySingleton.getInstance().showYourself();
		System.out.println("Lazy And Safe Singleton in a nushell.");
		LazyAndSafeSingleton.getInstance().showYourself();
		System.out.println("Eager Singleton in a nushell.");
		EagerSingleton.getInstance().showYourself();
		System.out.println("Static Block Singleton in a nushell.");
		StaticBlockSingleton.getInstance().showYourself();
	}
	
	public static void awesomeCrud() {
		App app = new App();
		
		UserController controller = app.getUserController();
		
		System.out.println("Preparando para fazer a operação de CRUD na app...\n");
		await(2000);
		
		/*Create user*/
		
		User userOne = new User("1", "Jose Carlos", 23, "Jogador de Futebol");
		User userTwo = new User("2", "Carlos Jose", 32, "Medico");
		System.out.println("Preparando para criar dois usuários: " + userOne.getName() + " e " + userTwo.getName() + "...");
		await(1000);
		
		User createUserOne = controller.create(userOne);
		User createUserTwo = controller.create(userTwo);
		await(1000);
		
		System.out.println("Os usuários foram criados com sucesso! "+ createUserOne.getName() + " possui o id "+ createUserOne.getId() +
				" e " + createUserTwo.getName()  + " possui o id " + createUserTwo.getId() + ".\n");
		await(1000);
		
		/*Get all users*/
		System.out.println("Preparando para recuperar a lista de usuários...");
		ArrayList<User> getAllUsers = controller.getAll();
		await(1000);
		System.out.println("Foram recuperados "+ getAllUsers.size() + " usuários.\n");		
		await(1000);

		/*Get a single user by id*/
		System.out.println("Preparando para pegar o usuário com id 1...");
		User getUserOne = controller.getById(createUserOne.getId());
		await(1000);
		
		System.out.println("WubaDubaLubLub! Recuperei o usuário com id 1, ele se chama "+ getUserOne.getName()+ "!\n");
		await(1000);

		/*Update user*/
		System.out.println("Preparando para atualizar a idade do usuário com id 2. Atualmente, ele tem " + createUserTwo.getAge() + " anos e será atualizado para um número aleatório entre a 0 e 100.");
		
		createUserTwo.setAge(new Random().nextInt(100));
		User updateUserTwo = controller.update(createUserTwo);
		await(1000);
		
		System.out.println("WubaDubaLubLub! Atualizei o usuário com id 2, ele agora tem "+ updateUserTwo.getAge()+ " anos!\n");
		await(1000);
		
		/*Delete user*/
		System.out.println("Preparando para remover o usuário com id 2...");
		
		boolean isDeletedUserTwo = controller.delete(updateUserTwo.getId());
		await(1000);
		
		System.out.println("Será que o usuário foi deletado? Segundo a resposta do controller, ele " + (isDeletedUserTwo == true ? "foi deletado com sucesso." : "não foi deletado."));		
		await(1000);
		
		System.out.println("De qualquer forma, vamos conferir recuperando todos os usuários. O resultado deverá ser apenas um usuário na lista...\n");
		await(1000);
		ArrayList<User> getAllUsersAgain = controller.getAll();
		await(1000);
		System.out.println("WubaDubaLubLub! Foi recuperado apenas "+ getAllUsersAgain.size() + " usuário!\n");		
	}
	
	public static void isReallySingleton() {
		System.out.println("As 1..n instancias do UserService, UserRepository, InMemoryDatabase e InMemoryConnection devem ser singletons. ");
		System.out.println("Isso significa que 1..n instancias de cada uma dessas classes devem estar alocadas no mesmo endereco de memoria.\n\n");
		
		/* UserService instances */
		UserService userServiceInstanceOne = UserService.getInstance(); 
		UserService userServiceInstanceTwo = UserService.getInstance();
		
		System.out.println("Eu sou a instancia um do UserService e estou alocado em: " + userServiceInstanceOne);
		System.out.println("Ja eu sou a instancia dois do UserService e estou alocado em: " + userServiceInstanceTwo);
		System.out.println("\n");
		
		/* UserRepository instances */
		UserRepository userRepositoryInstanceOne = UserRepository.getInstance();
		UserRepository userRepositoryInstanceTwo = UserRepository.getInstance();
		
		System.out.println("Eu sou a instancia um do UserRepository e estou alocado em: " + userRepositoryInstanceOne);
		System.out.println("Ja eu sou a instancia dois do UserRepository e estou alocado em: " + userRepositoryInstanceTwo);
		System.out.println("\n");
		
		/* InMemoryDatabase instances */
		InMemoryDatabase inMemoryDatabaseInstanceOne = InMemoryDatabase.getInstance();
		InMemoryDatabase inMemoryDatabaseInstanceTwo = InMemoryDatabase.getInstance();
		
		System.out.println("Eu sou a instancia um do InMemoryDatabase e estou alocado em: " + inMemoryDatabaseInstanceOne);
		System.out.println("Ja eu sou a instancia dois do InMemoryDatabase e estou alocado em: " + inMemoryDatabaseInstanceTwo);
		System.out.println("\n");
		
		/* InMemoryConnection instances */
		InMemoryConnection inMemoryConnectionInstanceOne = InMemoryConnection.getInstance();
		InMemoryConnection inMemoryConnectionInstanceTwo = InMemoryConnection.getInstance();
		
		System.out.println("Eu sou a instancia um do InMemoryConnection e estou alocado em: " + inMemoryConnectionInstanceOne);
		System.out.println("Ja eu sou a instancia dois do InMemoryConnection e estou alocado em: " + inMemoryConnectionInstanceTwo);
		System.out.println("\n");
		
		System.out.println("Agora, as 1..n instancias do UserController e do UserModel não devem ser singletons. ");
		System.out.println("Isso significa que 1..n instancias de cada uma dessas classes devem estar alocadas em diferentes enderecos de memoria.\n\n");
		
		/* UserController instances */
		UserController userControllerInstanceOne = new UserController();
		UserController userControllerInstanceTwo = new UserController();
		
		System.out.println("Eu sou a instancia um do User e estou alocado em: " + userControllerInstanceOne);
		System.out.println("Ja eu sou a instancia dois do User e estou alocado em: " + userControllerInstanceTwo);
		System.out.println("\n");
		
		/* User instances */
		User userInstanceOne = new User("1", "Jose Carlos", 23, "Jogador de Futebol");
		User userInstanceTwo = new User("2", "Carlos Jose", 32, "Medico");
		
		System.out.println("Eu sou a instancia um do User e estou alocado em: " + userInstanceOne);
		System.out.println("Ja eu sou a instancia dois do User e estou alocado em: " + userInstanceTwo);
		System.out.println("\n");
	}
	
	public static void await(int time) {
		try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
	}
}
