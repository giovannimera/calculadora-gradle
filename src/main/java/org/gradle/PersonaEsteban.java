package org.gradle;

public class PersonaEsteban {
	private String nombre,apellido,telefono;
	
 public void Setnombre(String nom){
	 this.nombre =nom; 
 }
 
 public void Setapellido(String ape){
	 this.apellido =ape; 
 }
 
 public void Settel(String tel){
	 this.telefono =tel; 
 }
 


 public String GetNombre(){
	 return this.nombre; 
	 
 } 
 

 public String GetApellido(){
	 
	 return this.apellido;
 }
 
 
 public String GetTel(){
	 
	 return this.telefono;
 }
 
 
}
