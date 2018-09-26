public class Tester { 
  public char [] [] arrTTT = new char [3] [3];
        arrTTT [0][0] = 'x';
        arrTTT [2][0] = 'o';
        arrTTT [2][2] = 'x';
        arrTTT [1][1] = 'o';
        arrTTT [0][2] = 'x';
        arrTTT [0][1] = 'o';
        arrTTT [1][2] = 'x';
        System.out.println(" x wins!");

  	
	public static int [] getResized(int[] smArr){
		int [] bigArr = new int [arrSm.length + 2];
		for(int i = 0; i < arrSm.length; i++){
			arrBig[i] = arrSM[i];
		}
		return arrBig;
	}	
