package live_coding.mvc.presentation;

import java.util.Arrays;

public class DualColumnScreen implements Screen {

    private View leftColumn;
    private View rightColumn;

    public void setLeftColumn(View view) {
        this.leftColumn = view;
    }

    public void setRightColumn(View view) {
        this.rightColumn = view;
    }

    @Override
    public void print() {
        int leftColumnWidth = calculateWidth(leftColumn);
        int rightColumnWidth = calculateWidth(rightColumn);
        int height = calculateHeight(leftColumn, rightColumn);

        String[] leftColumnLines = leftColumn.render().split("\n");
        String[] rightColumnLines = rightColumn.render().split("\n");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n");

        for (int i = 0; i < (leftColumnWidth+rightColumnWidth+7); i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        for (int lineIdx = 0; lineIdx < height; lineIdx++) {
            stringBuilder.append("| ");
            String leftColumnLine = "";
            if (lineIdx < leftColumnLines.length) {
                leftColumnLine = leftColumnLines[lineIdx];
                stringBuilder.append(leftColumnLine);
            }
            for (int i = 0; i < (leftColumnWidth-leftColumnLine.length()); i++) {
                stringBuilder.append(" ");
            }

            stringBuilder.append(" | ");

            String rightColumnLine = "";
            if (lineIdx < rightColumnLines.length) {
                rightColumnLine = rightColumnLines[lineIdx];
                stringBuilder.append(rightColumnLine);
            }
            for (int i = 0; i < (rightColumnWidth-rightColumnLine.length()); i++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(" |\n");
        }

        for (int i = 0; i < (leftColumnWidth+rightColumnWidth+7); i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append(" \n");

        System.out.print(stringBuilder);
    }

    private int calculateWidth(View view) {
        int width = Arrays.stream(view.render().split("\n"))
                .mapToInt(String::length)
                .reduce((result, lineWidth) -> {
                    return lineWidth > result ? lineWidth : result;
                }).getAsInt();
        return width;
    }

    private int calculateHeight(View leftColumnView, View rightColumnView) {
        int leftColumnViewHeight = leftColumnView.render().split("\n").length;
        int rightColumnViewHeight = rightColumnView.render().split("\n").length;
        return leftColumnViewHeight > rightColumnViewHeight ? leftColumnViewHeight : rightColumnViewHeight;
    }

    ;
}
