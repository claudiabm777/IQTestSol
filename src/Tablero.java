import java.util.*;


public class Tablero {
	//public static int ids=0;
	public Set<Integer>llenos;
	public Set<Integer>vacios;
	
	public List<Tupla>tuplas;
	public Tablero padre;
	public List<Arco>adj;
	public String nombre;
	public Integer id=0;
	public Tablero(){
		
		llenos=new HashSet<Integer>();
		vacios=new HashSet<Integer>();
		tuplas=new ArrayList<Tupla>();
		adj=new ArrayList<Arco>();
		nombre="";//this.toString();

	}
	@Override
	public String toString() {
		String f1="";
		for(int i=1;i<16;i++){
			if(llenos.contains(i)){
				f1+="x"+i+":";
			}
			else{
				f1+="0"+i+":";
			}
		}
		String respuesta="";
		String[]splits=f1.split(":");
		for(int i=0;i<splits.length;i++){
			String s=splits[i];
			respuesta+=s.substring(0, 1);
			if(i==0||i==2||i==5||i==9){
				respuesta+="\n";
			}
			
		}
		return respuesta;
		
	}
	
}
