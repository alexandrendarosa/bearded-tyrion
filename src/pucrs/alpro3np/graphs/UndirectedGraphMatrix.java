package pucrs.alpro3np.graphs;

import java.util.ArrayList;

public class UndirectedGraphMatrix extends AbstractGraphMatrix implements UndirectedGraph {
	
	@Override
	public void addEdge(String strOrig, String strDest, int peso) {
		int posOrig = names.indexOf(strOrig);
		int posDest = names.indexOf(strDest);
		matrix[posOrig][posDest] = peso;
		matrix[posDest][posOrig] = peso;
	}

}









