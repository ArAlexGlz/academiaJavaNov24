package com.curso.v1;

//Clase principal (Product)
public class Casa {
	
	private String tipoTecho;
	private int numVentanas;
	private String colorParedes;
	
	Casa(){}

	// Constructor privado
	private Casa(Builder builder) {
		this.tipoTecho = builder.tipoTecho;
		this.numVentanas = builder.numVentanas;
		this.colorParedes = builder.colorParedes;
	}

// Métodos getter
// ...

	// Clase Builder
	public class Builder {
		private String tipoTecho;
		private int numVentanas;
		private String colorParedes;

		public Builder tipoTecho(String tipoTecho) {
			this.tipoTecho = tipoTecho;
			return this;
		}

		public Builder numVentanas(int numVentanas) {
			this.numVentanas = numVentanas;
			return this;
		}

		public Builder colorParedes(String colorParedes) {
			this.colorParedes = colorParedes;
			return this;
		}

		public Casa build() {
			return new Casa(this);
		}
	}
}