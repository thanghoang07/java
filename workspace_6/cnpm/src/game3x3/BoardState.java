package game3x3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1 - Max -Computer - hien thi so 1
// 2- Min - Uszer - hien thi so 2

public class BoardState {

	List<Node> availablePoints; // danh sach nhung Vi Tri rong co the danh
	int[][] board = new int[3][3];
	List<Node> rootsChildrenScore = new ArrayList<>();// danh sach nhung vi tri
	// con

	// Danh danh gia
	public int evaluateBoard() {
		int score = 0;

		// Cac dong
		for (int i = 0; i < 3; ++i) {
			int blank = 0;
			int X = 0;
			int O = 0;
			for (int j = 0; j < 3; ++j) {
				if (board[i][j] == 0) {
					blank++;
					
				} else if (board[i][j] == 1) {
					X++;
				} else {
					O++;
				}
			}
			score += changeInScore(X, O);
		}

		// Cac cot
		for (int j = 0; j < 3; ++j) {
			int blank = 0;
			int X = 0;
			int O = 0;
			for (int i = 0; i < 3; ++i) {
				if (board[i][j] == 0) {
					blank++;
				} else if (board[i][j] == 1) {
					X++;
				} else {
					O++;
				}
			}
			score += changeInScore(X, O);
		}

		int blank = 0;
		int X = 0;
		int O = 0;

		// Duong cheo 1
		for (int i = 0, j = 0; i < 3; ++i, ++j) {
			if (board[i][j] == 1) {
				X++;
			} else if (board[i][j] == 2) {
				O++;
			} else {
				blank++;
			}
		}

		score += changeInScore(X, O);

		blank = 0;
		X = 0;
		O = 0;

		// Duong cheo 2
		for (int i = 2, j = 0; i > -1; --i, ++j) {
			if (board[i][j] == 1) {
				X++;
			} else if (board[i][j] == 2) {
				O++;
			} else {
				blank++;
			}
		}

		score += changeInScore(X, O);

		return score;
	}

	// Cach tinh diem de danh gia
	private int changeInScore(int X, int O) {
		int change;
		if (X == 3) {// X is Max
			change = 100;
		} else if (X == 2 && O == 0) {
			change = 10;
		} else if (X == 1 && O == 0) {
			change = 1;
		}

		else if (O == 3) {// O is Min
			change = -100;
		} else if (O == 2 && X == 0) {
			change = -10;
		} else if (O == 1 && X == 0) {
			change = -1;
		} else {
			change = 0;
		}
		return change;
	}

	// function MIN-VALUE(state)
	public int MIN_VALUE(List<Integer> list) {// 2 ng

		int min = Integer.MAX_VALUE;
		int index = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) < min) {
				min = list.get(i);
				index = i;
			}
		}
		return list.get(index);
	}

	// function MAX-VALUE(state)
	public int MAX_VALUE(List<Integer> list) {// 1 may
		int max = Integer.MIN_VALUE;
		int index = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) > max) {
				max = list.get(i);
				index = i;
			}
		}

		return list.get(index);
	}

	// Gioi han chieu sau tim kiem
	int uptoDepth = 2;

	public int alphaBetaMinimax(int[][] start, int alpha, int beta, int depth, int turn) {

		if (depth == uptoDepth || isGameOver()) {
			return evaluateBoard();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		List<Node> p = getAvailableStates();// tìm ra các vị trí chưa có ai đánh
		System.out.println(p.size());
		if (p.isEmpty())
			return 0;
		// duyệt qua các vị trí trống xem vị trí nào có điểm max lớn nhất (đối
		// với máy), vị trí nào có điểm min nhất (đối với ngưỿi chơi)
		for (int i = 0; i < p.size(); i++) {
			Node point = p.get(i);
			int currentScore = 0;
			if (turn == 1) {// máy 2đánh
				placeAMove(point, 1);
				currentScore = minimax(start, depth + 1, 2);
				max = Math.max(currentScore, max);
				if (depth == 0)
					rootsChildrenScore.add(new Node(currentScore, point));

			} else if (turn == 2) {
				placeAMove(point, 2);
				currentScore = minimax(start, depth + 1, 1);
				min = Math.min(currentScore, min);

			}
		
			board[point.x][point.y] = 0;// reset lại vị trí point

		}

		if (turn == 1)
			return max;// nếu là máy đánh thì trả vỿ max
		return min;


		
	}

	public int minimax(int[][] start, int depth, int turn) {
		if (depth == uptoDepth || isGameOver()) {
			return evaluateBoard();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		List<Node> p = getAvailableStates();// tìm ra các vị trí chưa có ai đánh
		System.out.println(p.size());
		if (p.isEmpty())
			return 0;
		// duyệt qua các vị trí trống xem vị trí nào có điểm max lớn nhất (đối
		// với máy), vị trí nào có điểm min nhất (đối với ngưỿi chơi)
		for (int i = 0; i < p.size(); i++) {
			Node point = p.get(i);
			int currentScore = 0;
			if (turn == 1) {// máy 2đánh
				placeAMove(point, 1);
				currentScore = minimax(start, depth + 1, 2);
				max = Math.max(currentScore, max);
				if (depth == 0)
					rootsChildrenScore.add(new Node(currentScore, point));

			} else if (turn == 2) {
				placeAMove(point, 2);
				currentScore = minimax(start, depth + 1, 1);
				min = Math.min(currentScore, min);

			}
		
			board[point.x][point.y] = 0;// reset lại vị trí point

		}

		if (turn == 1)
			return max;// nếu là máy đánh thì trả vỿ max
		return min;

	}

	// Khong con vi tri de di chuyen
	public boolean isGameOver() {

		return (hasXWon() || hasOWon() || getAvailableStates().isEmpty());
	}

	// X thang (Max)
	public boolean hasXWon() {
		
		if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == 1)
				|| (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == 1)) {
			

			return true;
		}
		for (int i = 0; i < 3; ++i) {
			if (((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == 1)
					|| (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == 1))) {
				

				return true;
			}
		}
		return false;
	}

	// O thang (Min)
	public boolean hasOWon() {
		
		if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == 2)
				|| (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == 2)) {
			

			return true;
		}
		for (int i = 0; i < 3; ++i) {
			if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == 2)
					|| (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == 2)) {
				

				return true;
			}
		}

		return false;
	}

	// Nhung vi tri rong co the danh
	public List<Node> getAvailableStates() {
		availablePoints = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (board[i][j] == 0) {
					availablePoints.add(new Node(i, j));
				}
			}
		}
		return availablePoints;
	}

	// bat dau danh (chan quan doi phuong)
	public void placeAMove(Node point, int player) {
		board[point.x][point.y] = player; // player = 1 for X, 2 for O
	}

	// Tim buoc di tot nhat
	public Node returnBestMove() {
		int MAX = Integer.MIN_VALUE;
		int best = Integer.MIN_VALUE;

		for (int i = 0; i < rootsChildrenScore.size(); ++i) {
			if (MAX < rootsChildrenScore.get(i).score) {
				MAX = rootsChildrenScore.get(i).score;
				
				best = i;
			}
		}
		Node tmp = rootsChildrenScore.get(best).pos;
		rootsChildrenScore.clear();
		return tmp;
	}

	// Nhap vao vi tri tu ban phim
	void takeHumanInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your move: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		Node point = new Node(x, y);
		placeAMove(point, 2);
	}

	// Hien thi ban co
	public void displayBoard() {
		System.out.println();

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(board[i][j] + "\t ");
			}
			System.out.println();

		}
	}

}