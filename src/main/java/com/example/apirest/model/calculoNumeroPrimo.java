package com.example.apirest.model;

public class calculoNumeroPrimo {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public String calcularNumeroPrimo(){
		int num = this.num;
        int cont = 0;
        for (int i = 1; i <= num ; i++ ){
          if (num%i == 0){
            cont ++;
          }
        }
        if(cont == 2){
            return (num + " es un numero primo");
        }
        else{
            return(num + " no es un numero primo");
        }
    }
}
