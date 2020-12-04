package facade;

import models.Cpu;
import models.HardDrive;
import models.Memoria;

public class ComputadorFacade {

	private Cpu cpu;
	private Memoria memoria;
	private HardDrive hardDrive;

	public ComputadorFacade() {
		this.cpu = new Cpu();
		this.memoria = new Memoria();
		this.hardDrive = new HardDrive();
	}

	public void ligar() {

		cpu.start();
		hardDrive.read(12, 1024);
		memoria.load(512, "hdBootInfo");
		cpu.execute();
		memoria.free(512, "hdBootInfo");

	}

}