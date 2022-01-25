package model;

import Utils.Maths;

public class Dado {
	private int nFaces;
	
	public Dado(int nFaces) {
		if(nFaces>1) {
			this.nFaces=nFaces;
		}else {
			this.nFaces=6;
		}
	}
	public Dado() {
		this(6);
	}
	public int getnFaces() {
		return nFaces;
	}
	public void setnFaces(int nFaces) {
		this.nFaces = nFaces;
	}
	public int throwValue() {
		return Maths.generateRandom(1, nFaces);
	}
	
}
