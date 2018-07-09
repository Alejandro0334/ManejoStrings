/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejostrings;

/**
 *
 * @author Alejandro
 */
public class ManejoStrings {

    public void buttfer(){
        StringBuffer buffer = new StringBuffer("Pruebas ");
        
        int cantRegist = buffer.length();
        buffer.insert(cantRegist, "Unitarias");
        
        System.out.println(buffer);
        
    }
        
    public void builder(){
    StringBuilder builder = new StringBuilder("Equipos de selecion:"
            + "1.Belgica"
            + "2.Peru"
            + "4.Argentina ");
        
        int cantRegist = builder.indexOf("4.Argentina");
        
        builder.insert(cantRegist, "3.Colombia");
        
        System.out.println(builder);
    }
    
    public void divisionXCero(){
     
        try {
            int num1 = 2;
            int num2 = 0;
            
            if(num2==0)
            {
                throw  new DivisionXCero("Error al dividir por cero");
            }
            
            int div = num1/num2;
            
        } catch (DivisionXCero ex) {
            System.err.println(ex.getMessage());
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
      ManejoStrings ME = new ManejoStrings();
      
      ME.buttfer();
      ME.builder();
      ME.divisionXCero();
    }
    
}
