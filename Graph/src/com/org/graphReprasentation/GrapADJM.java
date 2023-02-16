package com.org.graphReprasentation;

public class GrapADJM {
	private boolean adjMat[][];
	private int numOfVer;
	
	public GrapADJM(int numOfVer) {
		this.numOfVer=numOfVer;
		adjMat=new boolean[numOfVer][numOfVer];
		
	}
	
	// Add edges
	  public void addEdge(int i, int j) {
	    adjMat[i][j] = true;
	    adjMat[j][i] = true;
	  }
	  
	  public String toString() {
		    StringBuilder s = new StringBuilder();
		    for (int i = 0; i < numOfVer; i++) {
		      s.append(i + ": ");
		      for (boolean j : adjMat[i]) {
		        s.append((j ? 1 : 0) + " ");
		      }
		      s.append("\n");
		    }
		    return s.toString();
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrapADJM g = new GrapADJM(4);

	    g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);

	    System.out.print(g.toString());
	  }

	}
	
	 

	  


