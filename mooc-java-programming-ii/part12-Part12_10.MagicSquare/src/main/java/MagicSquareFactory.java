
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int width = square.getWidth();
        int height = square.getHeight();
        int middle = square.getWidth() / 2;
        int x = middle;
        int y = 0;
        for (int i = 1; i <= width * height; i++) {
            square.placeValue(x, y, i);
            int updatedX = x + 1;
            int updatedY = y - 1;

            if (updatedX > width - 1) {
                updatedX = 0;
            }
            if (updatedY < 0) {
                updatedY = height - 1;
            }

            if (square.readValue(updatedX, updatedY) <= 0) {
                x = updatedX;
                y = updatedY;
            } else {
                y++;
            }
        }
        return square;
    }

}
