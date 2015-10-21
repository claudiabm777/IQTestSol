
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import DIKBD.DIKBD;
import DIKBD.DIKBD_Graph;
import DIKBD.DIKBD_Vertex;


public class Principal {
	public  HashMap<Integer,Bolita>bolitas=new HashMap<Integer,Bolita>();
	public  HashMap<Tupla,Integer>tup=new HashMap<Tupla,Integer>();
	public List<Tablero>nodosT=new ArrayList<Tablero>();
	public List<Arco>arcos=new ArrayList<Arco>();
	public Tablero inic;
	public Principal(){
		//1
		Bolita b=new Bolita();
		b.valor=1;
		Tupla t=new Tupla();
		t.val1=2;
		t.val2=4;
		b.tuplas.add(t);
		tup.put(t, b.valor);
		Tupla t1=new Tupla();
		t1.val1=3;
		t1.val2=6;
		b.tuplas.add(t1);
		tup.put(t1, b.valor);
		bolitas.put(b.valor, b);
		
		//2
		Bolita b2=new Bolita();
		b2.valor=2;
		t=new Tupla();
		t.val1=4;
		t.val2=7;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=5;
		t1.val2=9;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		//3
		b2=new Bolita();
		b2.valor=3;
		t=new Tupla();
		t.val1=5;
		t.val2=8;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=6;
		t1.val2=10;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		//4
		b2=new Bolita();
		b2.valor=4;
		t=new Tupla();
		t.val1=1;
		t.val2=2;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=5;
		t1.val2=6;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		
		t=new Tupla();
		t.val1=7;
		t.val2=11;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=8;
		t1.val2=13;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//5
		b2=new Bolita();
		b2.valor=5;
		t=new Tupla();
		t.val1=8;
		t.val2=12;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=9;
		t1.val2=14;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		

		//6
		b2=new Bolita();
		b2.valor=6;
		t=new Tupla();
		t.val1=9;
		t.val2=13;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=10;
		t1.val2=15;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		
		t=new Tupla();
		t.val1=1;
		t.val2=3;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=4;
		t1.val2=5;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//7
		b2=new Bolita();
		b2.valor=7;
		t=new Tupla();
		t.val1=2;
		t.val2=4;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=8;
		t1.val2=9;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//8
		b2=new Bolita();
		b2.valor=8;
		t=new Tupla();
		t.val1=3;
		t.val2=5;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=9;
		t1.val2=10;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//9
		b2=new Bolita();
		b2.valor=9;
		t=new Tupla();
		t.val1=2;
		t.val2=5;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=7;
		t1.val2=8;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//10
		b2=new Bolita();
		b2.valor=10;
		t=new Tupla();
		t.val1=3;
		t.val2=6;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=8;
		t1.val2=9;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//11
		b2=new Bolita();
		b2.valor=11;
		t=new Tupla();
		t.val1=4;
		t.val2=7;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=12;
		t1.val2=13;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);	
		
		//12
		b2=new Bolita();
		b2.valor=12;
		t=new Tupla();
		t.val1=5;
		t.val2=8;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=13;
		t1.val2=14;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//13
		b2=new Bolita();
		b2.valor=13;
		t=new Tupla();
		t.val1=4;
		t.val2=8;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=6;
		t1.val2=9;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);	
		t=new Tupla();
		t.val1=11;
		t.val2=12;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=14;
		t1.val2=15;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//14
		b2=new Bolita();
		b2.valor=14;
		t=new Tupla();
		t.val1=5;
		t.val2=9;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=12;
		t1.val2=13;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
		
		//15
		b2=new Bolita();
		b2.valor=15;
		t=new Tupla();
		t.val1=6;
		t.val2=10;
		tup.put(t, b2.valor);
		b2.tuplas.add(t);
		t1=new Tupla();
		t1.val1=13;
		t1.val2=14;
		tup.put(t1, b2.valor);
		b2.tuplas.add(t1);
		bolitas.put(b2.valor, b2);
	}
	
	public void funcion(Tablero tab){
		Set<Integer>ll=new HashSet<Integer>(tab.llenos);
		Set<Integer>v=new HashSet<Integer>(tab.vacios);
		for(Tupla t:tab.tuplas){
			if(tab.llenos.contains(t.val1)&&tab.llenos.contains(t.val2)){
				

				
				ll.add(tup.get(t));
				ll.remove(t.val1);
				ll.remove(t.val2);
				
				v.add(t.val1);
				v.add(t.val2);
				v.remove(tup.get(t));
				List<Tupla>tupl=new ArrayList<Tupla>();
				for(Integer in:v){
					for(Tupla tt:bolitas.get(in).tuplas){
						tupl.add(tt);
					}
					
				}
				Tablero t1=new Tablero();
				t1.llenos=ll;
				t1.vacios=v;
				t1.tuplas=tupl;
				t1.padre=tab;
				Arco a=new Arco();
				a.papa=tab;
				a.hijo=t1;
				tab.adj.add(a);
				arcos.add(a);
				funcion(t1);
				nodosT.add(t1);
			}
			
		}
		
		
	}
	
	public void funcion2(Tablero tab){
		Tablero t1=new Tablero();
		Arco a=new Arco();
		Set<Integer>ll=new HashSet<Integer>();
		Set<Integer>v=new HashSet<Integer>();
		for(Tupla t:tab.tuplas){
			if(tab.llenos.contains(t.val1)&&tab.llenos.contains(t.val2)){
				
				ll=new HashSet<Integer>(tab.llenos);
				v=new HashSet<Integer>(tab.vacios);
				
				ll.add(tup.get(t));
				ll.remove(t.val1);
				ll.remove(t.val2);
				
				v.add(t.val1);
				v.add(t.val2);
				v.remove(tup.get(t));
				List<Tupla>tupl=new ArrayList<Tupla>();
				for(Integer in:v){
					for(Tupla tt:bolitas.get(in).tuplas){
						//if(ll.contains(tt.val1)&&ll.contains(tt.val2)){
							tupl.add(tt);
						
					}
					
				}
				t1=new Tablero();
				t1.llenos=ll;
				t1.vacios=v;
				t1.tuplas=tupl;
				t1.padre=tab;
				a=new Arco();
				a.papa=tab;
				a.hijo=t1;
				tab.adj.add(a);
				arcos.add(a);
				funcion2(t1);
				nodosT.add(t1);
			}
			
		}
		
		
	}
	
	public Set<Integer> calcularLlenosInicial(Integer n){
		Set<Integer>respuesta=new HashSet<Integer>();
		for(int i=1;i<16;i++){
			if(i!=n){
				respuesta.add(i);
			}
		}
		return respuesta;
	}
	public void calcularNodoFinal(){
		Tablero fin=new Tablero();
		fin.llenos=null;
		fin.vacios=null;
		fin.nombre="Final";
		fin.padre=null;
		
		for(int i=0;i<nodosT.size();i++){
			if(nodosT.get(i).llenos.size()==1){
				Arco a=new Arco();
				a.hijo=fin;
				a.papa=nodosT.get(i);
				nodosT.get(i).adj.add(a);
				arcos.add(a);
			}
		}
		nodosT.add(fin);
	}
	public static void main(String[] args) {
		Principal test=new Principal();
		String origen = JOptionPane.showInputDialog ( "Ingrese el primer pin vacio" ); 
		Integer inicial=0;
		inicial=Integer.parseInt(origen.trim());
		
		Set<Integer>llenos=test.calcularLlenosInicial(inicial);
		Set<Integer>vacios=new HashSet<Integer>();
		
		//System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		vacios.add(inicial);
		//System.out.println("qqwwwwwwwwwwwwwwqqqqqqqqqqqqqqqqqqq");
		Tablero padre=new Tablero();
		//System.out.println("qeeaaaaaaaaaaaaaaaaaaaaeeeeqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		padre.llenos=llenos;
		//System.out.println("qeeeeeeeeeeeeeeqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		padre.vacios=vacios;
		padre.nombre="Inicial";
		//System.out.println("qqqqqq222222222222qqqqqqqqqqqqqqqqqqq");
		Bolita bp=test.bolitas.get(inicial);
		//System.out.println("qqq33333333333333qqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		for(Tupla tu:bp.tuplas){
		padre.tuplas.add(tu);
		}
		padre.padre=null;
		
		test.funcion2(padre);
		test.nodosT.add(padre);
		test.calcularNodoFinal();
		for(int i=0;i<test.nodosT.size();i++){
			test.nodosT.get(i).id=i;
			if(!test.nodosT.get(i).nombre.equals("Inicial")&&!test.nodosT.get(i).nombre.equals("Final")){
				test.nodosT.get(i).nombre=test.nodosT.get(i).id+"";
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!"+test.nodosT.size());
		
		
		
		JFrame parentFrame = new JFrame();
		 
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");   
		 
		int userSelection = fileChooser.showSaveDialog(parentFrame);
		 
		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File fileToSave = fileChooser.getSelectedFile();
		    
		    try {

				String content = "This is the content to write into file";

				File file = fileToSave;

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("N:[");
				bw.newLine();
				for(Tablero n:test.nodosT){
					bw.write("\""+n.nombre+"\"");
					bw.newLine();
				}
				bw.write("]");
				bw.newLine();
				
				bw.write("c:[");
				bw.newLine();
				for(Arco a:test.arcos){
					bw.write("(\""+a.papa.nombre+"\",\""+a.hijo.nombre+"\")"+a.costo);
					bw.newLine();
				}
				bw.write("]");
				bw.newLine();
				
				bw.write("b:[");
				bw.newLine();
				for(int i=0;i<test.nodosT.size();i++){
					Tablero n=test.nodosT.get(i);
					if(i==(test.nodosT.size()-2)){
						
						bw.write("(\""+n.nombre+"\""+")"+1);
						bw.newLine();
					}
					else if(i==(test.nodosT.size()-1)){
						bw.write("(\""+n.nombre+"\""+")"+-1);
						bw.newLine();
					}
					else{
						bw.write("(\""+n.nombre+"\""+")"+0);
						bw.newLine();
					}
				}
				bw.write("]");
				bw.close();

				JOptionPane.showMessageDialog (null, "El archivo se guardo con los parametros satisfactoriamente.", "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);

			} catch (IOException e) {
				JOptionPane.showMessageDialog (null, "Uppss! no se pudo guardar bien tu archivo, vuelve a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);

			}
		    
		    
		}
		
		
		
		double t1=System.currentTimeMillis();
		DIKBD_Graph gr=new DIKBD_Graph(test.nodosT.size());
		for(int i=0;i<test.nodosT.size();i++){
			gr.addVertex(new DIKBD_Vertex(i));
			
		}
		
		for(int i=0;i<test.arcos.size();i++){
			gr.addWeightedEdge(gr.getVertexByID(test.arcos.get(i).papa.id), gr.getVertexByID(test.arcos.get(i).hijo.id), 1, 0);
			
		}
		DIKBD al=new DIKBD(gr, test.nodosT.size()-2);
		al.runAlgDist();
		double t2=System.currentTimeMillis();
		double t=(t2-t1)/1000;
		String aa =gr.getPath(test.nodosT.size()-1);
		System.out.println(aa);
		String[]split=aa.split(" , ");
		String respMost="El tiempo computacional (seg) fue: "+t+"\nEl numero minimo de movimientos es: "+(split.length-1-1)+".\nLas jugadas son:\n";
		for (int i = 0; i < split.length-1; i++) {
			//System.out.println(split[i]);
			System.out.println(test.nodosT.get(Integer.parseInt(split[i])).toString());
			respMost+=test.nodosT.get(Integer.parseInt(split[i])).toString()+"\n";
		}
		//JOptionPane.showMessageDialog (null, respMost,"Error", JOptionPane.ERROR_MESSAGE);
		JTextArea textArea = new JTextArea(respMost);
		JScrollPane scrollPane = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scrollPane.setPreferredSize( new Dimension( 200, 500 ) );
		JOptionPane.showMessageDialog(null, scrollPane, "Movimientos",JOptionPane.INFORMATION_MESSAGE);
//		List<String[]>respDijkstra=new ArrayList<String[]>();
//		List<Vertex>path=Dijkstra.example(test.nodosT,"Inicial","Final");				
//		for(Tablero ta:test.nodosT){
//			for(Arco ar:ta.adj){
//				if(ar.hijo.nombre.equals("Final")){
//
//					System.out.println("Nodo llenos: "+ta.llenos);
//					System.out.println("Nodo vacios: "+ta.vacios);
//				System.out.println("      Arco papa: "+ar.papa);
//				System.out.println("      Arco hijo: "+ar.hijo);
//				System.out.println("      Arco costo: "+ar.costo);}
//			}
//		}

		
//		String mess="El minimo numero de movimientos "+path.get(path.size()-1).minDistance+".";
//		System.out.println(mess);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
