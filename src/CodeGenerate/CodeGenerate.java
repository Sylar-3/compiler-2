package CodeGenerate;

import Visitor.Symbol;
import Visitor.SymbolTable;

import java.io.*;

public class CodeGenerate {
    SymbolTable symbolTable;

    public CodeGenerate(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    String page;

    public void ConvertToHTML(int j) throws IOException {

        FileWriter fileWriter = null;
        String destination = "html\\converted-";
        if (j == 0) {
            fileWriter = new FileWriter(destination + j + ".html");
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println("symbolTable.symbolsList");
            System.out.println(symbolTable.symbolsList);
            for (int i = 0; i < symbolTable.symbolsList.size(); i++) {
                Symbol symbol = symbolTable.symbolsList.get(i);
                switch (symbol.symbol.replaceAll("/s", "")) {
                    case "title":
                        stringBuilder.append("<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "<head>\n" +
                                "  <title>" + symbolTable.symbolsList.get(i + 2).symbol + "</title>\n"
                        );
                        break;
                    case "labelText":
                        stringBuilder.append(
                                "  <main>\n" +
                                        "    <form action=\"localhost\\project/1.php\" method=\"get\">\n" +
                                        "      <label for=\"" + symbolTable.symbolsList.get(i + 1).symbol.toLowerCase() + "\">" + symbolTable.symbolsList.get(i + 1).symbol.toLowerCase() + ":</label>\n" +
                                        "      <input type=\"" + symbolTable.symbolsList.get(i + 1).symbol.toLowerCase() + "\" id=\"" + symbolTable.symbolsList.get(i + 1).symbol.toLowerCase() + "\" name=\""
                                        + symbolTable.symbolsList.get(i + 1).symbol.toLowerCase() +
                                        "\" placeholder=\"Enter your " + symbolTable.symbolsList.get(i + 1).symbol + "\">\n" +
                                        "      <br>\n");
                    case "Text":
                        if (symbolTable.symbolsList.get(i - 1).symbol.equals("              child")) {
                            stringBuilder.append(
                                    "<html>\n" +
                                            " <body>\n" +
                                            "  </main>\n" +
                                            "    </form>\n" +
                                            "      <button type=\"submit\">"
                                            + symbolTable.symbolsList.get(i + 1).symbol.replaceAll("\'", "")
                                            + "</button>\n" +
                                            "    </form>\n" +
                                            "  </main>\n" +
                                            " </body>\n" +
                                            "</html>\n");
                        }
                        break;
                }
            }
            fileWriter.append(String.valueOf(stringBuilder));
            fileWriter.close();
        }
        if (j == 1) {
            fileWriter = new FileWriter(destination + j + ".php");
            boolean ht, w, c;
            ht = false;
            w = false;
            c = false;
            StringBuilder stringBuilder1 = new StringBuilder();
            for (int h = 0; h < symbolTable.symbolsList.size(); h++) {
                Symbol sympol1 = symbolTable.symbolsList.get(h);
                switch (sympol1.symbol.replaceAll("/s", "")) {
                    case "title":
                        stringBuilder1.append("<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "<head>\n" +
                                "  <title>" + symbolTable.symbolsList.get(h + 2).symbol + "</title>\n"

                        );
                        page = symbolTable.symbolsList.get(h + 2).symbol;

                        break;
                    case "Column":
                        if (symbolTable.symbolsList.get(h - 1).symbol.equals("                  child")) {
                            stringBuilder1.append("    <style>.container {");

                            for (int i = h; i < symbolTable.symbolsList.size(); i++) {
                                if (!ht)
                                    if (symbolTable.symbolsList.get(i).symbol.equals("                        height") && !symbolTable.symbolsList.get(i - 1).symbol.equals("                      SizedBox")) {
                                        stringBuilder1.append(
                                                "      height: " + symbolTable.symbolsList.get(i + 1).symbol + "px;\n");
                                        ht = true;
                                    }
                                if (!w)
                                    if (symbolTable.symbolsList.get(i).symbol.equals("                        width")) {
                                        stringBuilder1.append("      width: " + symbolTable.symbolsList.get(i + 1).symbol + "px;\n");
                                        w = true;
                                    }
                                if (!c)
                                    if (symbolTable.symbolsList.get(i).symbol.equals("Colors")) {
                                        stringBuilder1.append("      background-color: " + symbolTable.symbolsList.get(i + 1).symbol + ";\n");
                                        c = true;

                                    }

                            }
                        }

                        break;

                    case "Text":
                        if (h + 2 < symbolTable.symbolsList.size()) {
                            if (symbolTable.symbolsList.get(h + 2).symbol.equals("                      Text")) {
                                stringBuilder1.append("      margin-bottom: 20px;" +
                                        "                                           }\n </style>\n");


                                stringBuilder1.append("</head>\n" +
                                        "<body>\n" +
                                        "  <h1><?php\n" +
                                        "$email=$_GET['email'];\n" +
                                        "echo \"" + page + "  $email \";\n" +
                                        "?> </h1>\n" +
                                        "  \n");
                                stringBuilder1.append("<main>\n" +
                                        "    <div style=\"display: flex; justify-content: center; align-items: flex-start; margin-top: 100px;\">\n" +
                                        "      <div>\n" +
                                        "        <p>" + symbolTable.symbolsList.get(h + 1).symbol + "</p>\n" +
                                        "        <div class=\"container\"></div>\n" +
                                        "        <br>\n" +
                                        "        <div class=\"container\"></div>\n" +
                                        "        <br>");
                            }
                            if (!symbolTable.symbolsList.get(h - 1).symbol.equals("          title"))
                                stringBuilder1.append("<a href=\"2.html\");\n" +
                                        "exit;\">\n" +
                                        "    <button>" + symbolTable.symbolsList.get(h + 1).symbol + "</button>\n" +
                                        "  </a>");
                            stringBuilder1.append(
                                    "      </div>\n" +
                                            "    </div>\n" +
                                            "  </main>\n" +
                                            "</body>\n" +
                                            "</html>");
                        }
//else if (symbolTable.symbol.get(h+2).symbol.equals("Text"))
                        break;
                }
            }
            fileWriter.append(String.valueOf(stringBuilder1));
            fileWriter.close();
        }
        if (j == 2) {
            fileWriter = new FileWriter(destination + j + ".html");

            StringBuilder stringBuilder2 = new StringBuilder();
            for (int m = 0; m < symbolTable.symbolsList.size(); m++) {
                Symbol sympol2 = symbolTable.symbolsList.get(m);
                switch (sympol2.symbol.replaceAll("/s", "")) {
                    case "title":
                        stringBuilder2.append("<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "<head>\n" +
                                "  <title>" + symbolTable.symbolsList.get(m + 2).symbol + "</title>\n"
                        );
                        break;
                    case "Column":
                        if (symbolTable.symbolsList.get(m - 1).symbol.equals("                  child")) {
                            stringBuilder2.append("    <style>.container {");

                            for (int i = m; i < symbolTable.symbolsList.size(); i++) {

                                if (symbolTable.symbolsList.get(i).symbol.equals("                        height") && !symbolTable.symbolsList.get(i - 1).symbol.equals("                      SizedBox")) {
                                    stringBuilder2.append(
                                            "      height: " + symbolTable.symbolsList.get(i + 1).symbol + "px;\n");
                                }
                                if (symbolTable.symbolsList.get(i).symbol.equals("                        width")) {
                                    stringBuilder2.append("      width: " + symbolTable.symbolsList.get(i + 1).symbol + "px;\n");
                                }
                                if (symbolTable.symbolsList.get(i).symbol.equals("Colors")) {
                                    stringBuilder2.append("      background-color: " + symbolTable.symbolsList.get(i + 1).symbol + ";\n");


                                }

                            }
                        }

                        break;

                    case "Icons":
                        stringBuilder2.append("      margin-bottom: 20px;" +
                                "                                           }\n </style>\n");
                        stringBuilder2.append("</head>\n" +
                                "<body>\n" +
                                "  <header>\n" +
                                "    <h1>My Home Screen</h1>\n" +
                                "  </header>");
                        stringBuilder2.append("<main>\n" +
                                "    <div style=\"display: flex; justify-content: center; align-items: flex-start; margin-top: 100px;\">\n" +
                                "      <div>\n" +
                                "        <p>" + symbolTable.symbolsList.get(m + 3).symbol.replaceAll("\'", "") + "</p>\n");


                        stringBuilder2.append(" <div class=\"container\">\n" +
                                "          <i class=\"material-icons\">" + symbolTable.symbolsList.get(m + 1).symbol + "</i>\n" +
                                "        </div>\n" +
                                "        <br>\n" +
                                "      </div>\n" +
                                "    </div>\n" +
                                "  </main>\n" +
                                "</body>\n" +
                                "</html>");
                        break;


                }
            }
            fileWriter.append(String.valueOf(stringBuilder2));
            fileWriter.close();
        }

    }

    public void generate(int i) throws IOException {
        if (i == 0) {
            String homeCode = readCodeFromFile("samples\\exampleOne.txt");
            String homeHtml = generateHtml(homeCode, "_HomePageState");
            writeCodeToFile(homeHtml, "html\\home.html");
        } else if (i == 1) {
            String loginCode = readCodeFromFile("samples\\exampleTwo.txt");
            String loginHtml = generateHtml(loginCode, "_LoginScreenState");
            writeCodeToFile(loginHtml, "html\\login.html");
        } else if (i == 2) {
            String detailsCode = readCodeFromFile("samples\\exampleThree.txt");
            String detailsPhp = generatePhp(detailsCode, "_DetailsState");
            writeCodeToFile(detailsPhp, "html\\details.php");
        }
    }

    private static String readCodeFromFile(String fileName) throws IOException {
        StringBuilder codeBuilder = new StringBuilder();
        System.out.println("before read");
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        System.out.println("after read");
        String line;
        while ((line = reader.readLine()) != null) {
            codeBuilder.append(line).append("\n");
        }
        reader.close();
        return codeBuilder.toString();
    }

    private static void writeCodeToFile(String code, String fileName) throws IOException {
        FileWriter writer = new FileWriter(new File(fileName));
        writer.write(code);
        writer.close();
    }

    private static String generateHtml(String code, String stateClassName) {
        String initStateCall = stateClassName + " " + stateClassName.toLowerCase() + " = "
                + "new " + stateClassName + "();\n" + stateClassName.toLowerCase() + ".initState();\n";
        String widgetCall = stateClassName.toLowerCase() + ".build(new BuildContext());\n";
        return "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n<title>Generated HTML</title>\n</head>\n<body>\n"
                + initStateCall + widgetCall + "</body>\n</html>";
    }

    private static String generatePhp(String code, String stateClassName) {
        String initStateCall = stateClassName + " " + stateClassName.toLowerCase() + " = "
                + "new " + stateClassName + "();\n" + stateClassName.toLowerCase() + ".initState();\n";
        String widgetCall = stateClassName.toLowerCase() + ".build(new BuildContext());\n";
        return "<?php\n" + initStateCall + widgetCall + "?>";
    }

}