package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon{
	@Override
	public void attack(){
		System.out.println("Tackle");
	}
	public Bulbasaur(String name, PokemonType type, int cp){
		super(name,type,cp);
	}
}