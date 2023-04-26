//package com.text.test;
//import org.apache.poi.*;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.List;
///**
// * created by sheting on 旺仔
// */
//public class toWord {
//
//
//        public static void main(String[] args) {
//            try {
//                // 加载Excel文件
//                InputStream excelInputStream = new FileInputStream("userList.xlsx");
//                Workbook workbook = new XSSFWorkbook(excelInputStream);
//                Sheet sheet = workbook.getSheetAt(0);
//
//                // 创建Word文档
//                XWPFDocument document = new XWPFDocument();
//                OutputStream wordOutputStream = new FileOutputStream("userList.docx");
//                XWPFTable table = document.createTable();
//
//                // 复制Excel文件内容到Word表格中
//                for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//                    XWPFTableRow row = table.createRow();
//                    for (int j = 0; j < sheet.getRow(0).getPhysicalNumberOfCells(); j++) {
//                        Cell cell = sheet.getRow(i).getCell(j);
//                        String cellValue = "";
//                        if (cell != null) {
//                            switch (cell.getCellType()) {
//                                case STRING:
//                                    cellValue = cell.getStringCellValue();
//                                    break;
//                                case NUMERIC:
//                                    cellValue = String.valueOf(cell.getNumericCellValue());
//                                    break;
//                                case BOOLEAN:
//                                    cellValue = String.valueOf(cell.getBooleanCellValue());
//                                    break;
//                                case FORMULA:
//                                    cellValue = String.valueOf(cell.getCellFormula());
//                                    break;
//                                default:
//                                    cellValue = "";
//                                    break;
//                            }
//                        }
//                        row.createCell().setText(cellValue);
//                    }
//                }
//
//                // 将Word文档写入文件
//                document.write(wordOutputStream);
//                wordOutputStream.close();
//
//                System.out.println("Excel文件内容已成功复制到Word文件中：userList.docx");
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//
//}
