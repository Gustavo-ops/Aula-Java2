
public class MetodoMatematico {
	public double menorValor(double num1, double num2){
		
		if(num1<num2){
			return num1;
		} else {
			return num2;
		}
	}


	public double menorValorEntreTresValores(double num1, double num2, double num3){((num1<num2)&&(num1<num3)){
			return num1;
		}else if((num2<num1)&&(num2<num3)){
			return num2;
		}else{
			return num3;
		}
	}

	public double mediaTresValores(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	
	public double areaDoTriangulo(double altura, double base) {
		return (base*altura)/2;
	}
}
