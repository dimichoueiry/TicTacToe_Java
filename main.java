import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static ArrayList<Integer> pos_x = new ArrayList<Integer>();
	public static ArrayList<Integer> pos_o = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] grid = {{' ','|',' ','|',' '},
		 			     {'-', '+', '-', '+','-'},
		 			     {' ','|',' ','|',' '},
		 			     {'-', '+', '-', '+','-'},
		 			     {' ','|',' ','|',' '}}; 
		
		
		while(true){
			buildGrid(grid);
			position_x(grid);
			buildGrid(grid);
			checkWinner();
			position_o(grid);
			buildGrid(grid);
			checkWinner();			
		}	 
	}
	
	// Build the grid
	public static void buildGrid(char[][] grid) {
		

		for(int i = 0; i<grid.length; i++) {
			 for(int j = 0; j<grid[i].length; j++) {
				 System.out.print(grid[i][j]);
				 
			 }
			 System.out.println();
			 
		}
	}
	
	//insert positions for X
	public static void position_x(char[][] grid) {
		
		//takes in user input (numbers from 1-9)
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your next move: ");
		int pos = sc.nextInt();
		
		switch(pos) {
			case 1:
				grid[0][0] = 'x';
				pos_x.add(1);
				break;
			case 2:
				grid[0][2] = 'x';
				pos_x.add(2);
				break;
			case 3:
				grid[0][4] = 'x';
				pos_x.add(3);
				break;
			case 4:
				grid[2][0] = 'x';
				pos_x.add(4);
				break;
			case 5:
				grid[2][2] = 'x';
				pos_x.add(5);
				break;
			case 6:
				grid[2][4] = 'x';
				pos_x.add(6);
				break;
			case 7:
				grid[4][0] = 'x';
				pos_x.add(7);
				break;
			case 8:
				grid[4][2] = 'x';
				pos_x.add(8);
				break;
			case 9:
				grid[4][4] = 'x';
				pos_x.add(9);
				break;
			default:
				break;
		}

		}
		
		
	// insert positions for O
	public static void position_o(char[][] grid) {
			
			//takes in user input (numbers from 1-9)
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter your next move: ");
			int pos = sc.nextInt();
			
			switch(pos) {
				case 1:
					grid[0][0] = 'O';
					pos_o.add(1);
					break;
				case 2:
					grid[0][2] = 'O';
					pos_o.add(2);
					break;
				case 3:
					grid[0][4] = 'O';
					pos_o.add(3);
					break;
				case 4:
					grid[2][0] = 'O';
					pos_o.add(4);
					break;
				case 5:
					grid[2][2] = 'O';
					pos_o.add(5);
					break;
				case 6:
					grid[2][4] = 'O';
					pos_o.add(6);
					break;
				case 7:
					grid[4][0] = 'O';
					pos_o.add(7);
					break;
				case 8:
					grid[4][2] = 'O';
					pos_o.add(8);
					break;
				case 9:
					grid[4][4] = 'O';
					pos_o.add(9);
					break;
				default:
					break;

			}
	}
	
	//create win conditions
	public static String checkWinner() {
		List<Integer> cond1 = Arrays.asList(1, 2, 3);
		List<Integer> cond2 = Arrays.asList(4, 5, 6);
		List<Integer> cond3 = Arrays.asList(7, 8, 9);
		List<Integer> cond4 = Arrays.asList(1, 4, 7);
		List<Integer> cond5 = Arrays.asList(2, 5, 8);
		List<Integer> cond6 = Arrays.asList(3, 6, 9);
		List<Integer> cond7 = Arrays.asList(1, 5, 9);
		List<Integer> cond8 = Arrays.asList(3, 5, 7);
		
		ArrayList<List> allConds = new ArrayList();
		allConds.add(cond1);
		allConds.add(cond2);
		allConds.add(cond3);
		allConds.add(cond4);
		allConds.add(cond5);
		allConds.add(cond6);
		allConds.add(cond7);
		allConds.add(cond8);
		
		
		for(List l: allConds) {
			//check pos_x for win conditions
			if(pos_x.containsAll(l)) {
				System.out.println("Congrats X, you won!");
				System.exit(0);
			}
			
			//check pos_o for win conditions
			else if(pos_o.containsAll(l)) {
				System.out.println("Congrats o, you won!");
				System.exit(0);
			}
			
			else {
				continue;
			}
		}
		

		return "";
	}

	
	
	

}
	