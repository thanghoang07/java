package game5x5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BoardState {

	List<Node> availablePoints;
	Scanner scan = new Scanner(System.in);
	int[][] board = new int[5][5];

	List<Node> rootsChildrenScore = new ArrayList<>();

	public int evaluateBoard() {
		int score = 0;
		// tính điểm băng cách đếm quân x o
		// kt tât cả hàng
		for (int i = 0; i < 5; ++i) {
			int blank = 0;
			int X = 0;
			int O = 0;
			for (int j = 0; j < 5; ++j) {
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

		// kt tất cả cột
		for (int j = 0; j < 5; ++j) {
			int blank = 0;
			int X = 0;
			int O = 0;
			for (int i = 0; i < 5; ++i) {
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

		// kt đường chéo 1
		for (int i = 0, j = 0; i < 5; ++i, ++j) {
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

		// kt đưuong chéo 2
		for (int i = 4, j = 0; i > -1; --i, ++j) {
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

	// quy tắt tính điểm
	private int changeInScore(int X, int O) {
		int change;
		if (X == 5) {
			change = 200;
		} else if (X == 4 && O == 0) {
			change = 60;

		} else if (X == 3 && O == 0) {
			change = 30;

		} else if (X == 2 && O == 0) {
			change = 5;

		} else if (X == 1 && O == 0) {
			change = 1;
		} else if (O == 5) {
			change = -200;
		} else if (O == 4 && X == 0) {
			change = -60;
		} else if (O == 3 && X == 0) {
			change = -30;
		} else if (O == 2 && X == 0) {
			change = -5;
		} else if (O == 1 && X == 0) {
			change = -1;
		} else {
			change = 0;
		}
		return change;
	}

	// chiều sâu giới hạn
	int uptoDepth = 5;

	public int alphaBetaMinimax(int alpha, int beta, int depth, int turn) {
		// gán giá trị để tí cắt tỉa
		if (beta <= alpha) {
			// System.out.println("dang cat tia tai chieu sau = "+depth);
			if (turn == 1)
				return Integer.MAX_VALUE; // chọn max ,chọn min
			else
				return Integer.MIN_VALUE;
		}

		if (depth == uptoDepth || isGameOver())
			return evaluateBoard(); // duyet xong den chiu sau thi in the co ra

		List<Node> pointsAvailable = getAvailableStates();

		if (pointsAvailable.isEmpty())
			return 0;

		if (depth == 0)
			rootsChildrenScore.clear();

		int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;

		for (int i = 0; i < pointsAvailable.size(); ++i) {
			Node point = pointsAvailable.get(i);

			int currentScore = 0;

			if (turn == 1) {// luot choi may
				placeAMove(point, 1);
				currentScore = alphaBetaMinimax(alpha, beta, depth + 1, 2); // tim
																			// nước
																			// đi
				maxValue = Math.max(maxValue, currentScore);

				// gán anlpha
				alpha = Math.max(currentScore, alpha);

				if (depth == 0)
					rootsChildrenScore.add(new Node(currentScore, point));

			} else if (turn == 2) {// luot choi ng
				placeAMove(point, 2);
				currentScore = alphaBetaMinimax(alpha, beta, depth + 1, 1); // tim
																			// nước
																			// đi567yu8i90-
				minValue = Math.min(minValue, currentScore);

				// gan beta
				beta = Math.min(currentScore, beta);

			}
			// reset board
			board[point.x][point.y] = 0;

			// cắt nhánh
			if (currentScore == Integer.MAX_VALUE || currentScore == Integer.MIN_VALUE)
				break;
		}
		// cóa thể dùng if(beta<=alpha) break; return currentScore; ở 2 người
		// chơi

		return turn == 1 ? maxValue : minValue;
	}

//	public int minimax(int[][] start, int depth, int turn) {
//		if (isGameOver())
//			return evaluateBoard();
//
//		List<Node> pointsAvailable = getAvailableStates();
//		if (pointsAvailable.isEmpty())
//			return 0;
//
//		if(depth == 0)
//			rootsChildrenScore.clear();
//		List<Integer> scores = new ArrayList<>();
//
//		for (int i = 0; i < pointsAvailable.size(); ++i) {
//			Node point = pointsAvailable.get(i);
//
//			if (turn == 1) { // X's turn select the highest from below minimax()
//				// call
//				placeAMove(point, 1);
//				int currentScore = minimax(start, depth + 1, 2);
//				scores.add(currentScore);
//
//				if (depth == 0)
//					rootsChildrenScore.add(new Node(currentScore, point));
//
//			} else if (turn == 2) {// O's turn select the lowest from below
//				// minimax() call
//				placeAMove(point, 2);
//				scores.add(minimax(start, depth + 1, 1));
//			}
//			board[point.x][point.y] = 0; // Reset this point
//		}
//		if (turn == 1)
//			return MAX_VALUE(scores);
//		return MIN_VALUE(scores);
//
//	}
	
	public boolean isGameOver() {
		// kiểm tra game có bị ai thắng không, hay hết bàn cờ để đi
		return (hasXWon() || hasOWon() || getAvailableStates().isEmpty());
	}

	public boolean hasXWon() {
		if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3]
				&& board[0][0] == board[4][4] && board[0][0] == 1)
				|| (board[0][4] == board[1][3] && board[0][4] == board[2][2] && board[0][4] == board[3][1]
						&& board[0][4] == board[4][0] && board[0][4] == 1)) {
			// kiem tra 2 đường chéo
			return true;
		}
		for (int i = 0; i < 5; ++i) {
			if (((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == board[i][3]
					&& board[i][0] == board[i][4] && board[i][0] == 1)
					|| (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == board[3][i]
							&& board[0][i] == board[4][i] && board[0][i] == 1))) {
				// kiểm tra theo côt và hàng
				return true;
			}
		}
		return false;
	}

	public boolean hasOWon() {
		if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3]
				&& board[0][0] == board[4][4] && board[0][0] == 2)
				|| (board[0][4] == board[1][3] && board[0][4] == board[2][2] && board[0][4] == board[3][1]
						&& board[0][4] == board[4][0] && board[0][4] == 2)) {
			// kiem tra 2 đường chéo
			return true;
		}
		for (int i = 0; i < 5; ++i) {
			if (((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == board[i][3]
					&& board[i][0] == board[i][4] && board[i][0] == 2)
					|| (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == board[3][i]
							&& board[0][i] == board[4][i] && board[0][i] == 2))) {
				// kiểm tra theo côt và hàng
				return true;
			}
		}
		return false;
	}

	// các nước đi tieps== tim bằng thử các o trống chưa đi
	public List<Node> getAvailableStates() {
		availablePoints = new ArrayList<>();
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (board[i][j] == 0) {
					availablePoints.add(new Node(i, j));
				}
			}
		}
		return availablePoints;
	}

	public void placeAMove(Node point, int player) {
		board[point.x][point.y] = player; // player = 1 la quan X, 2 là quân O
	}

	public Node returnBestMove() {
		int MAX = -100000;
		int best = -1;

		for (int i = 0; i < rootsChildrenScore.size(); ++i) {
			if (MAX < rootsChildrenScore.get(i).score) {
				MAX = rootsChildrenScore.get(i).score;
				best = i;
			}
		}

		return rootsChildrenScore.get(best).pos;
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

	void takeHumanInput() {
		System.out.println("ban đi: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		Node point = new Node(x, y);
		placeAMove(point, 2);
	}

	// hien thi ban co
	public void displayBoard() {
		System.out.println();

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.print(board[i][j] + "\t ");
			}
			System.out.println();

		}
	}

	// reset ban co
	public void resetBoard() {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				board[i][j] = 0;
			}
		}
	}
}
