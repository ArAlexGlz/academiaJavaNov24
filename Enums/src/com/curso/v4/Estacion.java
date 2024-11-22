package com.curso.v4;

public enum Estacion {
	
	INVIERNO {
		@Override
		String getDescipcion() {
			return "Muy frio";
		}
	},
	PRIMAVERA {
		@Override
		String getDescipcion() {
			return null;
		}
	},
	OTONIO {
		@Override
		String getDescipcion() {
			return null;
		}
	},
	VERANO {
		@Override
		String getDescipcion() {
			return null;
		}
	};
	
	abstract String getDescipcion();

}
