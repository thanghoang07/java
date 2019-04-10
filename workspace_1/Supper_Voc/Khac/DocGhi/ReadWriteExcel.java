package DocGhi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadWriteExcel {

	private final String fileName = "testGhiFileXlsx.xls";

	// data to write file
	private Object[][] data = { { "STT", "Ho va ten", "Diem", "Xep loai", "Tuoi" },
			{ "1", "Nguyen Van Quan", "9.0", "", "20" }, { "2", "Pham Thi Ha", "8.0", "", "22" },
			{ "3", "Nguyen Ba Cuong", "8.5", "", "20" }, { "4", "Vu Công Tinh", "9.0", "", "22" },
			{ "5", "Pham Trong Khang", "8", "", "20" }, { "6", "Mai Van Tai", "8", "", "20" } };

	// create and write new file *.xls
	private void writeFileExcel() {
		WritableWorkbook workbook;
		// create workbook
		try {
			workbook = Workbook.createWorkbook(new File(fileName));
			// create sheet
			WritableSheet sheet1 = workbook.createSheet("GhiFile", 0);
			// create Label and add to sheet
			sheet1.addCell(new Label(0, 0, "Danh sach: "));
			// row begin write data
			int rowBegin = 2;
			int colBegin = 0;
			for (int row = rowBegin, i = 0; row < data.length + rowBegin; row++, i++) {
				for (int col = colBegin, j = 0; col < data[0].length + colBegin; col++, j++) {
					Object obj = data[i][j];
					sheet1.addCell(new Label(col, row, (String) data[i][j]));
				}
			}
			// write file
			workbook.write();
			// close
			workbook.close();
		} catch (IOException e) {
			System.out.println("Loi tao tap tin\n" + e.toString());
		} catch (RowsExceededException e) {
			System.out.println("Loi ghi tap tin\n" + e.toString());
		} catch (WriteException e) {
			System.out.println("Loi ghi tap tin\n" + e.toString());
		}
		System.out.println("Tao va ghi thanh cong");
	}

	// open and read file *.xls
	private void readFileExcel() {
		Workbook workbook;
		try {
			// create workbook to open file
			workbook = Workbook.getWorkbook(new File(fileName));
			// get sheet want read
			Sheet sheet = workbook.getSheet(0);
			// get number row and col contain data
			int rows = sheet.getRows();
			int cols = sheet.getColumns();
			System.out.println("Data in file:");
			// read data in each cell
			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < cols; col++) {
					Cell cell = sheet.getCell(col, row);
					System.out.print(cell.getContents() + "\t");
				}
				System.out.println("\n");
			}
			// close
			workbook.close();
		} catch (BiffException e) {
			System.out.println("Khong tim thay file\n" + e.toString());
		} catch (IOException e) {
			System.out.println("Khong tim thay file\n" + e.toString());
		}
	}

	// open and write file is exists
	private void openAndWriteFileExcel() {
		Workbook workbook;
		WritableWorkbook writeWorkbook;
		try {
			// open file
			workbook = Workbook.getWorkbook(new File(fileName));
			// create file copy of root file to write file
			writeWorkbook = Workbook.createWorkbook(new File(fileName), workbook);
			// get sheet to write
			WritableSheet sheet1 = writeWorkbook.getSheet(0);
			int col = 3;
			int rowBegin = 3;
			// write data (formula)
			for (int row = rowBegin; row < data.length + rowBegin - 1; row++) {
				Formula f = new Formula(col, row, "IF(C" + (row + 1) + ">8, \"Xuat sac\", \"Gioi\")");
				sheet1.addCell(f);
			}
			writeWorkbook.write();
			// close
			writeWorkbook.close();
		} catch (IOException e) {
			System.out.println("Khong tim thay file\n" + e.toString());
		} catch (RowsExceededException e) {
			System.out.println("Khong tim thay file\n" + e.toString());
		} catch (WriteException e) {
			System.out.println("Khong tim thay file\n" + e.toString());
		} catch (BiffException e) {
			System.out.println("Khong tim thay file\n" + e.toString());
		}
		System.out.println("Mo va ghi file thanh cong");
	}

	private void showMenu() {
		System.out.println();
		System.out.println("Chon mot so de thuc hien: ");
		System.out.println("1 - Tao moi file Excel va ghi vao du lieu");
		System.out.println("2 - Doc file Excel vua tao");
		System.out.println("3 - Mo va ghi du lieu vao file Excel");
	}

	public static void main(String[] args) {
		ReadWriteExcel rwExcel = new ReadWriteExcel();
		while (true) {
			rwExcel.showMenu();
			Scanner scan = new Scanner(System.in);
			int select = Integer.parseInt(scan.nextLine());
			switch (select) {
			case 1:
				rwExcel.writeFileExcel();
				break;
			case 2:
				rwExcel.readFileExcel();
				break;
			case 3:
				rwExcel.openAndWriteFileExcel();
				break;
			default:
				scan.close();
				break;
			}
		}
	}
}
