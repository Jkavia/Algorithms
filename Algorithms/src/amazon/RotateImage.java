package amazon;

public class RotateImage {

	public static void main(String[] args) {

		int[][] image = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] rotatedImage = rotateimage(image);

		for (int i = 0; i < rotatedImage.length; i++) {
			for (int j = 0; j < rotatedImage[i].length; j++) {
				System.out.print(rotatedImage[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] rotateimage(int[][] image) {
		if (image == null || image.length == 0 || image.length != image[0].length) {
			return null;
		}
		int len = image.length - 1;
		for (int i = 0; i < image.length; i++) {
			for (int j = i; j < image[i].length - (i + 1); j++) {
				int temp = image[j][len - i];
				image[j][len - i] = image[i][j]; // 02 = 00

				int temp2 = image[len - i][len - j];// 22
				image[len - i][len - j] = temp;// 22=02

				temp = image[len - j][i];// 20
				image[len - j][i] = temp2;// 20=22

				image[i][j] = temp;// 00=20
			}
		}

		return image;
	}

}
