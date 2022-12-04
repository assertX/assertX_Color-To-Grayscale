# assertX_Color_To_Grayscale
In this assignment, you are going to write a program that converts a color image to grayscale image.  Your program reads in an image in PPM format, converts each pixel's color data to grayscale, then writes them to an output PPM image file.

## In order to see the ppm, click the ppm link and hit download or view raw. It will show all the text values.

Your program reads in a PPM image file as input (filename: colorImage.ppm).  PPM is an image format which uses text to represent images.  Please see an example below.

In PPM images, each pixel's color is the combination of 3 values, red, green, and blue.  Each value is an integer between 0 and 255.  This way to represent the color of a pixel is called RGB Color.

In the first line, the "P3" is a "magic constant" identifying this file as a PPM image.  The second line contains 2 integers, which represent the dimensions of the image.  In the example above, the image has 800 pixels per row and 600 rows.  The third line contains a single integer, which represents the color depth.  In the example above, the red, green, and blue values for each pixel range from 0 to 255.

Starting from the next line, data of the colors of pixels are listed, which is in the row-major order: red value of the first pixel, green value of the first pixel, blue value of the first pixel, red value of the second pixel, green value of the second pixel, blue value of the second pixel, and so on.  All values are separated by whitespaces.  Please note that the PPM standard does not require line breaks any place in particular (or at all); spaces, tabs, or newlines, in any combination, can separate items.  In this assignment, the input image uses line breaks to separate data, one color value per line.

In this assignment, you cannot assume (or guess) the dimensions of the input image.  In other words, no matter it is a 50-by-50 image or 2560-by-1440 image, your program should correctly process it and generate correct output image.
